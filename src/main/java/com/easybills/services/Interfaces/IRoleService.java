package com.easybills.services.Interfaces;

import com.easybills.domain.Role;
import com.easybills.entity.RoleEntity;
import org.springframework.stereotype.Component;

import java.util.List;


public interface IRoleService  {

    List<Role> listAll();

    void save(Role role);

    Role findById(int id);

    void deleteById(int id);

    void update(Role role);
}
