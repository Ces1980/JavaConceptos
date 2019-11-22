package com.practicascesar.proyecto1.arreglos;

import javax.swing.JOptionPane;

public class IntercambiarContenidoArreglos {

	public static void main(String[] args) {
		
		/*Declaración e inicialización de arreglos y variables globales */
		int a[] = new int [5],  b[] = new int [5], c[] = new int [10];
		
		
		/*Llenado del primer arreglo*/
		for (int i = 0; i < 5; i++) {
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de " + (i + 1) + " del primer arreglo"));
		}
		
		/*LLenado del segundo arreglo*/
		for (int i = 0; i < 5; i++) {
			b[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de " + (i + 1) + " del segundo arreglo"));
		}
		
		/*Declaración de variable j la cual va fungir como variable auxiliar y contador para llenar el arreglo con los
		 * arreglos anteriormente declarados*/
		int j = 0;
		
		for (int i = 0; i < 5; i++) {
			c[j] = a[i];
			j++;
			c[j] = b[i];
			j++;
		}
		
		/*Funcionamiento del ciclo for:
		 *c[j] = a[i]: el valor de a[i](primer arreglo)  es la posicion 0 es asignado a c[j] (tercer arreglo)
		 *j++: el valor de j pasa a ser 1
		 *c[j] = b[i]; el valor de b[i](segundo arreglo) es la posicion 0 es asignado a la poscición 
		 * 1 de c[j] (tercer arreglo) 
		 *j++: ahora el valor pasa a ser 2
		 * */
		
		
		/*Mostrar los valores de los 10 elementos del tercer arreglo*/
		for(int elemento:c) {
			
			System.out.println(elemento);
		}
	}
}
