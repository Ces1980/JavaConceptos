
package com.practicascesar.proyecto1.ciclos_bucles;

import java.util.Scanner;

public class DatosPorConsola {
    
    public static void main(String[] args) {
        
  /*Crear un Scanner --> se importa la libreria util de la clase scanner */
        Scanner entrada = new Scanner(System.in);
        
        int entero;
        
        System.out.println("Ingresa un dato entero");
        entero = entrada.nextInt();
        System.out.println("El valor de nuestra variable entero es: " + entero);
        
        
        System.out.println("Ingresa un dato float: ");
        float flotante = entrada.nextFloat();
        System.out.println("El valor de nuestra variable flotante es: " + flotante);
        
        /*el metodo next solo regresa la primer palabra sin espacios*/
        System.out.println("Ingresa tu nombre:");
        String nombre= entrada.next();
        System.out.println("Nombre:" + nombre);
        
        /*Instrucción para limpiar buufer del teclado*/
        entrada.nextLine();
        
        /*nextLine() regresa todos los caracteres ingresados*/
        System.out.println("Ingresa tu nombre completo:");
        String nombreCompleto= entrada.nextLine();
        System.out.println("Nombre:" + nombreCompleto);
        
        /*Extrayendo una letra del texto con el método 
        charAt(posición de la letra que se quiere extraer)*/
        char caracter;
        System.out.println("Ingresa una palabra:");
        caracter = entrada.next().charAt(0);
        System.out.println("La letra extraida del texto es: " + caracter);
        
    }
}
