package com.example.injection2.Metier;

import com.example.injection2.dao.Dao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("Metier")//remplace les bean dans config.xml
public class IMetierImpl implements IMetier {

    //@Autowired //injection d'objet de type doa dans ma classe imetier
    private Dao dao ;

    public IMetierImpl(@Qualifier(value = "Dao") Dao dao)
    {this.dao = dao;}
    //public IMetierImpl() {}// spring ne sais pas quel constructeur va utilisé

    @Override
    public double calcul() {
        double t= dao.getData();
        double res = t*23;
        return res;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }

}