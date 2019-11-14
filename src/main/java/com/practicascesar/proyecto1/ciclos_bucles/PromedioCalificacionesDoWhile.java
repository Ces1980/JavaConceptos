package com.practicascesar.proyecto1.ciclos_bucles;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PromedioCalificacionesDoWhile {

    public static void main(String[] args) {

        /*MEtiendo dentro de un try catch el código por un mal manejo de la ventana del JOPANE*/
        try {

            /*Declaración de variables*/
            int contador = 0;
            float calificacion = 0, suma = 0, promedio;
            String texto;

            /*Ingreso de calificaciones*/
            do {
                texto = JOptionPane.showInputDialog("Ingresa la calificacion del semestre " + (contador + 1));
                System.out.println(texto);
                /*Validando ingreso de datos*/
                if (texto != null) {
                    calificacion = Float.parseFloat(texto);
                    suma = suma + calificacion;
                    contador++;

                }

            } while (texto != null);

            if (contador > 0) {
                promedio = suma / contador;
                JOptionPane.showMessageDialog(null, "Promedio=" + promedio);
            } else {

                JOptionPane.showMessageDialog(null, "Humano estupido debes de poner por lo menos una calificacion");
            }

        } catch (Exception e) {

            System.out.println("Mensaje: " + e.getMessage());
        }
    }
}
