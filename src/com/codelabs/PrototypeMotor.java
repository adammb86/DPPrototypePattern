package com.codelabs;

import java.util.HashMap;

/**
 * Created by adammb on 7/21/16.
 */
public class PrototypeMotor {
    //atribut
    private static HashMap<String,Motor> hashMotor=new HashMap<String,Motor>();

    //method dibuat untuk mengisi hashmap
    public static void loadMotor(){
        //instance hanya dibuat untuk keperluan input ke hashmap
        Matic matic=new Matic();
        matic.setId("1");//asalnya turunan dari kelas Motor
        hashMotor.put(matic.getId(),matic);

        Sport sport=new Sport();
        sport.setId("2");
        hashMotor.put(sport.getId(),sport);
    }

    //ini hook
    public static Motor getMotor(String id){
        Motor motor=hashMotor.get(id);
        return motor;
    }
}
