package com.codelabs;

/**
 * Created by adammb on 7/21/16.
 */
public class Matic extends Motor{
    //konstruktor
    public Matic(){
        tipeMotor="Matic";//ini asalnya dari motor sebagai superclass
    }

    @Override
    public void lakukanSesuatu() {
        System.out.println("Hai saya motor matic.");
    }
}
