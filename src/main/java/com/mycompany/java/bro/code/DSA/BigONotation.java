/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code.DSA;

/**
 *
 * @author Salac
 */

public class BigONotation {
    public static void main(String[] args) {
        System.out.println(addUp(5));
        System.out.println(addUpUp(5));
    }
    
    static int addUp(int n) { // O(n)
        int sum = 0;
        
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
       return sum;
    }
    
    static int addUpUp(int n) { // O(1)
        int sum = n * (n + 1) / 2;
        return sum;
    }
}

