/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code.OOP;

/**
 *
 * @author Salac
 */
public class Constructor {
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon("Blue bar", 1500.00, false);
        pigeon.showColor();
        pigeon.showPrice();
        System.out.println(pigeon.distanceType());
    }
}

class Pigeon {
    String color;
    double price;
    boolean isLongDistance;
    
    Pigeon(String color, double price, boolean isLongDistance) {
        this.color = color;
        this.price = price;
        this.isLongDistance = isLongDistance;
    }
    
    void showColor() {
        System.out.println("You pigeon is " + this.color);
    }
    
    void showPrice() {
        System.out.println("The value of your pigeon is " + this.price);
    }
    
    String distanceType() {
        if (this.isLongDistance) {
            return "Your pigeon is long distance";
        } else {
            return "Your pigeon is middle or short distance";
        }
    }
}