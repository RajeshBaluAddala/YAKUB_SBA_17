package com.yakub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int qty;
    private double total;
    private double discount;
    private double gst;
    private double serviceChgs;
    private double invoice;


    public Product() {
    }

    public Product(int id, String name, double price, int qty, double total, double discount, double gst, double serviceChgs, double invoice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.total = total;
        this.discount = discount;
        this.gst = gst;
        this.serviceChgs = serviceChgs;
        this.invoice = invoice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public double getServiceChgs() {
        return serviceChgs;
    }

    public void setServiceChgs(double serviceChgs) {
        this.serviceChgs = serviceChgs;
    }

    public double getInvoice() {
        return invoice;
    }

    public void setInvoice(double invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", total=" + total +
                ", discount=" + discount +
                ", gst=" + gst +
                ", serviceChgs=" + serviceChgs +
                ", invoice=" + invoice +
                '}';
    }
}
