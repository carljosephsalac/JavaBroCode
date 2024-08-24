/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code.OOP;

/**
 *
 * @author Salac
 */
public class OverloadedConstructor {

    public static void main(String[] args) {
        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}

class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza() {

    }

    Pizza(String bread) {

        this.bread = bread;
    }

    Pizza(String bread, String sauce) {

        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread, String sauce, String cheese) {

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String cheese, String topping) {

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
}
