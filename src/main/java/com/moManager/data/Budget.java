package com.moManager.data;

import org.hibernate.type.SetType;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Carlos on 8/20/2017.
 */
public class Budget {
    private @Id @GeneratedValue Long id;
    private String type;
    private Long amount;
    private String date;


    public Budget(String type, Long amount,String date ){

        this.type = type;
        this.amount = amount;
        this.date = date;

    }

    public Long getId() { return id; }

    public void setId(Long id) {this.id = id;}

    public String getType() { return type; }

    public void  SetType(String type) { this.type = type; }

    public Long getAmount() {return amount;}

    public void setAmount(Long amount) {this.amount = amount;}

    public String getDate() { return date;}

    public void setDate(String date) {this.date = date;}
}
