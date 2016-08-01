package com.codelabs;

public class PrototypeDemo {

    public static void main(String[] args) {
	// write your code here
        PrototypeMotor.loadMotor();//maka hashmap terisi

        //nerima objek matic atau sport pakai kelas motor
        Motor motor=(Motor)PrototypeMotor.getMotor("1");
        motor.lakukanSesuatu();

        motor=(Motor)PrototypeMotor.getMotor("2");
        motor.lakukanSesuatu();
    }
}
