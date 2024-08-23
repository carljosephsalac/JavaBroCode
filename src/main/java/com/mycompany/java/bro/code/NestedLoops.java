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
public class NestedLoops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns : ");
        int columns = scanner.nextInt();

        System.out.print("Enter symbol : ");
        String symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            if (i > 1) {
                System.out.println();
            }
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
    }
}
