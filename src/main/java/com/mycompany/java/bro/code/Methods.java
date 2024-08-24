/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code;

/**
 *
 * @author Salac
 */
public class Methods {
    public static void main(String[] args) {
        
        description();
        System.out.println(addNumber(3, 5));
        
    }
    
    static void description() {
        System.out.println("This will add two numbers:");
    }
    
    static int addNumber(int x, int y) {
        return x + y;
    }
}
