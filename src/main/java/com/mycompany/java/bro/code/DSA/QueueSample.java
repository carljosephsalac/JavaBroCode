/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code.DSA;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Salac
 */
public class QueueSample {
     public static void main(String[] args) {
         Queue<String> queue = new LinkedList<String>();
         
         queue.offer("Java");
         queue.offer("Kotlin");
         queue.offer("JavaScript");
         queue.offer("PHP");
         
         System.out.print("List of all items in queue : ");
         System.out.println(queue);
         
         System.out.print("Remove the first item : ");
         System.out.println(queue.poll());
         
         System.out.print("Is queue empty? ");
         System.out.println(queue.isEmpty());
         
         System.out.print("How many items are there in queue? ");
         System.out.println(queue.size());
         
         System.out.print("Show me is the first item in queue : ");
         System.out.println(queue.peek());
         
         System.out.print("Is JavaScript in the queue? ");
         System.out.println(queue.contains("JavaScript"));
     }
}
