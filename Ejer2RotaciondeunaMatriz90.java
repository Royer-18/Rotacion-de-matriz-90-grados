/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2rotaciondeunamatriz90;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejer2RotaciondeunaMatriz90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in); 
        
        System.out.println("ingrese la dimension de la matriz: ");
        int d = teclado.nextInt(); 
        
        int matriz [][] = new int [d][d];
        
        System.out.println("INGRESE LOS ELEMENTOS: ");
        for (int i=0;i<d;i++){
            for (int j=0;j<d;j++){
                matriz[i][j]=teclado.nextInt(); 
            }
        }
       
        System.out.println("MATRIZ ORIGINAL: ");
        //mostrar matriz 
        for (int i=0;i<d;i++){
            for (int j=0;j<d;j++){
                System.out.print("["+ matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        System.out.println("MATRIZ ROTADA 90°: ");
        
       
            for (int j=0;j<d;j++){
               for (int i=d-1;i>=0;i--){
                   System.out.print("["+ matriz[i][j] +"]");
               }  
                System.out.println("");
            }
        
        
        
        
    }
    
}
