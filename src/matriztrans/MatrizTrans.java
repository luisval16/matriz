/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matriztrans;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class MatrizTrans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][] = new int [4][4];
        int asig = 1;
        for(int i = 0; i < 4;i++){
          for(int j = 0; j <4; j++){
              matriz[i][j] = asig;
          }
          asig = asig+1;
        }
        
         
        
        
    }
    public int[][] transponer(int mat[][]){
     int matrizT[][] = new int[4][4];
     
     for(int i = 0; i < mat.length;i++){
       for(int j = 0; j <4;j++){
       matrizT[j][i] = mat[i][j];
       
       }
     
     }
        return matrizT;
    }
    
    public void mostrar(int matriz[][]){
      for(int i=0;i<4;i++){
       for(int j=0;j<4;j++){
       if(!(j == 3)){
       System.out.print(matriz[i][j]+",");
       }else{
           System.out.println(matriz[i][j]);
       }
       }
       }
      }
    
     public int[][] llenarMatriz(){
     int matriz[][] = new int[4][4];
     
     Scanner leer = new Scanner(System.in);
     for(int i=0;i<4;i++){
       for(int j=0;j<4;j++){
         System.out.println("Ingrese el valor de la posición " +i+ "," +j+":");
         matriz[i][j] = leer.nextInt();
       }
     }
     
    return matriz;
     }
    }
    

