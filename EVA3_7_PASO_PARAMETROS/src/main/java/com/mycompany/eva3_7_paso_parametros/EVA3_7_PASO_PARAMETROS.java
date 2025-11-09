/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_paso_parametros;

/**
 *
 * @author chchc
 */
public class EVA3_7_PASO_PARAMETROS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         int nume = 5;
        System.out.println("Numero original = " + nume);
        incrementar(nume);
        System.out.println("Despues de incrementar = " + nume);
    }

    public static void incrementar(int valor) {
        valor = valor + 1;
    }
    }

