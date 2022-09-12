

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_15_Copia_arreglos {
    public static void main(String[]args){
        int[] arregloDatos=new int[20];
        llenar(arregloDatos);
        imprimir(arregloDatos);
        //Copiar los valores almacenados en el arreglo
        int[] arregloCopia = new int[arregloDatos.length];
        System.out.println("");
        System.out.println(arregloDatos);
        System.out.println(arregloCopia);
        //como crear  la copia de los valores?
        for (int i = 0; i < arregloDatos.length; i++) {

            arregloCopia[(arregloCopia.length)-(i+1)]=arregloDatos[i];
                      
        }   
        //Imprimir arregloCopia
        imprimir(arregloCopia);
    }
        
    public static void llenar(int[]arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=(int)(Math.random()*100);
           
        }
    }
    
    public static void imprimir(int[]arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
            
        }
    }
    
}
