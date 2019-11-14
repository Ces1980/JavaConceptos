package com.practicascesar.proyecto1.ciclos_bucles;

import java.util.Scanner;


public class CicloForPintarEscalera {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        System.out.println("Numero de escaleras");
        int altura = entrada.nextInt();
        
        for (int numeroAsteriscos = 1; numeroAsteriscos <= altura; numeroAsteriscos++) {
            for (int j = 0; j < numeroAsteriscos; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
