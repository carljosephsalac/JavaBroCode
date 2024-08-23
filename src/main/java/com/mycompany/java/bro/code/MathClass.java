/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code;

import java.util.Random;

/**
 *
 * @author Salac
 */
public class MathClass {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int x = random.nextInt(10) + 1;
        int y = random.nextInt(11);
        int z = Math.max(x, y);
        int w = Math.min(x, y);
        
        System.out.println("Max : " + z);
        System.out.println("Min : " + w);
    }
}
