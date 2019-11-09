
package com.practicascesar.proyecto1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class CalcularEdad {
    
    public static void main(String[] args) {
        Scanner entrada  = new Scanner (System.in);
        
        System.out.println("Año de nacimiento: ");
        int anio = entrada.nextInt();
        System.out.println("Mes de nacimiento: ");
        int mes = entrada.nextInt();
        System.out.println("Día de nacimiento");
        int dia = entrada.nextInt();
        Calendar fechaNacimiento = new GregorianCalendar(anio, mes, dia);
        Calendar fechaHoy = Calendar.getInstance();
       
        int anioNacimiento= fechaNacimiento.get(Calendar.YEAR);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        System.out.println("Año actual: " + anioHoy  + " Mes actual: " + fechaHoy.get((Calendar.MONTH)));
        int edad = anioHoy - anioNacimiento;
        
        System.out.println("Dia de hoy " + fechaHoy.getTime());
        
        System.out.println("Edad: " + edad);
        
        /*Ejemplo de usuo de la clase Calendar en Java: 
        http://chuwiki.chuidiang.org/index.php?title=Clase_Calendar_de_Java
         */
    }
}
