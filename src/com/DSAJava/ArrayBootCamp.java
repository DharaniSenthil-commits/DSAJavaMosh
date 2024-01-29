package com.DSAJava;

import java.util.Arrays;

public class ArrayBootCamp {
    public static void main(String[] args) {
        int[] numbersArrayDeclaration = new int[3];
        numbersArrayDeclaration[0] = 10;
        numbersArrayDeclaration[1] = 20;
        numbersArrayDeclaration[2] = 30;
        System.out.println(Arrays.toString(numbersArrayDeclaration));

        //Array Initialization

        int[] numbersArrayInitialization = {40, 50, 60};
        System.out.println(Arrays.toString(numbersArrayInitialization));

    }
}
