
package com.practicascesar.proyecto1.arreglos;

import javax.swing.JOptionPane;


public class PalindromoArreglo {
    
    public static void main(String[] args) {
        
        String texto = JOptionPane.showInputDialog("Escribe un palindromo");
        /*Extraemos la longitud de la palabra ingresada*/
        int longitud = texto.length();
        /*Se crea un arreglo con la palabra ingresada*/
        char [] letras = new char[longitud];
        /*Se cre un arreglo en donde se van a guardar los caracteres al invertir la plabra ingresada*/
        char [] letrasInvertir = new char[longitud];
        
        /*En la variable inverso se va a guardar la longitud del texto ingresado
         y despues comparar */
        int inverso = longitud;
        /*Bandera para salir de la condición que nos permite identificar si la palabra ingresada
        al invertirla es igual caracter por caracter y posicion por posicion*/
        boolean igual = true;
        
        /*-ciclo que realiza tres acciones:
        *1.-Se convierte a minusculas la palabra ingresado, se se quita un aposición para que el conteo no
        *inice en 0, y eso se deposita en el arreglo letrasInvertir[i], y por cada ciclo
        *se quita una posición a el contenido de la variable inverso.
        *2.-A el contenido de la variable texto se cambia a minusculas, se pasa la posicion parada por parametro
        *y se deposita en el arreglo letras[i]
        3.-La condición if permite identificar si la palabra ingresada es un palindromo
        */
        for (int i = 0; i < longitud; i++) {
            letrasInvertir[i] = texto.toLowerCase().charAt(inverso - 1);
           
            inverso --;
            letras[i]= texto.toLowerCase().charAt(i);
            if(letrasInvertir[i] != letras[i]){
                igual = false;
                break;
            }
        }
        
        /*Condicion que gracias del estado de la bandera booleana(igual) permite
        *dar a conocer por consola si la palabra ingresada es palindromo*/
        if(igual == false){
            System.out.println("No es un palindromo");
        }else{
            System.out.println("Es un palindromo");
        }
    }
}
