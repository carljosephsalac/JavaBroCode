/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code;

import java.util.ArrayList;

/**
 *
 * @author Salac
 */
public class ForEachLoop {

    public static void main(String[] args) {

        // for-each = 	traversing technique to iterate through the elements in an array/collection
        //				less steps, more readable
        //				less flexible
        
        int[] numbers = {1, 2, 3, 4 ,5};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}