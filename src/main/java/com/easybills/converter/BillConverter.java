package com.easybills.converter;

import com.easybills.domain.Bill;
import com.easybills.domain.Role;
import com.easybills.entity.BillEntity;
import com.easybills.entity.RoleEntity;

import java.util.ArrayList;
import java.util.List;

public class BillConverter {

    public Bill entityToModel(BillEntity billEntity) {
        Bill bill;
        if(billEntity == null) {
            bill = null;
        }
        else {
            bill = new Bill (billEntity.getIdBill(),billEntity.getDatePurchase(), billEntity.getValuePurchase(),billEntity.getEmployee());
        }
        return bill;
    }

    public BillEntity modelToEntity(Bill bill) {
        BillEntity billEntity = new BillEntity();
        billEntity.setIdBill(bill.getIdBill());
        billEntity.setDatePurchase(bill.getDatePurchase());
        billEntity.setValuePurchase(bill.getValuePurchase());
        billEntity.setEmployee(bill.getEmployee());
        return billEntity;
    }

    public List<Bill> entityToModel(List<BillEntity> billEntityList) {
        List<Bill> billList = new ArrayList<Bill>(billEntityList.size());
        billEntityList.forEach((entity) -> {
            billList.add(entityToModel(entity));
        });
        return billList;
    }

}
