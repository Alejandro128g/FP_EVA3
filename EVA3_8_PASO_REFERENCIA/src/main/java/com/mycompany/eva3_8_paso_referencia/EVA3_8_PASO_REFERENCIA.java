/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_paso_referencia;

/**
 *
 * @author chchc
 */
public class EVA3_8_PASO_REFERENCIA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
          int[] datos = new int[1];
        datos[0] = 5;
        System.out.println(datos);
        System.out.println("Numero original = " + datos[0]);
        incrementar(datos);
        System.out.println("Despues de incrementar = " + datos[0]);
    }

    public static void incrementar(int[] arreglo) {
        System.out.println(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] + 1;
        }
    }
    }

