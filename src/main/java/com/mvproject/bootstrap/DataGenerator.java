package com.mvproject.bootstrap;

import com.mvproject.dto.RoleDTO;
import com.mvproject.service.RoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {
    private final RoleService roleService;

    public DataGenerator(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public void run(String... args) throws Exception {
        RoleDTO bartender =new RoleDTO(1L,"Bartender");
        RoleDTO server =new RoleDTO(2L,"Server");
        RoleDTO manager =new RoleDTO(3L,"Manager");
        RoleDTO dishwasher =new RoleDTO(4L,"Dishwasher");
        RoleDTO busser =new RoleDTO(5L,"Busser");
        RoleDTO runner =new RoleDTO(6L,"Runner");
        RoleDTO chef =new RoleDTO(7L,"Chef");
        RoleDTO cook =new RoleDTO(8L,"Cook");

        roleService.save(bartender);
        roleService.save(server);
        roleService.save(manager);
        roleService.save(dishwasher);
        roleService.save(busser);
        roleService.save(runner);
        roleService.save(chef);
        roleService.save(cook);


    }

}
