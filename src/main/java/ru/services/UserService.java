package ru.services;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dao.User;
import ru.utils.HibernateSessionFactory;

import java.util.List;

@Service("userService")
@Transactional
public class UserService {

    private SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();

    public List<User> getAll(int page){
        System.out.println("              ***           ");
        System.out.println("Мы в методе getAll()");
        System.out.println("              ***           ");


        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<User> users = session.createQuery("from User ")
                .setFirstResult((page-1)*10)
                .setMaxResults(10)
                .list();
        session.getTransaction().commit();
        session.close();
        return users;
    }

    public User get(int id){
        System.out.println("              ***           ");
        System.out.println("Мы в методе get()");
        System.out.println("              ***           ");

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        session.getTransaction().commit();
        session.close();
        return user;
    }

    public void add(User user){
        System.out.println("              ***           ");
        System.out.println("Мы в методе add()");
        System.out.println("              ***           ");

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

    public void delete(int id){
        System.out.println("              ***           ");
        System.out.println("Мы в методе delete()");
        System.out.println("              ***           ");

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(get(id));
        session.getTransaction().commit();
    }

    public void edit(User user){
        System.out.println("              ***           ");
        System.out.println("Мы в методе edit()");
        System.out.println("              ***           ");

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();
    }

    public List<User> search(Integer id, String name, Integer age, Boolean isAdmin, int page){
        System.out.println("              ***           ");
        System.out.println("Мы в методе search(Integer id, String name, Integer age, Boolean isAdmin, int page)");
        System.out.println("              ***           ");

        Session session = sessionFactory.openSession();

        Criteria criteria = session.createCriteria(User.class);

        if (id != null) criteria.add(Restrictions.eq("id", id));
        if (!name.isEmpty()) criteria.add(Restrictions.eq("name", name));
        if (age != null) criteria.add(Restrictions.eq("age", age));
        if (isAdmin != null) criteria.add(Restrictions.eq("admin", isAdmin));

        criteria.setFirstResult((page-1)*10)
                .setMaxResults(10);
        List<User> users = criteria.list();

        session.close();
        return users;
    }
}
