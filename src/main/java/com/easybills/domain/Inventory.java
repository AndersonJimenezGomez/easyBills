package com.easybills.domain;

import java.util.GregorianCalendar;

public class Inventory {

    private int idInventory;
    private GregorianCalendar dateInventory;

    public Inventory(int idInventory, GregorianCalendar dateInventory) {
        this.idInventory = idInventory;
        this.dateInventory = dateInventory;
    }


    public int getIdInventory() {
        return idInventory;
    }

    public void setIdInventory(int idInventory) {
        this.idInventory = idInventory;
    }

    public GregorianCalendar getDateInventory() {
        return dateInventory;
    }

    public void setDateInventory(GregorianCalendar dateInventory) {
        this.dateInventory = dateInventory;
    }
}
