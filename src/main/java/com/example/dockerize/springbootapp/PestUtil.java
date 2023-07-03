package com.example.dockerize.springbootapp;

import java.util.ArrayList;
import java.util.List;

public class PestUtil {
    
    public static List<Pestisides> loadData() {
        Pestisides pest1 = new Pestisides();
        pest1.setBrand("pestiside");
        pest1.setManufacturer("Sysngenta");
        pest1.setName("ekalux");
        pest1.setPrice(1000);

        Pestisides pest2 = new Pestisides();
        pest2.setBrand("pestiside");
        pest2.setManufacturer("absa");
        pest2.setName("monocil");
        pest2.setPrice(2500);

        List<Pestisides> pestList = new ArrayList<Pestisides>();
        pestList.add(0, pest2);
        pestList.add(1, pest1);
        return pestList;
    }
}
