/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code.OOP;

/**
 *
 * @author Salac
 */
public class ArrayOfObjects {

    public static void main(String[] args) {
        ProgLangs pl1 = new ProgLangs("Java");
        ProgLangs pl2 = new ProgLangs("PHP");
        ProgLangs pl3 = new ProgLangs("JavaScript");
        
        ProgLangs[] proglangs = {pl1, pl2, pl3};
        
        System.out.println(proglangs[0].pl);
        System.out.println(proglangs[1].pl);
        System.out.println(proglangs[2].pl);
    }
}

class ProgLangs {

    String pl;

    ProgLangs(String pl) {
        this.pl = pl;
    }
}
