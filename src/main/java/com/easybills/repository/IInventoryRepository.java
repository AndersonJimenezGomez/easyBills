package com.easybills.repository;

import com.easybills.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInventoryRepository extends JpaRepository<InventoryEntity, Integer> {

}
