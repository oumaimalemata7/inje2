package com.example.injection2.dao;

import org.springframework.stereotype.Component;

@Component("Dao")//comme si vous demander au spring de cree cette classe en démarage
public class DaoImpl implements Dao {

    @Override
    public double getData() {
        System.out.println("version base de données");
        double temp = 25;
        return temp;
    }
}
