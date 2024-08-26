/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code.DSA;

/**
 *
 * @author Salac
 */
public class Recursion {
    public static void main(String[] args) {
        countDown(10);
        
        System.out.println(factorial(5));
        
        System.out.println(power(2, 8));
    }
    
    private static void countDown(int count) {
        if(count <= 0) return;
        System.out.println("Count " + count);
        countDown(count - 1);
    }
    
    private static int factorial(int num) {
        if (num <= 0) return 1;
        return num * factorial(num - 1);
    }
    
    private static int power(int base, int exponent) {
        if(exponent <= 0) return 1;
        return base * power(base, exponent - 1);
    }
}
