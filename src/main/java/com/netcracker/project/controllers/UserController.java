package com.netcracker.project.controllers;

import com.netcracker.project.models.Users;
import com.netcracker.project.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    //@Autowired
    private UserServiceImpl userService = new UserServiceImpl();

//    @RequestMapping("/user")
//        public String index(@RequestParam(name="first_name", required = false) String firstName,
//                            @RequestParam(name="surname", required = false) String surname,
//                            @RequestParam(name="patronymic", required = false) String patronymic,
//                            @RequestParam(name="email", required = false) String email,
//                            @RequestParam(name="login", required = false) String login,
//                            @RequestParam(name="phone", required = false) String phone,
//                            Model model) {
//            model.addAttribute("first_name", firstName);
//            model.addAttribute("surname",surname);
//            model.addAttribute("patronymic", patronymic);
//            model.addAttribute("email", email);
//            model.addAttribute("login", login);
//            model.addAttribute("phone", phone);
//            return "user: " + firstName + " " + surname + " " + patronymic + " " + email + " " + login + " " + phone;
//        }

    @GetMapping("/")
    public String index() {
        return "userTemp";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String hello(Model model, @RequestParam(defaultValue = "") String searchName) {
        List<Users> users = userService.getAll();

        List<Users> filterList = users.stream()
                .filter(p -> p.getFirst_name().contains(searchName))
                .collect(Collectors.toList());
        model.addAttribute("users", filterList);
        model.addAttribute("lastSearch", searchName);
        return "userTemp";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model, @ModelAttribute("users") Users users) {
        List<Users> usersList = (List<Users>) userService.addUser(users);
        model.addAttribute("users", usersList);
        return "userTemp";
    }

    //@Autowired UserRepository userRepository;
//
//    public String showUsers(Model model, Pageable pageable) {
//        model.addAttribute("users", userRepository.findAll(pageable));
//        return "users";
//    }

    //private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();
//
//    @GetMapping ("/user")
//    public String users(@RequestParam(value = "name", required = false,
//            defaultValue = "World") String name, Model model) {
//       // Users u = new Users(counter.incrementAndGet(), String.format(template, name));
//        //return u.getFirst_name();
//        model.addAttribute("msg", "Hello " + name);
//        return "users";
//    }

}
