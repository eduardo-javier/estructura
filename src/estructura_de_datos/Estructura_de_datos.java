/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Estructura_de_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Scanner miScanner=new Scanner(System.in);
		Random random=new Random();
		System.out.println(" De que tamano desea el arreglo");
		int x=miScanner.nextInt();
		int arr[]=new int[x];
		for(int i=0;i<arr.length;i++) {
			int n = (int)(random.nextInt(1000) );
			arr[i]=n;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print("["+arr[i]+"]");
		}
		System.out.println("\n***********************************************************************");
        bubble burbuja = new bubble();
        System.out.println("bubble\n");
        burbuja.bubbleSort(arr);
        System.out.println(" Arreglo ordenado");
        burbuja.printArray(arr);
                final double NS=1000000000;
    long inicioNS=System.nanoTime();
    burbuja.bubbleSort(arr);
    long duracionNS=System.nanoTime()-inicioNS;
      System.out.println(" lo que se tarda el bubble sort es: "+duracionNS+" nanosegundos");
        
        System.out.println("***********************************************************************");
        
        
        System.out.println("merge\n");
   	 
       
 
        merge merge = new merge();
        merge.sort(arr, 0, arr.length-1);
 
        System.out.println("\nArreglo ordenado ");
        merge.printArray(arr);
        
        final double NSm=1000000000;
          long inicioNSm=System.nanoTime();
          merge.sort(arr, x, x);
          long duracionNSm=System.nanoTime()-inicioNSm;
          System.out.println(" lo que se tarda el merge sort es: "+duracionNSm+" nanosegundos");
	}

   
}

