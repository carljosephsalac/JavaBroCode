/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code;

/**
 *
 * @author Salac
 */
public class SwitchStatement {

    public static void main(String[] args) {

        String product = "GPU";

        switch (product) {
            case "Motherboard":
                System.out.println(product + " is 2000 pesos");
                break;
                
            case "PSU":
                System.out.println(product + " is 1500 pesos");
                break;
            
            case "CPU":
                System.out.println(product + " is 1000 pesos");
                break;

            case "RAM":
                System.out.println(product + " is 600 pesos");
                break;
                
            case "SSD":
                System.out.println(product + " is 800 pesos");
                break;
                
             case "GPU":
                System.out.println(product + " is 1100 pesos");
                break;

            default:
                System.out.println("Product not found");
        }

    }
}
