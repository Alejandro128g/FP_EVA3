/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_14_sobrecarga_de_metodo;

import java.util.Scanner;

/**
 *
 * @author chchc
 */
public class EVA3_14_SOBRECARGA_DE_METODO {

    public static void main(String[] args) {
     Scanner captu = new Scanner(System.in);
        
      
        int valor;
      

        
        do{
            inprimirMenu();
            valor = captu.nextInt();

            switch(valor){
                case 1:
                    System.out.println("CIRCULO");
                    calcularArea();
                    break;
                case 2:
                    System.out.println("RECTANGULO");
                    calcularArea(10);
                    break;
                case 3:
                    System.out.println("TRAPECIO");
                    calcularArea(1.1);
                    break;
               case 4:
                    System.out.println("HAY NOS VEMOS XDDDDDD");
                    break;     

            }
        }while(valor != 5);
       
    }
  
    public static void inprimirMenu(){
        System.out.println("BIENBENIDO A SISTEMA");
        System.out.println("ELIGE LA OPCION QUE NESESITAS");
        System.out.println("1./ Circulo");
        System.out.println("2./ Rectangulo"); 
        System.out.println("3./ Trapecio");
        System.out.println("4./ fin");
    }
    
    
    public static void calcularArea(){
         Scanner captu = new Scanner(System.in);
         
         double radio;
         double resu;
         
        System.out.println("dame tu radio");
        radio=captu.nextDouble();
         resu = 3.1416*(radio*radio);
         System.out.println("El area de tu circul es: " +resu);
       
    }
    
     public static int calcularArea(int altura1){
         Scanner captu = new Scanner(System.in);
         
         int base,altura;
         int resu;
         
            System.out.println("dame tu base");
            base=captu.nextInt();
            System.out.println("dame tu altura");
            altura=captu.nextInt();
             resu = base*altura;
             System.out.println("el area de tu rectangulo es: " +resu);
              return resu;
    }
      public static double calcularArea(double base){
        Scanner captu = new Scanner(System.in);
        
        double base1,base2,altura, resu;
        
         System.out.println("dame tu base");
            base1=captu.nextInt();
         System.out.println("dame tu base");
            base2=captu.nextInt();
         System.out.println("dame tu base");
            altura=captu.nextInt();
            resu=(base1+base2)*altura/2;
            System.out.println("el area de tu trapecio es: " +resu);
        return resu;
    }
      
    }

