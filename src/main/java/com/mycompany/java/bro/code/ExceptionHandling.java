/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Salac
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        // exception = 	an event that occurs during the execution of a program that,
        //				disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.print("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Always close the scanner");
            scanner.close();
        }
    }
}
