package com.mvproject.converter;

import com.mvproject.dto.EmployeeDTO;
import com.mvproject.service.EmployeeService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConverter implements Converter<String, EmployeeDTO> {
    private final EmployeeService employeeService;

    public EmployeeConverter(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public EmployeeDTO convert(String source) {
        return employeeService.findById(source);
    }
}

