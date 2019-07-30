package com.easybills.services.Interfaces;

import com.easybills.domain.Bill;

import java.util.List;

public interface IBillService {

    List<Bill> listAll();
    Bill findById(int id);
    void deleteById(int id);
    void save(Bill bill);
    void update(Bill bill);
}
