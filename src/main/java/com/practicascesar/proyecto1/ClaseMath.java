
package com.practicascesar.proyecto1;

import java.util.Scanner;


public class ClaseMath {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Raiz cuadrada con Math.sqrt(8) ");
        double numeroRaiz = 8;
        double resRaiz;
        resRaiz = Math.sqrt(numeroRaiz);
        System.out.println("Resultado de raiz: " + resRaiz);
        
        /*CAsteando para obtener numeros sin decimales*/
        System.out.println("Raiz cuadrada con Math.sqrt casteando para no mostrar decimales (8)");
        double numeroRaiz2 = 8;
        int resultadoRaiz;
        resultadoRaiz = (int) Math.sqrt(numeroRaiz2);
        System.out.println("Resultado raiz 2: " + resultadoRaiz);
        
        System.out.println("Potencias con Math.pow(5,5) ");
        double base = 5;
        double exponente= 5;
        double resPotencia = Math.pow(base, exponente);
        System.out.println("Resultado de nuestra potencia... " + resPotencia);
        
        System.out.println("Numero absoluto (negativo a positivo con math.abs(-5.5)");
        float numAbsoluto = -5.5f;
        System.out.println("Valor del numero.." + numAbsoluto);
        System.out.println("Uso de Math.abs....");
        float resultadoAbsoluto = Math.abs(numAbsoluto);
        System.out.println("Numero absoluto.. " + resultadoAbsoluto);
        
        System.out.println("Numero a redondear con Math.round(5.5) ");
        float numeroRedondear = 5.5f;
        float resultadoRedondeo = Math.round(numeroRedondear);
        System.out.println("Numero redondeado... " + resultadoRedondeo);
        
        System.out.println("Obteniendo numero random con Math.random() ");
        double resultadoAleatorio = Math.random();
        System.out.println("Numero random obtenido... " + resultadoAleatorio);
        
        System.out.println("Obteniendo numeros random mayores a 1 ");
        System.out.println(" resultadoAleatorio * 10: " + (resultadoAleatorio * 10));
        System.out.println("Redondeando a numeros enteros...");
        System.out.println("Math.round((resultadoAleatorio * 10))...  " + Math.round((resultadoAleatorio * 10)));
        
        
    }
}
