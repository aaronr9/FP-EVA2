/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_9_USUARIO_PWD {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String pwd, usu;
        Scanner captu = new Scanner(System.in);
        do{
            System.out.println("Usuario:");
            usu = captu.nextLine();
            System.out.println("Contraseña:");
            pwd = captu.nextLine();
        }while(!(usu.equals("admin") && pwd.equals("1234")));
        System.out.println("BIENVENIDO");
        
        }
       
        
        
        
        
    }

