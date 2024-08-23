/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code;

/**
 *
 * @author Salac
 */
public class Array {

    public static void main(String[] args) {
        String[] pl = {"Java", "PHP", "JavaScript"};
        
        for (int i = 0; i < pl.length; i++) {
            System.out.println(pl[i]);
        }
        
        System.out.println();
        
        String[] frameworks = new String[3];
        
        frameworks[0] = "Spring Boot";
        frameworks[1] = "Laravel";
        frameworks[2] = "Express.js";
        
        for (int i = 0; i < frameworks.length; i++) {
            System.out.println(frameworks[i]);
        }
    }
}
