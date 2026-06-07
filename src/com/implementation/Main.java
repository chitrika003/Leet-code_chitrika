package com.implementation;

import java.util.Arrays;

public class Main {
     static int[] arr1 = new int[5];
    static  int len=arr1.length;
     static int index =0;
static void add(int a){

if (index<len){
    arr1[index]=a;
     index++;
}
else{
    System.out.println("array is full ");
}
}
    public static void main(String[] args) {
add(10);
add(30);
add(40);
add(60);
add(70);
add(80);
        System.out.println(Arrays.toString(arr1));

    }
}
