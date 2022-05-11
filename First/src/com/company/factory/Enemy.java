package com.company.factory;

public abstract class Enemy {
    private String name;
    private int demage;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    private void showUp(){
        System.out.printf("[%s] is showing Up , Damage is [%d] ,Health is [%h].",getName(),getDemage(),getHealth());


    }
}
