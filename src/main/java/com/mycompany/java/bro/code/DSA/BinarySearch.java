/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code.DSA;

import java.util.Arrays;

/**
 *
 * @author Salac
 */
public class BinarySearch {

    public static void main(String[] args) {

        int numbers[] = new int[10];
        int target = 3;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        int index = Arrays.binarySearch(numbers, target);
        int customIndex = customBinarySearch(numbers, target);

        System.out.println(index);
        System.out.println(customIndex);
    }

    static int customBinarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            } else {
                return middle; //target found
            }
        }

        return -1;
    }
}
