package com.example.injection2.Pres;

import com.example.injection2.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PRESSpringVXML {
    public static void main(String[] args) {
        //cette version injection des dependensce on utilisant spring avec fichier xml
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");//configurer le fichier config.xml cree les objet cree dans le fichier
        //IMetier metier = (IMetier) context.getBean("metier", IMetier.class);//dans config.xml
        //si vous vouler recup un bean selon son interface
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Res="+metier.calcul());

    }
}