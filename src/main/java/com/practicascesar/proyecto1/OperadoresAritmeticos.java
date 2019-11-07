
package com.practicascesar.proyecto1;

import java.util.Scanner;


public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        
        float prueba = 5f;
        
        System.out.println("Valor original de prueba: " + prueba);
        prueba = prueba + 1;
        System.out.println("Res prueba = prueba + 1... " + prueba);
        prueba+=1;
        System.out.println("Res prueba+=1... " + prueba);
        prueba++;
        System.out.println("Res prueba++... " + prueba);
        ++prueba;
        System.out.println("Res ++prueba... " + prueba);
        
        /*Lo mismo pasa con lo soperadores de resta, division, multiplicacion*/
        
    }
}
