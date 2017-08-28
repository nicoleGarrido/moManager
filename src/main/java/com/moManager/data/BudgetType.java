package com.moManager.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BudgetType {

    private @Id String type;

    public BudgetType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}




