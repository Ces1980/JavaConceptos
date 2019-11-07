
package com.practicascesar.proyecto1;


public class DatosEnvoltorios {
    
    public static void main(String[] args) {
        
         System.out.println("Tipos de datos envoltorios....\t\n");
        
         /*Los datos envoltorios permiten mas funcionalidades
         que los datos primitivos*/
        Byte mordida;
        mordida = 126;
        System.out.println("Mordida: "+ mordida);
         
        Short corto;
        corto = 32000;
        System.out.println("Short: "+ corto);
        
        /*Int se convierte a Integer*/
        Integer entero;
        entero = 32000;
        System.out.println("Entero: " + entero);
        
        /*Long se necesita castear el dato numerico con l*/
        Long largo;
        largo = 253265874l;
        System.out.println("Largo: " + largo);
        
        Float flotante;
        flotante = mordida.floatValue();
        System.out.println("Float: " + flotante);
        
        Double doble;
        doble = 5744512.25;
        System.out.println("Double: " + doble);
        
        char letra;
        letra = 'a';
        System.out.println("Letra: "+ letra);
        
        
        Boolean bandera;
        bandera = false;
        System.out.println("Bandera: "+ bandera);
        
        String cadena;
        cadena = "Cadena";
        System.out.println("Cadena:" + cadena);
        
        /*El tipo de dato char no tine dato envoltorio*/
    }
}
