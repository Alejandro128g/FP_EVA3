/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_11_capturas_clientes;

import java.util.Scanner;

/**
 *
 * @author chchc
 */
public class EVA3_11_CAPTURAS_CLIENTES {

    public static void main(String[] args) {
        String[] clientes = new String[5];
        double[] credito = new double[5];

        capturarClientes(clientes, credito);

        System.out.println("CLIENTES:");
        imprimir(clientes);
        System.out.println("CREDITO:");
        imprimir(credito);
        System.out.println("TODO:");
        imprimir(clientes, credito);
    }

    public static void capturarClientes(String[] clientes, double[] credito) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Nombre del cliente: ");
            clientes[i] = input.nextLine();

            System.out.println("Crédito: ");
            credito[i] = input.nextDouble();
            input.nextLine();
        }
    }

    public static void imprimir(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
    }

    public static void imprimir(double[] credito) {
        for (int i = 0; i < credito.length; i++) {
            System.out.println("[" + credito[i] + "]");
        }
    }

    public static void imprimir(String[] arreglo, double[] credito) {
        for (int i = 0; i < credito.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
            System.out.println("[" + credito[i] + "]");
        }
        System.out.println("");
    }
    }

