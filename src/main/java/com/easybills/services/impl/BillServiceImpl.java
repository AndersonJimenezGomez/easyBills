package com.easybills.services.impl;

import com.easybills.converter.BillConverter;
import com.easybills.domain.Bill;
import com.easybills.entity.BillEntity;
import com.easybills.repository.IBillRepository;
import com.easybills.services.Interfaces.IBillService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BillServiceImpl implements IBillService {

    @Autowired
    IBillRepository billRepository;
    @Autowired
    BillConverter billConverter;


    @Override
    public List<Bill> listAll() {
        return billConverter.entityToModel(billRepository.findAll());
    }

    @Override
    public Bill findById(int id) {
        return billConverter.entityToModel(billRepository.findById(id).orElse(null));
    }

    @Override
    public void deleteById(int id) {

        billRepository.deleteById(id);

    }

    @Override
    public void save(Bill bill) {
        billRepository.save(billConverter.modelToEntity(bill));
    }

    @Override
    public void update(Bill bill) {

        billRepository.save(billConverter.modelToEntity(bill));

    }
}
