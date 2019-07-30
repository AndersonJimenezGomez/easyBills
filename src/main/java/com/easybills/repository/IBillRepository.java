package com.easybills.repository;

import com.easybills.entity.BillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBillRepository extends JpaRepository<BillEntity,Integer> {
}
