package com.netcracker.project.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/course")
    public String index(@RequestParam(name="name", required=false, defaultValue="1st") String name, Model model) {
        model.addAttribute("name", name);
        return "course " + name;
    }
}
