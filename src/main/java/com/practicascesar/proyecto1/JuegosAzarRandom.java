package com.practicascesar.proyecto1;

import java.util.Random;
import java.util.Scanner;


/*Instrucciones del juego
*los tres dados son seis, mostrar el mensaje "Excelente"
*Si se obtiene dos dados son seis, mostrar el mensaje "Muy bien"
*Si se obtiene un seis, mostrar el mensaje "Regular"
*los tres dados son seis, mostrar el mensaje "Muy mal"
 */
public class JuegosAzarRandom {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        /*Uso de un objeto de la libreria util.random*/
        Random numero = new Random();
        
        /*Obteniendo los valores de los dados*/
        int valorDado1 = numero.nextInt(6) + 1;
        int valorDado2 = numero.nextInt(6) + 1;
        int valorDado3 = numero.nextInt(6) + 1;

        /*Mostrar en consola el valor obtenido por los dados*/
        System.out.println("Tiros registrados");
        System.out.println("Primer tiro: " + valorDado1);
        System.out.println("Segundo tiro: " + valorDado2);
        System.out.println("Tercer tiro: " + valorDado3);

        /*Condiciones para mostrar los mensajes*/
        if (valorDado1 == 6 && valorDado2 == 6 && valorDado3 == 6) {

            System.out.println("Excelente");

        } else if ((valorDado1 == 6 && valorDado2 == 6) || (valorDado1 == 6 && valorDado3 == 6) || (valorDado2 == 6 && valorDado3 == 6)) {

            System.out.println("Muy bien");

        } else if (valorDado1 == 6 || valorDado2 == 6 || valorDado3 == 6) {

            System.out.println("Regular");
            
        } else {

            System.out.println("Muy mal");
        }

    }

}
