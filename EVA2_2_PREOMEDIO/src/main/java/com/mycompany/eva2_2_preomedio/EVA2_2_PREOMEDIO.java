/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_preomedio;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_2_PREOMEDIO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int califa, sumaCali;
        Scanner captu = new Scanner(System.in);
        //inicializar el acumulador
        sumaCali = 0;
        for(int i = 1; i <= 10; i++){
        System.out.println("Estudiante # "+ i);
        System.out.println("Cual es tu calificacion");
        califa = captu.nextInt();
        captu.nextLine();
        //acumular las calificaciones
        sumaCali = sumaCali + califa;
    }
        //CALCULAR EL PROMEDIO:
        //DIVISIONES EN JAVA --> SI DIVIDIMOS ENTEROS
        double promedio = sumaCali / 10.0;
        System.out.println("promedio ="+ promedio);//sumatoria
    
    }
}
