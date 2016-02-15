package ru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.dao.User;
import ru.services.UserService;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Controller
public class MainController {

    @Resource(name="userService")
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(@RequestParam(value = "page", required = false) Integer page, Model model){
        if (page == null) page = 1;
        List<User> users = userService.getAll(page);
        model.addAttribute("users", users);
        model.addAttribute("page", page);
        return "main";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAdd(Model model){
        model.addAttribute("userAttribute", new User());
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("userAttribute") User user){
        user.setCreatedDate(new Timestamp(new Date().getTime()));
        userService.add(user);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete")
    public String delete(@RequestParam(value="id") int id){
        userService.delete(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String getEdit(@RequestParam(value="id") int id, Model model){
        model.addAttribute("userAttribute", userService.get(id));
        return "edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String edit(@ModelAttribute("userAttribute") User user){
        userService.edit(user);
        return "redirect:/";
    }

    @RequestMapping(value = "searchForm", method = RequestMethod.GET)
    public String searchForm(){
        return "search";
    }

    @RequestMapping(value="/search", method = RequestMethod.GET)
    public String search(Model model,
                         @RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "page", required = false) Integer page,
                         @RequestParam(value = "id", required = false) Integer id,
                         @RequestParam(value = "age", required = false) Integer age,
                         @RequestParam(value = "isAdmin", required = false) Boolean isAdmin){

        if (page == null) page = 1;
        List<User> users = userService.search(id, name, age, isAdmin, page);
        if (users.size() != 0) {
            model.addAttribute("users", users);
            model.addAttribute("page", page);
            model.addAttribute("name", name);
        }
        else return "emptyResult";
        return "searchResult";
    }
}
