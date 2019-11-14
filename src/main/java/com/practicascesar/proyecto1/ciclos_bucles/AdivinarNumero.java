package com.practicascesar.proyecto1.ciclos_bucles;

import java.util.Random;

import javax.swing.JOptionPane;

public class AdivinarNumero {

    public static void main(String[] args) {

        Random rand = new Random();
        /*Generando el numero aleatorio del programa*/
        int aleatorio = rand.nextInt(5) + 1;
        /*Conteos del ciclo while*/
        int conteos = 1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Humano que numero estoy pensado (entre 1 y 5) dijita 0 para salir"));
        while (num != aleatorio) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Humano estupdo te equivocaste en que numero estoy pensado (entre 1 y 5) dijita 0 para salir"));
            if (num == 0) {
                break;
            }
            aleatorio = rand.nextInt(5) + 1;

            conteos++;
        }

        /*Mensajes de salida al empatar numeros*/
        if (num != 0) {
            JOptionPane.showMessageDialog(null, "Bien jugado humano");
        } else {
            JOptionPane.showMessageDialog(null, "Huamno estupido el numero era " + aleatorio);
        }

        JOptionPane.showMessageDialog(null, "Numero de iteracciones..." + conteos);
    }

}
