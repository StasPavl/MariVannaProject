package com.mvproject.service.impl;

import com.mvproject.dto.RoleDTO;
import com.mvproject.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl extends AbstractMapService<RoleDTO,Long> implements RoleService {
    @Override
    public RoleDTO save(RoleDTO user) {
        return super.save(user.getId(), user);
    }

    @Override
    public RoleDTO findById(Long id) {
        return super.findById(id);
    }

    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void update(RoleDTO role) {
        super.update(role.getId(),role);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
