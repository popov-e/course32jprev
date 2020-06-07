package ru.otus;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyFirstClass my = new MyFirstClass();

        System.out.println("Hello, World!");

        Object object = new Object();

        int[] values = new int[]{1, 2, 7};

        System.out.println(Arrays.binarySearch(values, 5));

    }
}
