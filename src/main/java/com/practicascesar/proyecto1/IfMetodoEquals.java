
package com.practicascesar.proyecto1;

import java.util.Scanner;

public class IfMetodoEquals {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Saludame por favor");
        String respuesta = entrada.nextLine();
        respuesta = respuesta.toLowerCase();
        /*Uso del método equals()
        *Compara la cadena de texto contra un objeto. 
        *Devolverá true si las cadenas comparadas son iguales. 
        *En caso contrario devolverá false.
        */
        if (respuesta.equals("hola")) {
            System.out.println("¿Como estas?");
        } else {
            System.out.println("No te entiendo");
        }
    }
}
