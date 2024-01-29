package com.DSAJava;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        //Array other=new Array(3);
        numbers.insert(100);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insertAtIndex(10,2);

        Array otherNumbers = new Array(3);
        otherNumbers.insert(1);
        otherNumbers.insert(5);
        otherNumbers.insert(100);
        Array intersection = numbers.intersect(otherNumbers);
        intersection.print(); // should have 1 and 5

//        numbers.print();
//        numbers.reverse();
//        System.out.println(numbers.max());
//        System.out.println(numbers.indexOf(60));
//        numbers.removeAt(1);
//
//        numbers.print();
    }

}
