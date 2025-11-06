/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_metodos;

import java.util.Scanner;

/**
 *
 * @author chchc
 */
public class EVA3_3_METODOS {

    public static void main(String[] args) {
      
        Scanner captu = new Scanner(System.in);
        int valor;
        do{
                inprimirMenu();
                valor =captu.nextInt();
                   
                switch(valor){
                    case 1:
                        System.out.println("suma 2 numeros");
                        realisarSuma();
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                        
                
                }
        }while(valor != 4);
      
    }
    public static void inprimirMenu(){
        System.out.println("BIENBENIDO A SISTEMA");
        System.out.println("ELIGE LA OPCION QUE NESESITAS");
        System.out.println("1./ CALCULAR UNA SUMA");
        System.out.println("2./CALCULAR UNA POTENCIA"); 
        System.out.println("3./INPRIMIR UN MENSAJE");
        System.out.println("4./TERMINAR");
    }
    public static void realisarSuma(){
        Scanner captu = new Scanner(System.in);
        
        int vall, val2;
        System.out.println("valor 1");
        vall=captu.nextInt();
        System.out.println("valor 2");
        val2=captu.nextInt();
        int resu = sumar(vall,val2);
        System.out.println("la suma es" +resu);
    }
     public static int sumar(int num1,int num2){
        return num1 + num2;
     }
     public static void calcularPotencia(){
         Scanner captu = new Scanner(System.in);
        
        int vall, val2;
         System.out.println("");
         vall= captu.nextInt();
         System.out.println("");
         val2= captu.nextInt();
         
     }
      public static int calcularPotencia(int base,int expo){
      int potencia =1;
      for(int i = 1 ; i <= expo; i++){
      
          
            potencia= potencia*base;
      }
      return potencia;
      }
}
