
package com.practicascesar.proyecto1.ciclos_bucles;

import java.util.Scanner;

public class CondicionalString {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
         System.out.println("Seleccione una opción\n Acesso\n Configuración\n Ayuda");
         String seleccion = entrada.nextLine();
         /*Uso del método toLowerCase() para que la cadena de 
         caracteres ingresada sea cambiada a minusculas*/
         System.out.println("Palabra escrita antes del método toLowerCase: " + seleccion);
         seleccion=seleccion.toLowerCase();
         System.out.println("Palabra escrita después del método toLowerCase: " + seleccion);

        switch (seleccion){
        
            case "acceso":
                System.out.println("Seleccionaste el acceso");
                break;
            case "configuracion":
                System.out.println("Seleccionaste la configuracción");
                break;
            case "ayuda":
                System.out.println("Seleccionaste la ayuda");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        
    }
}
