/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_3_POTENCIA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner captu = new Scanner(System.in);
        int base, expo;
        
        
        
        System.out.println("base");
        base = captu.nextInt();
        captu.nextLine();
        System.out.println("exponente");
        expo = captu.nextInt();
        captu.nextLine();
        int resu = 1;
        for(int i = 1; i <= expo; i++){
            resu = resu * base;
        }
            System.out.println("El resultado es = " + resu);
        }
        
        
        
        
        
        
    2
    2
}
