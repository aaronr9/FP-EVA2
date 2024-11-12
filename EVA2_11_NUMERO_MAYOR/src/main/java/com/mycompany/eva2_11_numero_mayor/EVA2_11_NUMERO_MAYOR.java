/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_11_NUMERO_MAYOR {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String numero;
        Scanner captu = new Scanner(System.in);
        do{
            System.out.println("escribe un numero:");
            numero = captu.nextLine();
        }while(!(numero.equals("-1")));
        System.out.println("listo");
        
    }
}
