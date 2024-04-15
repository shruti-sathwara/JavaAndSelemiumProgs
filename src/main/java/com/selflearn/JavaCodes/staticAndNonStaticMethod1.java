package com.selflearn.JavaCodes;

public class staticAndNonStaticMethod1 {

    int i = 5; //global
    static int j = 10; //static global


    static void CallMethod() {
        int k = 15; //local
        System.out.println(j);
        System.out.println(k);
    }


    //static method
    public static void main(String[] args) {

        System.out.println(j);

        CallMethod();

        //call non-static variable in static method
        staticAndNonStaticMethod1 Sn = new staticAndNonStaticMethod1();
        System.out.println(Sn.i);

    }


}
