/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_4_FACTORIAL {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        Scanner captu = new Scanner(System.in);
        System.out.println("numero:");
        int num = captu.nextInt();
        captu.nextLine();
        int resu = 1;
        for(int i = 1; i <= num; i++){
        resu *= i;
        
        System.out.println("el resultado es:" + resu);
        }
            
        
        
        
    }
}
