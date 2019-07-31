package com.easybills.services.Interfaces;


import com.easybills.domain.Inventory;

import java.util.List;

public interface IInventoryService {

    List<Inventory> listAll();
    void save(Inventory inventory);
    Inventory findById(int id);
    void uodate(Inventory inventory);
    void deleteById(int id);

}
