/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code.OOP;

/**
 *
 * @author Salac
 */
public class StaticKeyWord {
    public static void main(String[] args) {
        Languages pl1 = new Languages("Java");
        Languages pl2 = new Languages("PHP");
        Languages pl3 = new Languages("JavaScript");
        
        pl1.showPl();
        pl2.showPl();
        pl3.showPl();
        
        Languages.showPlCount();
    }
}

class Languages {
    
    String pl;
    static int plCount;
    
    Languages(String pl) {
        this.pl = pl;
        plCount++;
    }
    
    static void showPlCount() {
        System.out.println("You have a total of " + plCount + " programming languages.");
    }
    
    void showPl() {
        System.out.println(pl);
    }
}
