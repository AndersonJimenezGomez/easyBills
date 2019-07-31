package com.easybills.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.GregorianCalendar;

@Entity
@Table(name ="inventory")
@AllArgsConstructor
@NoArgsConstructor
public class InventoryEntity {

    @Id
    @Column(name = "id_inventory")
    @GeneratedValue
    private int idInventory;
    @Column(name="date_inventory")
    private GregorianCalendar dateInventory;

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
