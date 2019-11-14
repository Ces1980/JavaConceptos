
package com.practicascesar.proyecto1.ciclos_bucles;

import java.util.Scanner;


public class CondicionalSwitch {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Seleccione una opción:\n1: Acesso\n2: Configuración:\n3: Ayuda");
        int seleccion = entrada.nextByte();
        
        switch (seleccion){
        
            case 1:
                System.out.println("Seleccionaste el acceso");
                break;
            case 2:
                System.out.println("Seleccionaste la configuracción");
                break;
            case 3:
                System.out.println("Seleccionaste la ayuda");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
