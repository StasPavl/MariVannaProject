package com.mvproject.controller;

import com.mvproject.bootstrap.DataGenerator;
import com.mvproject.dto.EmployeeDTO;
import com.mvproject.enums.State;
import com.mvproject.service.EmployeeService;
import com.mvproject.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private final RoleService roleService;
    private final EmployeeService employeeService;

    public EmployeeController(RoleService roleService, EmployeeService employeeService) {
        this.roleService = roleService;
        this.employeeService = employeeService;
    }

    @GetMapping
    public String createEmployee(Model model){
        model.addAttribute("employee", new EmployeeDTO());
        model.addAttribute("roleList", roleService.findAll());
        model.addAttribute("stateList", State.values());
        return "/employee";
    }
    @PostMapping("/create")
    public String creteEmployee(@ModelAttribute("employee") EmployeeDTO employee, Model model){
        model.addAttribute("roleList", roleService.findAll());
        model.addAttribute("stateList", State.values());

        employeeService.save(employee);


        return "redirect:/employee";
    }
}
