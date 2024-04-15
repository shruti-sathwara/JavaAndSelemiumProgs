package com.selflearn.JavaCodes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class localAndGolobalVariable {

    static int i = 10; // global variable

    public static void main(String[] args) {

        int j = 5; // local variable

        System.out.println("Global ==>" + i);
        System.out.println("local ==>" + j);
    }

}