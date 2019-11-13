
package com.practicascesar.proyecto1;
import java.util.Scanner;

public class CondicionalesAnidadas {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe un número entre 1 y 9999");
        int numero = entrada.nextInt();
        
        if (numero > 0 && numero < 10) {
            
            System.out.println("Tu numero es una unidad");
            
        } else if(numero >= 10 && numero < 100) {
            
            System.out.println("Tu número es una decena");
            
        } else if (numero >= 100 && numero < 1000) {
            
            System.out.println("Tu número es una centena");
            
        } else if (numero >= 1000 && numero < 10000) {
            
            System.out.println("Tu número es un millar");
        } else{
        
            System.out.println("Numero fuera del rango");
        }
    }
}
