package com.mvproject.service.impl;

import com.mvproject.dto.EmployeeDTO;
import com.mvproject.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl extends AbstractMapService<EmployeeDTO,String> implements EmployeeService {

    //employee id => SSN
    @Override
    public EmployeeDTO save(EmployeeDTO employee) {
        return super.save(employee.getSSN(), employee);
    }

    @Override
    public EmployeeDTO findById(String SSN) {
        return super.findById(SSN);
    }

    @Override
    public List<EmployeeDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void update(EmployeeDTO object) {
        super.update(object.getSSN(), object);
    }

    @Override
    public void deleteById(String SSN) {
        super.deleteById(SSN);
    }
}
