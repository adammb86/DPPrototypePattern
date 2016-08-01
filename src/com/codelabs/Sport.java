package com.codelabs;

/**
 * Created by adammb on 7/21/16.
 */
public class Sport extends Motor{
    public Sport(){
        tipeMotor="Sport";
    }

    @Override
    public void lakukanSesuatu() {
        System.out.println("Hai saya motor sport");
    }
}
