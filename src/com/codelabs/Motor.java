package com.codelabs;

/**
 * Created by adammb on 7/21/16.
 */
public abstract class Motor implements Cloneable{
    //atribut
    private String id;
    protected String tipeMotor;

    //method
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipeMotor() {
        return tipeMotor;
    }

    public abstract void lakukanSesuatu();

    //ciri khas prototype
    @Override
    public Object clone(){
        Object clone=null;

        try{
            clone=super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }
}
