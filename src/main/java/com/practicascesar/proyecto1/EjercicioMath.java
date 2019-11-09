
package com.practicascesar.proyecto1;

import java.util.Scanner;


public class EjercicioMath {
    
    public static void main(String[] args) {
        
        /*Realizar un programa que calcule la venta de 3 productos 
                y al final dionar centavos (redondeo)*/
        Scanner entrada = new Scanner(System.in);
        
        double produc1;
        double produc2;
        double produc3;
        
        System.out.println("Costo de su primer producto..");
        produc1 = entrada.nextDouble();
        System.out.println("Costo de segundo producto..");
        produc2 = entrada.nextDouble();
        System.out.println("Costo de su tercer producto..");
        produc3 = entrada.nextDouble();
        
        double resultado = produc1 + produc2 + produc3;
        
        System.out.println("El costo de su compra es de: " + resultado);
        
        float redondeo = Math.round(resultado);
        
        System.out.println("Redondeo.." + (resultado  - redondeo));
        
    }
}
