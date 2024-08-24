/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code.OOP.Interface;

/**
 *
 * @author Salac
 */
public class Cat implements Predator, Prey {
    
    public void hunt() {
        System.out.println("Cat is hunting");
    }
    
    public void flee() {
        System.out.println("Cat is fleeing");
    }
}
