package com.easybills.entity;


import com.easybills.domain.Employee;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.GregorianCalendar;

@Entity
@Table(name = "bill")
@AllArgsConstructor
@NoArgsConstructor
public class BillEntity {

    @Id
    @Column(name ="id_bill")
    @GeneratedValue
    private int idBill;
    @Column(name = "date_purchase")
    private GregorianCalendar datePurchase;
    @Column(name = "value_purchase")
    private int valuePurchase;
    @OneToMany(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "id_employee_fk")
    private Employee employee;


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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
