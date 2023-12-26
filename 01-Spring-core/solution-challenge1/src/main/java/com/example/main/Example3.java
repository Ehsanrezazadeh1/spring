package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("pride" ,Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());

        Vehicle veh2 = context.getBean("RD", Vehicle.class);
        System.out.println(veh2.getName());


        Vehicle veh3 = context.getBean("glx", Vehicle.class);
        System.out.println(veh3.getName());


        context.close();




    }
}
