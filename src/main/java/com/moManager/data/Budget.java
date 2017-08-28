package com.moManager.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Budget {

    private @Id @GeneratedValue Long id;

    @ManyToOne
    private BudgetType type;

    private Long amount;

    private Date date;

    public Budget(BudgetType type, Long amount,Date date ){
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BudgetType getType() {
        return type;
    }

    public void  SetType(BudgetType type) {
        this.type = type;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
