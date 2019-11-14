
package com.practicascesar.proyecto1.ciclos_bucles;


public class Constantes {
    /*En las clases donde no se declare un método MAIN 
    las Constantes son declaradas como estaticas*/
    
    /*Por convención las constantes se declaran su nombre con MAYUSCULAS*/
    
    static final String NOMBRE = "César";
    
    
    public static void main(String[] args) {
        
         System.out.println("Constantes....\t\n");
        
        /*Una constante es una variable del sistema que mantiene un valor 
        inmutable a lo largo de toda la vida del programa. 
        Las constantes en Java se definen mediante el modificador final.*/
        
        /*
        *Estructura de uan variable
        *static final nombreConstante = valor;
        */
        /*
        *
        */
        final Byte mordida;
        mordida = 126;
        System.out.println("Mordida: "+ mordida);
         
        final float PI;
        PI = 3.1416f;
        System.out.println("Valor de PI: " + PI);
        System.out.println("Doble valor de PI: "+PI * 2);
        System.out.println("Nombre: " + NOMBRE);
       
    }
    
}
