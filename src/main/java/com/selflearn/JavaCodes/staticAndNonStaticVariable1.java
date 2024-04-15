package com.selflearn.JavaCodes;

public class staticAndNonStaticVariable1 {


    int i = 5; // global variable
    static int j = 10; //static variable

    public static void main(String[] args) {

        int a = 20; //local variable
        System.out.println("a--->" + a);
        System.out.println("j--->" + j);

        //need to create object of class to get non-static variable in static method
        staticAndNonStaticVariable1 SN = new staticAndNonStaticVariable1();
        System.out.println("i--->" + SN.i);


    }
}
