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
public class ArrList {
     public static void main(String[] args) {
         
         ArrayList<String> css = new ArrayList<String>();
         
         css.add("Bootstrap");
         css.add("Tailwind");
         css.add("Sass");
         
         css.set(0, "Bootstrap 5");
         css.remove(2);
         css.clear();
         
         for (int i = 0; i < css.size(); i++) {
             System.out.println(css.get(i));
         }
     }
}
