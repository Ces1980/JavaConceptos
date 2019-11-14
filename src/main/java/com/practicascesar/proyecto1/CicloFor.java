
package com.practicascesar.proyecto1;

import java.util.Scanner;


public class CicloFor {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("\tCiclo for de incremento");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i : " + i);
        }
        
        System.out.println("\n\tCiclo For de decremento");
        
        for (int interador = 10; interador >= 1; interador--) {
            System.out.println("i : " + interador);
        }
        
        System.out.println("\n\tCiclo For repeticiones por usuario");
        
      System.out.println("\nCuantas repeticiones...");
      int repeticiones = entrada.nextInt();
      
        for (int in = 1; in <= repeticiones; in++) {
            if (in == 1) {
                System.out.println("Veces que se repite el ciclo: " + repeticiones);
            }
            System.out.println("i : " + in);
        }
        
    }
}
