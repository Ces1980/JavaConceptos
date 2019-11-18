
package com.practicascesar.proyecto1.arreglos;

import javax.swing.JOptionPane;

public class PromedioAlumnoDoWhileFor {
    
    public static void main(String[] args) {
        
        
        
       
        
        /*Bloque de variables*/
        String texto;
        float calificaciones[] = new float[4];
        float suma = 0, promedio = 0;
        int semestres = 0;
       
        /*Declaración de procesos
        *El bucle do-while se rompe cuando se ingresen las cuatro calificaciones
        *
        */
        do {      
            texto = JOptionPane.showInputDialog("Ingrese calificación de alumno por semestre");
            /*Si se ingresa un dato nulo o se cancela el ingreso de calificaciones, se rompe el ciclo*/
            if(texto ==  null){
                break;
            }
            /*Al ingresar un dato numerico se almacena en el arreglo*/
            calificaciones[semestres] = Float.parseFloat(texto);
            /*Suma del contador semestres, el cual permite cerrar el ciclo do-while*/
            semestres++;
        } while (semestres < 4);
        
        /*Bucle for.Each que permite hacer la suma de las calificaciones ingresadas*/
        for (float calificacion : calificaciones) {
            suma+=calificacion;
        }
        /*Presentando el resultado del proceso: promedio de las calificaciones*/
        promedio = suma / semestres;
        if (texto == null) {
            JOptionPane.showMessageDialog(null,"El promedio de calificación es: " + promedio);
            
        } else{
            JOptionPane.showMessageDialog(null,"El promedio de calificación es: " + promedio);
        }
        
    }
}
