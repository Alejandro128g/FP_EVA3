/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_temperatura;

import java.util.Scanner;

/**
 *
 * @author chchc
 */
public class EVA3_4_TEMPERATURA {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        
      
        int valor;
      

        
        do{
            inprimirMenu();
            valor = captu.nextInt();

            switch(valor){
                case 1:
                    System.out.println("");
                    convertirFarCEL();
                    break;
                case 2:
                    System.out.println("");

                    break;
                case 3:
                    System.out.println("");

                    break;
               case 4:
                    System.out.println("");
                    break;     

            }
        }while(valor != 5);
       
    }
  
    public static void inprimirMenu(){
        System.out.println("BIENBENIDO A SISTEMA");
        System.out.println("ELIGE LA OPCION QUE NESESITAS");
        System.out.println("1./ FarCel");
        System.out.println("2./ CelFar"); 
        System.out.println("3./ KelCel");
        System.out.println("4./ KelFar");
        System.out.println("5./ fin");
    }
    
    
    public static void convertirFarCEL(){
         Scanner captu = new Scanner(System.in);
         
         int far;
         double resu;
        System.out.println("grados FAR");
        far=captu.nextInt();
         resu = (far - 32)/ 1.8;
         System.out.println("tu resultado es: " +resu);
       
    }
    
     public static double convertirCelFAR(double cel){
        double resu = cel * 9/5 + 32;
        return resu;
    }
      public static double convertirKelCEL(double kel){
        double resu = kel -233.15;
        return resu;
    }
       public static double convertirKelFAR(double kel){
        double resu = kel -233.15 * 9/5 + 32;
        return resu;
    }
}
