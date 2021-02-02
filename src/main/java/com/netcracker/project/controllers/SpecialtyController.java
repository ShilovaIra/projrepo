package com.netcracker.project.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpecialtyController {

    @RequestMapping("/specialty")
    public String index(@RequestParam(name="name", required=false, defaultValue="engineering") String name,
                        @RequestParam(name="department", required = false) Long department_id, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("department", department_id);
        return "specialty " + name + ". Department id is " + department_id;
    }
}
