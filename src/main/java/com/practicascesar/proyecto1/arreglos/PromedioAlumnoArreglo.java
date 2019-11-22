
package com.practicascesar.proyecto1.arreglos;

import java.util.Scanner;


public class PromedioAlumnoArreglo {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
      
        
        
        System.out.println("Cantidad de calificaciones a ingresar...");
        int calificacionesAIngresar = entrada.nextInt();
        
        float calificaciones[] = new float [calificacionesAIngresar];
        float suma =0, promedio;
        int contador = 1;
        
        for (int i = 0; i < calificacionesAIngresar; i++) {
            System.out.println("\t\nSolicitando calificacion..." +contador);
            System.out.print("\n"+contador + ".- Calificación \n");
            calificaciones[i] = entrada.nextFloat();
            suma = suma + calificaciones[i];
            
        }
        promedio = suma / calificacionesAIngresar;
        
        System.out.println("Promedio..." + promedio);
    }
}
