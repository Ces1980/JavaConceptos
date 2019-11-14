
package com.practicascesar.proyecto1.arreglos;


public class Arreglos {
    
    public static void main(String[] args) {
        
        /*
          Declaración de un arreglo de elementos de tipo enteros
          tipoDato [] nombreArreglo = {contenidoDelArreglo}; 
        */
        int [ ] listaDeNumeros = {1,2,3,4,5,6,7};
        
        /*
          Acceder a cada uno de los elementos del arreglo
          System.out.println(nombreArreglo[posicionArreglo]);
        */
        
        System.out.println(listaDeNumeros[0]);
        /*Salida en pantalla --> 1*/
        
        /*
            Mostrar todos los elementos del arreglo con ciclo for
        */
        
        for (int i = 0; i < listaDeNumeros.length; i++) {
        /*
            Uso del iterador (i) para que el bucle for liste los valores de cada uno de 
            los elementos del arreglo
                 
        */
            System.out.println("Elementos del arreglo: " + listaDeNumeros[i]);
        }
        
        /*  Declaración de un bucle forEach
            for ( TipoARecorrer nombreVariableTemporal : nombreDeLaColección ) {
                                               Instrucciones
       }
        */
        System.out.println("\t\n Mostrar datos con ciclo forEach ");
        for (int numeros : listaDeNumeros) {
            System.out.println("Elementos del arreglo: " + numeros);
        }
    }
}
