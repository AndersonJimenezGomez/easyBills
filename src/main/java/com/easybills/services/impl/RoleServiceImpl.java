package com.easybills.services.impl;

import com.easybills.converter.RoleConverter;
import com.easybills.domain.Role;
import com.easybills.repository.IRoleRepository;
import com.easybills.services.Interfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleRepository roleRepository;
    @Autowired
    private RoleConverter roleConverter;


    @Override
    public List<Role> listAll() {
        return roleConverter.entityToModel(roleRepository.findAll());
    }

    @Override
    public void save(Role role) {
        roleRepository.save(roleConverter.modelToEntity(role));
    }

    @Override
    public Role findById(int id) {
        return roleConverter.entityToModel(roleRepository.findById(id).orElse(null));
    }

    @Override
    public void deleteById(int id) {

        roleRepository.deleteById(id);

    }

    @Override
    public void update(Role role) {
        roleRepository.save(roleConverter.modelToEntity(role));
    }
}
