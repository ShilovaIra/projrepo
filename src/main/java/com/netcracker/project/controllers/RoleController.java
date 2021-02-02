package com.netcracker.project.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @RequestMapping("/role")
    public String index(@RequestParam(name="name", required=false, defaultValue="student") String name, Model model) {
        model.addAttribute("name", name);
        return "role " + name;
    }
}
