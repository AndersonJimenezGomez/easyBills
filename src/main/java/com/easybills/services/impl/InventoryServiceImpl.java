package com.easybills.services.impl;

import com.easybills.converter.InventoryConverter;
import com.easybills.domain.Inventory;
import com.easybills.repository.IInventoryRepository;
import com.easybills.services.Interfaces.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InventoryServiceImpl implements IInventoryService {

    @Autowired
    IInventoryRepository inventoryRepository;
    @Autowired
    InventoryConverter inventoryConverter;


    @Override
    public List<Inventory> listAll() {
        return inventoryConverter.entityToModel(inventoryRepository.findAll());
    }

    @Override
    public void save(Inventory inventory) {
        inventoryRepository.save(inventoryConverter.modelToEntity(inventory));
    }

    @Override
    public Inventory findById(int id) {
        return inventoryConverter.entityToModel(inventoryRepository.findById(id).orElse(null));
    }

    @Override
    public void uodate(Inventory inventory) {
        inventoryRepository.save(inventoryConverter.modelToEntity(inventory));
    }

    @Override
    public void deleteById(int id) {
        inventoryRepository.deleteById(id);
    }
}
