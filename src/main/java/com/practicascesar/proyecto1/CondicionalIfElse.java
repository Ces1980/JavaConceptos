
package com.practicascesar.proyecto1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CondicionalIfElse {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numeroUsuario, numSistema;
        /*Entregar número entero generado con el método Math.random() 
        casteado */
        numSistema = (int)(Math.random()* 10);
        
        System.out.println("Ingresa este número " +numSistema + ": ");
        numeroUsuario = entrada.nextInt();
        
        if (numeroUsuario == numSistema) {
            System.out.println("Ingreso el mismo número");
        } else {
            JOptionPane.showMessageDialog(null, "Ingreso un número diferente");
        }
    }
}
