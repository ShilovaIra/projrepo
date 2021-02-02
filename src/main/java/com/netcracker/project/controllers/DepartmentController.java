package com.netcracker.project.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @RequestMapping("/department")
    public String index(@RequestParam(name="name", required=false, defaultValue="AMM") String name,
                        @RequestParam(name="parent", required = false) Long id, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("parent", id);
        return "department " + name + " has parent id = " + id;
    } // /department?name=PHARM&parent=12 - получение 2х и параметров из строки
}
