package com.easybills.domain;

public class DetailInventory {

    private int detailInventory;
    private int quantityProduct;
    private Product product;
    private Inventory inventory;

    public DetailInventory(int detailInventory, int quantityProduct, Product product, Inventory inventory) {
        this.detailInventory = detailInventory;
        this.quantityProduct = quantityProduct;
        this.product = product;
        this.inventory = inventory;
    }


    public int getDetailInventory() {
        return detailInventory;
    }

    public void setDetailInventory(int detailInventory) {
        this.detailInventory = detailInventory;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
