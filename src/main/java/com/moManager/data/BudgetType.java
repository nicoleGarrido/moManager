package com.moManager.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BudgetType {

    private @Id BudgetType type;

    public BudgetType(BudgetType type){
        this.type = type;
    }

    public BudgetType getType(){
        return type;
    }

    public void setType(BudgetType type){
        this.type = type;
    }
}




