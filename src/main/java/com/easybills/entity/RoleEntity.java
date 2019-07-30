package com.easybills.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="role")
//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleEntity {

    @Id
    @Column(name="id_role")
    @GeneratedValue
    private int idRole;
    @Column(name="role", nullable = false, length = 45)
    private String role;

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
