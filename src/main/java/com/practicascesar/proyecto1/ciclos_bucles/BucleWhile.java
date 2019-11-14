package com.practicascesar.proyecto1.ciclos_bucles;

import java.util.Scanner;

public class BucleWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i = 10;
        int iterador = 1;

        /*While regresivo con decremento*/
        System.out.println("While en retroceso");
        while (i >= 1) {
            System.out.println("i = " + i);
            //i = i + 1;
            i--;
        }

        /*While en avance -- aumento*/
        System.out.println("\nWhile en avance");

        while (iterador <= 10) {
            System.out.println("iterador = " + iterador);
            iterador++;
        }
        
        System.out.println("***Numero con el que empieza tu bucle***\n");
        int numero = entrada.nextInt();
        System.out.println("***Hasta que número quieres que itere tu bucle While?***");
        int termino = entrada.nextInt();
        System.out.println("De cuanto en cuanto quieres que se haga el conteo?");
        int conteo = entrada.nextInt();
        
        System.out.println("Numero empieza: " +numero+ " Numero termina: "+termino+" Brincos de conteo: " +conteo );
        while (numero <= termino) {            
            
            System.out.println("Número = " + numero);
            numero = numero + conteo;
            
        }
    }
}
