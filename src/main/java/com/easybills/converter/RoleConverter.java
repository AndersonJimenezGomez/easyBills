package com.easybills.converter;

import com.easybills.domain.Role;
import com.easybills.entity.RoleEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RoleConverter {



    public Role entityToModel(RoleEntity roleEntity) {
        Role role;
        if(roleEntity == null) {
            role = null;
        }
        else {
            role = new Role (roleEntity.getIdRole(),roleEntity.getRole());
        }
        return role;
    }

    public RoleEntity modelToEntity(Role role) {
        RoleEntity entidad = new RoleEntity();
        entidad.setIdRole(role.getIdRole());
        entidad.setRole(role.getRole());
        return entidad;
    }

    public List<Role> entityToModel(List<RoleEntity> roleEntityList) {
        List<Role> roleList = new ArrayList<Role>(roleEntityList.size());
        roleEntityList.forEach((entity) -> {
            roleList.add(entityToModel(entity));
        });
        return roleList;
    }
}
