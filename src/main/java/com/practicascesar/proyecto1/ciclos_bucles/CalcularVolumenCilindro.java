
package com.practicascesar.proyecto1.ciclos_bucles;

import java.util.Scanner;


public class CalcularVolumenCilindro {
    
    /*Si yo em enborracho con 2 litros de cerveza y un vaso de 6 cm de diametro
    y 10 de altura, ¿Cuantos vasos debo tomar para enborracharme?
    Formula del Volumen de un cilindro es  V=πr2h. r =d/2  */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Diametro de la boca del vaso: ");
        float diametro = entrada.nextFloat();
        System.out.println("Altura del vaso");
        float altura= entrada.nextFloat();
        
        double volumen;
        float radio = diametro /2;
        float  pi = 3.1416f;
        volumen = pi * Math.pow(radio, 2) * altura;
        System.out.println("Volumen de un vaso de cerveza es: "+ volumen / 1000 + " litros");
        System.out.println("Con cuantos litros te enborrachas: ");
        float litros = entrada.nextFloat();
        float mililitrosParaAlcoholizarme = litros *  1000f;
        double limiteVasos = mililitrosParaAlcoholizarme/ volumen;
        System.out.println("Cantidad de vasos para alcoholizarme: " + limiteVasos);
        
    }
}
