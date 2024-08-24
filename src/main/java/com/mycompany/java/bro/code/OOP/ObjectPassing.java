/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code.OOP;

/**
 *
 * @author Salac
 */
public class ObjectPassing {
    public static void main(String[] args) {
        Framework vue = new Framework("Vue");
        Framework inertia = new Framework("Inertia");
        Framework laravel = new Framework("Laravel");
        Framework tailwind = new Framework("Tailwind");
        
        Techstack techstack= new Techstack();
        techstack.showFramework(vue);
        techstack.showFramework(inertia);
        techstack.showFramework(laravel);
        techstack.showFramework(tailwind);
    }
}

class Techstack {
    
    void showFramework (Framework framework) {
        System.out.println("You\'ve added " + framework.name + " in your techstack.");
    }
}

class Framework {
    
    String name;
    
    Framework(String name) {
        this.name = name;
    }
}