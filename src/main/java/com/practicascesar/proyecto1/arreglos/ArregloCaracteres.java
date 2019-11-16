package com.practicascesar.proyecto1.arreglos;

import javax.swing.JOptionPane;

public class ArregloCaracteres {

    public static void main(String[] args) {

        /*Arreglo de char*/
        char[] caracteres = {'a', 'e', 'i', 'o', 'u'};

        /*Recorrido del arreglo*/
        System.out.println("\tElementos del arreglo caracteres\n");
        for (char caracter : caracteres) {

            System.out.println("Elementos contenidos dentro del arreglo.." + caracter);
        }

        /*Arreglo de String*/
        System.out.println("\n\n\tElementos del arreglo nombres\n");
        String[] nombres = {"César", "Vero", "Gloria", "Vanessa"};

        for (String nombre : nombres) {

            System.out.println("Elementos contenidos en el arreglo.. " + nombre);
        }

        /*Invertir un String*/
        String texto = JOptionPane.showInputDialog("Ingresa un texto...");
        /*
          Con el metodo length extraemos el dato de la longitud del texto ingresado 
          y se lo asignamos a la variable longitud
         */
        int longitud = texto.length();
        /*
            Creamos un arreglo que va a tener el mismo tamaño del texto que se esta ingresando
         */
        char[] caracteres1 = new char[longitud];

        /*
            Asignamos la longitud a la variable inverso    
         */
        int inverso = longitud;

        /*
            Creamos un for con el cual invertimos el texto
        */
        for (int i = 0; i < longitud; i++) {
            caracteres1[i] = texto.charAt(inverso - 1);
            inverso--;
        }

        System.out.println(caracteres1);
    }
}
