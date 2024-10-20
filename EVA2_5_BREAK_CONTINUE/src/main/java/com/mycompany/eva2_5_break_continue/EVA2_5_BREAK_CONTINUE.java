/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_break_continue;

/**
 *
 * @author Usuario
 */
public class EVA2_5_BREAK_CONTINUE {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //BREAK --> termina el ciclo completamente
        //CONTINUE --> interrumpe la repeticion actual
        for(int i = 1; i <= 10; i++){
            if(i == 8)
                break;
            System.out.println(i+"-");     
    }
        System.out.println("");
        for(int i = 1; i <= 10; i++){
            if(i == 8)
                continue;
            System.out.println(i+"-");
        }      
        }
    }    
        
        
    

