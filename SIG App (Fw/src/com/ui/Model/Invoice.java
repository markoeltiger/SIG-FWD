package com.ui.Model;

public class Invoice {
    private int Id;
    private String date;
    private String customer;
    private int total;

    public Invoice(int id, String date, String customer, int total) {
        Id = id;
        this.date = date;
        this.customer = customer;
        this.total = total;
    }

    public Invoice() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
