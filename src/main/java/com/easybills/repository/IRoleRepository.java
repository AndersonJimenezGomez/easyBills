package com.easybills.repository;

import com.easybills.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.io.Serializable;


@Repository
@Transactional
public interface IRoleRepository extends JpaRepository <RoleEntity, Integer> {

}
