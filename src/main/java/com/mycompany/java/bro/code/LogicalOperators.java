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
public class LogicalOperators {

    public static void main(String[] args) {

        String email = "salaccarljoseph@gmail.com";
        String password = "admin123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username : ");
        String requestEmail = scanner.nextLine();

        System.out.print("Enter Password : ");
        String requestPassword = scanner.nextLine();

        if (!requestEmail.contains("@") || requestPassword.length() < 8) {
             System.out.println("Invalid email or password");
        } else if (!requestEmail.equals(email) || !requestPassword.equals(password)) {
            System.out.println("Wrong credentials");
        } else if (requestEmail.equals(email) && requestPassword.equals(password)) {
            System.out.println("Log in");
        }
    }
}
