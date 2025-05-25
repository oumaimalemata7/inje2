package com.example.injection2.Pres;

import com.example.injection2.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpeingannotation {
    public static void main(String[] args) {
        //ApplicationContext context = new AnnotationConfigApplicationContext("DAO","Metier");//injection des dependences en utilisant les annotations
        ApplicationContext context = new AnnotationConfigApplicationContext("ext","Metier","DAO");//version web sercvice
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Res="+metier.calcul());

    }



}