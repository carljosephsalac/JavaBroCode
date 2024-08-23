/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.bro.code;

/**
 *
 * @author Salac
 */
public class Array2D {
    public static void main(String[] args) {
        String[][] frontends = new String[3][3];
        
        frontends[0][0] = "React";
        frontends[0][1] = "Angular";
        frontends[0][2] = "Vue";
        frontends[1][0] = "Svelte";
        frontends[1][1] = "Solid";
        frontends[1][2] = "Ember";
        frontends[2][0] = "jQuery";
        frontends[2][1] = "Alphine";
        frontends[2][2] = "Backbone";
        
        for (int i = 0; i < frontends.length; i++) {
            if (i != 0) {
                System.out.println();
            }
            
            for (int j = 0; j < frontends[i].length; j++) {
                System.out.print(frontends[i][j] + ", ");
            }
        }
        
        System.out.println();
        System.out.println();
        
        String[][] fes = {
            {"React", "Angular"},
            {"Vue", "Svelte" },
            {"Solid", "Ember"},
            {"jQuery", "Alphine"},
        };
        
        for (int i = 0; i < fes.length; i++) {
            if (i > 0) {
                System.out.println();
            }
            
            for (int j = 0; j < fes[i].length; j++) {
                System.out.print(fes[i][j] + ", ");
            }
        }
    }
}
