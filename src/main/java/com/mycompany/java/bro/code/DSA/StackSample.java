/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code.DSA;

import java.util.Stack;

/**
 *
 * @author Salac
 */
public class StackSample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        
        stack.push("Java");
        stack.push("Kotlin");
        stack.push("JavaScript");
        stack.push("PHP");

        System.out.print("Is stack empty? ");
        System.out.println(stack.empty());
        
        System.out.print("Items in stack : ");
        System.out.println(stack);
        
        System.out.print("Remove the last item : ");
        System.out.println(stack.pop());
        
        System.out.print("Now just show the last item : ");
        System.out.println(stack.peek());
        
        System.out.print("What is the position of JavaScript in stack? ");
        System.out.println(stack.search("JavaScript"));
    }
}
