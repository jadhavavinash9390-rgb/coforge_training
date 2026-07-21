package com.coforge.pms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "pid")
    @Positive(message = "Product Id must be greater than 0")
    private int pid;

    @Column(name = "pname", length = 30)
    @NotBlank(message = "Product Name cannot be blank")
    private String pname;

    @Column(name = "price")
    @Positive(message = "Product Price must be greater than 0")
    private double price;

    @Column(name = "quantity")
    @Positive(message = "Product Quantity must be greater than 0")
    private int quantity;

    // Default Constructor
    public Product() {
        super();
    }

    // Parameterized Constructor
    public Product(int pid, String pname, double price, int quantity) {
        super();
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid +
               ", pname=" + pname +
               ", price=" + price +
               ", quantity=" + quantity + "]";
    }
}