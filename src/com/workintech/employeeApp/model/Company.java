package com.workintech.employeeApp.model;

import java.util.Arrays;

public class Company {

    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        checkGiro(giro);
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        checkGiro(giro);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void checkGiro(double giro){
        if(giro < 0) {
            this.giro = 0;
        } else {
            this.giro=giro;
        }
    }

    public void addEmployee(int index, String name){


        try {
            if (developerNames[index] == null) {
                developerNames[index] = name;
                System.out.println(name + " developer " + index + " numaralı indekse eklendi.");
            } else {
                System.out.println(index + " numaralı indeks dolu. Başka bir indeks deneyin.");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Hatalı index! Lütfen geçerli bir index giriniz.");

        }


    }


    @Override
    public String toString() {
        return " id: " + id + " Name: " + name +
                " giro: " + giro + " developerNames: "
                + Arrays.toString(developerNames);
    }
}
