package com.david.curso.springboot.di.factura.springboo_difactura.models;

public class Item {

    private Product product;
    private Integer quatity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuatity() {
        return quatity;
    }

    public void setQuatity(Integer quatity) {
        this.quatity = quatity;
    }

}
