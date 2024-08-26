/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code.DSA;

import java.util.LinkedList;

/**
 *
 * @author Salac
 */
public class LinkedListSample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        
        linkedList.push("JavaScript");
        linkedList.push("PHP");
        linkedList.offer("Java");
        linkedList.offer("Kotlin");
        
        linkedList.add(3, "HTML");
        linkedList.add("CSS");
        linkedList.addFirst("MySQL");
        linkedList.addLast("SQLite");
        linkedList.removeFirst();
        linkedList.removeLast();
        
        System.out.println(linkedList);
    }
}
