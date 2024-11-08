/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._examen_2_evaluacion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int juego;
        Scanner captu = new Scanner(System.in);
        System.out.println("elija piedra, papel o tijera:");
        juego = captu.nextInt();
        
        int juego = Math.random();
       
         switch(juego){
            case 1:
                System.out.println("piedra");
                break;//ultima instruccion- FIN DEL CASO
            case 2:
                System.out.println("papel");
                break;//ultima instruccion- FIN DEL CASO
            case 3:
                System.out.println("tijera");
         }
    
        
    
            
            
            
        
            
        
    }
}
