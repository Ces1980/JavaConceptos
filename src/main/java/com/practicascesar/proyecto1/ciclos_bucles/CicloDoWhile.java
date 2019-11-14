package com.practicascesar.proyecto1.ciclos_bucles;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CicloDoWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i = 1;

        /*Bucle do-while de incremento */
        System.out.println("Bucle do-while de incremento ");
        do {
            System.out.println("i = : " + i);
            i++;
        } while (i <= 10);

        /*Bucle do-while de decremento */
        int iterador = 10;

        System.out.println("Bucle do-while de decremento ");

        do {
            System.out.println("i = : " + iterador);
            iterador--;
        } while (iterador > 0);

        /*Bucle do while iterador el cual termina cuando el tiro aleatorio
        es igual a 6 */
        System.out.println("Bucle do while - tiro de dados ");

        Random ram = new Random();
        int aleatorio;
        int salir = 0;
        int intento = 1;
        do {
            aleatorio = ram.nextInt(6) + 1;
            System.out.println("Aleatorio : " + aleatorio);
            if (aleatorio == 6) {
                System.out.println("\"Excelente-- sacste 6 ***GANASTE**\"");
                
                JOptionPane.showMessageDialog(null, "Excelente-- sacste 6 ***GANASTE**");
                JOptionPane.showMessageDialog(null, "Numeros de intentos ..." + intento);
                salir = 1;
            } else {
                JOptionPane.showMessageDialog(null, "**FALLASTE** " +intento+ " intento");
                System.out.println("Mal...Siguiras tirando");
            }

            intento++;
           
            if(aleatorio != 6){
            System.out.println("Desea seguir tirando? /t 1.- SALIR  /n 2.- SEGUIR");
            salir = entrada.nextInt();
            }
        } while (salir != 1);
    }

}
