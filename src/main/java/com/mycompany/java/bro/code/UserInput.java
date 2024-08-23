/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code;

import java.util.Scanner;

/**
 *
 * @author Salac
 */
public class UserInput {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your name? : ");
        String name = scanner.nextLine();
        
        System.out.print("How old are you? : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("What is your favorite food? : ");
        String food = scanner.nextLine();
        
        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your favorite food is " + food);
    }
}
