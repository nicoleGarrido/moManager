package com.moManager.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExpenseType {

    private @Id String type;

    public ExpenseType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
