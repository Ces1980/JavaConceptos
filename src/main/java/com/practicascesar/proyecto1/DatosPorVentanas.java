
package com.practicascesar.proyecto1;

import javax.swing.JOptionPane;


public class DatosPorVentanas {
    
     public static void main(String[] args) {
        
         /*Ingresar un mesaje*/
         String mensaje = JOptionPane.showInputDialog("Ingresa una cadena de texto");
         
         /*Mostrar el mensaje previamente ingreesado*/
         JOptionPane.showMessageDialog(null, "Este es tu es String: "+ mensaje);
         
         /*Ingresar dato entero parseando String*/
         int entero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un dato entero"));
         JOptionPane.showMessageDialog(null, "Este es tu número entero: "+ mensaje);
         
          /*Ingresar dato float parseando String*/
         float flotante = Float.parseFloat(JOptionPane.showInputDialog("Ingresa un dato tipo float"));
         JOptionPane.showMessageDialog(null, "Este es tu número entero: "+ flotante);
         
         
          /*Ingresar dato double parseando String*/
         double doble = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un dato tipo"));
         JOptionPane.showMessageDialog(null, "Este es tu número entero: "+ doble);
         
         /*Ingresando un caracter y pbtenoendo el caracter en la posicion 6 */
         char letra = JOptionPane.showInputDialog("Ingresa una letra").charAt(5);
         JOptionPane.showMessageDialog(null, "Este es un char: "+ letra);
    }
    
}
