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
public class ArrList2D {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> frameworks = new ArrayList();
        
        ArrayList<String> css = new ArrayList();
        css.add("Bootstrap");
        css.add("Tailwind");
        css.add("Sass");
        
        ArrayList<String> frontend = new ArrayList();
        frontend.add("React");
        frontend.add("Vue");
        frontend.add("Angular");
        
        ArrayList<String> backend = new ArrayList();
        backend.add("Laravel");
        backend.add("Node");
        backend.add("Spring Boot");
        
        frameworks.add(css);
        frameworks.add(frontend);
        frameworks.add(backend);
        
        for (int i = 0; i < frameworks.size(); i++) {
            if (i == 0) {
                System.out.println("CSS Frameworks:");
            } else if (i == 1) {
                System.out.println("Frontend Frameworks:");
            } else {
                System.out.println("Backend Frameworks:");
            }
            
            for (int j = 0; j < frameworks.get(i).size(); j++) {
                System.out.print(frameworks.get(i).get(j) + ", ");
            }
            
            System.out.println("\n");
        
        }
    }
}
