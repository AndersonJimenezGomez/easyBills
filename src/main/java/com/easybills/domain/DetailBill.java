package com.easybills.domain;

public class DetailBill {

    private int idDetailBill;
    private Product product;
    private Bill bill;
    private int quantityProduct;

    public DetailBill(int idDetailBill, Product product, Bill bill, int quantityProduct) {
        this.idDetailBill = idDetailBill;
        this.product = product;
        this.bill = bill;
        this.quantityProduct = quantityProduct;
    }


    public int getIdDetailBill() {
        return idDetailBill;
    }

    public void setIdDetailBill(int idDetailBill) {
        this.idDetailBill = idDetailBill;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }
}
