package com.workintech.employeeApp.model;

public enum Plan {

    BASIC("BASIC", 700),
    COMFORT("COMFORT", 3000),
    FULL("FULL", 5000);

    private String name;
    private int price;


Plan(String name, int price){
    this.name=name;
    this.price=price;
}

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

}
