package com.example.injection2.ext;

import com.example.injection2.dao.Dao;
import org.springframework.stereotype.Component;

@Component("Dao2")
public class DaoImplV2 implements Dao {

    @Override
    public double getData() {
        System.out.println("Version web service");
        double t =37;
        return t*2;
    }
}