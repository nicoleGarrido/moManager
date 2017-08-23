package com.moManager.data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Expenses {
    private @Id @GeneratedValue Long id;
    private String type;
    private Long amount;
    private String date;

    public Expenses (String type, Long amount, String date) {
        this.type = type;
        this.date = date;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {return type;}

    public void setType(String type) {  this.type = type;}

    public Long amount() {return amount;}

    public void setAmount(Long amount) { this.amount = amount;}

    public String getDate() {return date;}

    public void setDate(String date) {this.date = date;}


}
