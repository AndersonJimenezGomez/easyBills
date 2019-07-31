package com.easybills.converter;

import com.easybills.domain.Inventory;
import com.easybills.entity.InventoryEntity;

import java.util.ArrayList;
import java.util.List;

public class InventoryConverter {





    public Inventory entityToModel(InventoryEntity inventoryEntity) {
        Inventory inventory;
        if(inventoryEntity == null) {
            inventory = null;
        }
        else {
            inventory = new Inventory (inventoryEntity.getIdInventory(), inventoryEntity.getDateInventory());
        }
        return inventory;
    }

    public InventoryEntity modelToEntity(Inventory inventory) {
        InventoryEntity inventoryEntity= new InventoryEntity();
        inventoryEntity.setIdInventory(inventory.getIdInventory());
        inventoryEntity.setDateInventory(inventory.getDateInventory());
        return inventoryEntity;
    }

    public List<Inventory> entityToModel(List<InventoryEntity> inventoryEntityList) {
        List<Inventory> inventoryList = new ArrayList<Inventory>(inventoryEntityList.size());
        inventoryEntityList.forEach((entity) -> {
            inventoryList.add(entityToModel(entity));
        });
        return inventoryList;
    }
}
