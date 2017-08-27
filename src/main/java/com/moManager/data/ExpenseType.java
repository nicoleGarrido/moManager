package com.moManager.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExpenseType {

    private @Id ExpenseType type;

    public ExpenseType(ExpenseType type){
        this.type = type;
    }

    public ExpenseType getType() {
        return type;
    }

    public void setType(ExpenseType type) {
        this.type = type;
    }

}
