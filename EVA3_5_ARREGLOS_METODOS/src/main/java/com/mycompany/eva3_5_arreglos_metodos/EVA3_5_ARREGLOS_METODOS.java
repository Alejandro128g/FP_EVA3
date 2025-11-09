/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_arreglos_metodos;

/**
 *
 * @author chchc
 */
public class EVA3_5_ARREGLOS_METODOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
          // TODO code application logic here
        int[] miArreglo;
        miArreglo = crearArreglo(10, 100);
        imprimirArreglo(miArreglo);
    }

    public static int[] crearArreglo(int tama, int valorAleatorio) {
        int resu[] = new int[tama];
        for (int i = 0; i < resu.length; i++) {
            resu[i] = (int) (Math.random() * valorAleatorio);
        }
        return resu;
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
    }

