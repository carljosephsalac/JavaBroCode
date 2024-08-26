/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code.DSA;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Salac
 */
public class PriorityQueueSample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<Integer>();
        Queue<Integer> queueReverse = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        queue.offer(3);
        queue.offer(1);
        queue.offer(5);
        queue.offer(2);
        queue.offer(4);
        
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        
        System.out.println();
        
        queueReverse.offer(1);
        queueReverse.offer(2);
        queueReverse.offer(3);
        queueReverse.offer(4);
        queueReverse.offer(5);
        
        while(!queueReverse.isEmpty()) {
            System.out.println(queueReverse.poll());
        }
    }
}
