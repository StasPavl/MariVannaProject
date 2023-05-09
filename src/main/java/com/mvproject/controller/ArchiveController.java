package com.mvproject.controller;

import com.mvproject.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/archive")
public class ArchiveController {
    private final EmployeeService employeeService;

    public ArchiveController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String archive(Model model){
        model.addAttribute("employeeList", employeeService.findAll());
        return "/archive";
    }
}
