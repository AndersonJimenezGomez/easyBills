package com.easybills.domain;

import java.util.GregorianCalendar;

public class Bill {

    private int idBill;
    private GregorianCalendar datePurchase;
    private int valuePurchase;
    private Employee  Employee;

    public Bill() {
        super();
    }

    public Bill(int idBill, GregorianCalendar datePurchase, int valuePurchase, com.easybills.domain.Employee employee) {
        this.idBill = idBill;
        this.datePurchase = datePurchase;
        this.valuePurchase = valuePurchase;
        Employee = employee;
    }


    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public GregorianCalendar getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(GregorianCalendar datePurchase) {
        this.datePurchase = datePurchase;
    }

    public int getValuePurchase() {
        return valuePurchase;
    }

    public void setValuePurchase(int valuePurchase) {
        this.valuePurchase = valuePurchase;
    }

    public com.easybills.domain.Employee getEmployee() {
        return Employee;
    }

    public void setEmployee(com.easybills.domain.Employee employee) {
        Employee = employee;
    }
}
