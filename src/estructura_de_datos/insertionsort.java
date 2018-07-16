/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datos;

/**
 *
 * @author Eduardo
 */
public class insertionsort {
 
    
    void insertionSort(int arr[])
{int  n = arr.length;  
   int i, key, j;
   for (i = 1; i < n; i++)
   {
       key = arr[i];
       j = i-1;
 
       while (j >= 0 && arr[j] > key)
       {
           arr[j+1] = arr[j];
           j = j-1;
       }
       arr[j+1] = key;
   }
}
    
    void printArray(int arr[])
{int  n = arr.length;
   int i;
   for (i=0; i < n; i++)
        System.out.print(arr[i]+" ");
        System.out.println();
}
}