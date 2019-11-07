
package com.practicascesar.proyecto1;

import java.util.Scanner;


public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        
        float num1, num2, suma, resta, division, multiplicacion, residuo;
        
        System.out.println("Ingresa 2 numeros: \t\n");
        
        System.out.println("Ingresa primer numero...");
        num1 = entrada.nextFloat();
        
        System.out.println("Ingresa segundo numero...");
        num2 = entrada.nextFloat();
        
        
        suma = num1 + num2;
        resta = num1 - num2;
        division = num1 / num2;
        multiplicacion = num1 * num2;
        residuo = num1 % num2;
        
        System.out.println("Resultados.....");
        System.out.println("Suma: "+ suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Multiplicación: "+ multiplicacion);
        System.out.println("División: " +division);
        System.out.println("Residuo: "+ residuo);
    }
}
