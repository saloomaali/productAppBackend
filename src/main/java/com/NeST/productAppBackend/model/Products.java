package com.NeST.productAppBackend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue
    private int id;
    private String prd_code;
    private String prd_name;
    private String mnf_date;
    private String exp_date;
    private String brand;
    private int price;
    private String seller_name;
    private String distr_name;

    public Products() {
    }

    public Products(int id, String prd_code, String prd_name, String mnf_date, String exp_date, String brand, int price, String seller_name, String distr_name) {
        this.id = id;
        this.prd_code = prd_code;
        this.prd_name = prd_name;
        this.mnf_date = mnf_date;
        this.exp_date = exp_date;
        this.brand = brand;
        this.price = price;
        this.seller_name = seller_name;
        this.distr_name = distr_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrd_code() {
        return prd_code;
    }

    public void setPrd_code(String prd_code) {
        this.prd_code = prd_code;
    }

    public String getPrd_name() {
        return prd_name;
    }

    public void setPrd_name(String prd_name) {
        this.prd_name = prd_name;
    }

    public String getMnf_date() {
        return mnf_date;
    }

    public void setMnf_date(String mnf_date) {
        this.mnf_date = mnf_date;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public String getDistr_name() {
        return distr_name;
    }

    public void setDistr_name(String distr_name) {
        this.distr_name = distr_name;
    }
}
