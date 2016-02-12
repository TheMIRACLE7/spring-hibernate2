package ru.controllers;

import org.hibernate.Session;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.dao.PersonEntity;
import ru.utils.HibernateSessionFactory;

@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(ModelMap model){
        model.addAttribute("message", "Hello");
        return "main";
    }

    public static void main(String[] args) {
        System.out.println("Hibernate tutorial");

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();

        PersonEntity contactEntity = new PersonEntity();

        contactEntity.setFirstName("Nick");
        contactEntity.setLastName("VN");
        contactEntity.setMoney(123);

        session.save(contactEntity);
        session.getTransaction().commit();

        session.close();
    }
}
