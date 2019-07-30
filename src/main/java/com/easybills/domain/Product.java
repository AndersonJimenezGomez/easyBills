package com.easybills.domain;

public class Product {

    private int idProduct;
    private String nameProduct;
    private int pricePurchase;
    private int priceSale;
    private int IVA;
    private String description;

    public Product(int idProduct, String nameProduct, int pricePurchase, int priceSale, int IVA, String description) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.pricePurchase = pricePurchase;
        this.priceSale = priceSale;
        this.IVA = IVA;
        this.description = description;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPricePurchase() {
        return pricePurchase;
    }

    public void setPricePurchase(int pricePurchase) {
        this.pricePurchase = pricePurchase;
    }

    public int getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(int priceSale) {
        this.priceSale = priceSale;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
