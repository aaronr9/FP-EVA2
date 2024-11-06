/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_18_busqueda_lineal;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_18_BUSQUEDA_LINEAL {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] datos = {10, 50, 85, 73, 11, 25, 43, 5, 0, 6};
        int valor, posicion = -1;
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor a buscar:");
        valor = captu.nextInt();
        
        for (int a = 0; a < datos.length; a++) {
            if(valor == datos[a]){
                //regresar la posicion
                posicion = a;
                //detener el ciclo
                break;
            }
        }
        if(posicion ==-1)
            System.out.println("VALOR NO ENCONTRADO");
        else
            System.out.println("EL VALOR ESTA EN LA POSICION:" + posicion);
    }
}
