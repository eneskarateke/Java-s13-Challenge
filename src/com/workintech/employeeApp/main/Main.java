package com.workintech.employeeApp.main;

import com.workintech.employeeApp.model.Company;
import com.workintech.employeeApp.model.Employee;
import com.workintech.employeeApp.model.Healthplan;
import com.workintech.employeeApp.model.Plan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {

        System.out.println("*************************************************");




        Healthplan plan1 = new Healthplan(1,"X sigorta",Plan.COMFORT);
        Healthplan plan2 = new Healthplan(1,"Y sigorta",Plan.BASIC);

        System.out.println(plan1.getPlan().getName() + " - " + plan1.getPlan().getPrice());

        String[] healthplans = new String[3];
        healthplans[0] = plan1.getName();
        healthplans[1] = plan2.getName();


        Employee employee1= new Employee(1,"enes hamza karateke","eneskarateke@gmail.com", "82gsd7291", healthplans);
        System.out.println(employee1);
        employee1.addHealthplan(0,"Z sigorta");
        System.out.println(employee1);

        System.out.println("*************************************************");


        String[] developerNames = new String[5];

        developerNames[0] = employee1.getFullName();
        Company company= new Company(1,"Workintech",10000, developerNames);

        System.out.println("company " + company);

        System.out.println("employee1.getId(): " + employee1.getId());
        System.out.println("employee1.getFullName();" + employee1.getFullName());
        System.out.println("employee1.getEmail();" + employee1.getEmail());
        System.out.println("employee1.getPassword();" + employee1.getPassword());
        System.out.println(employee1);

        employee1.addHealthplan(2, Plan.BASIC.getName());
        System.out.println(employee1);





    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
