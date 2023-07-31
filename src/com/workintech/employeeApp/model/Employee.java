package com.workintech.employeeApp.model;

import java.util.Arrays;

public class Employee {
   private int id;
   private String fullName;
   private String email;
   private String password;
   private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }


    public void addHealthplan(int index, String name) {
        try {
            if (healthplans[index] == null) {
                healthplans[index] = name;
                System.out.println(name + " planı " + index + " numaralı indekse eklendi.");
            } else {
                System.out.println(index + " numaralı indeks dolu. Başka bir indeks deneyin.");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Hatalı index! Lütfen geçerli bir index giriniz.");

        }

    }

    @Override
    public String toString() {
        return  "fullName: " + fullName +  " healthplans: " + Arrays.toString(healthplans);
    }



}





