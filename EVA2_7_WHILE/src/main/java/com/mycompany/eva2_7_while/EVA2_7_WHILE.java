/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_while;

/**
 *
 * @author Usuario
 */
public class EVA2_7_WHILE {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Imprimir los numeros del 1 al 10
        int val = 1;
        while(val <= 10){//while --> mientras (esto sea verdad){repito esto}
            System.out.println(val +"-");
            val++;
        }
        System.out.println("");
        val = 1;
        do{
            System.out.println(val +"-");
            val++;
        }while(val <= 10);// Repitir{intrucciones}mientras(esto se cumpla)
    }
        
        
        

}
