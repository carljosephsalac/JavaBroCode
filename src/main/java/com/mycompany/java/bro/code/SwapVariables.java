/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code;

/**
 *
 * @author Salac
 */
public class SwapVariables {
    public static void main(String[] args) {
        String Java = "Spring Boot";
        String PHP = "Laravel";
        String temp;
        
        temp = Java;
        Java = PHP;
        PHP = temp;
        
        System.out.println("Java : " + Java);
        System.out.println("PHP : " + PHP);
    }
}
