//Program to sort elments using bubble sort
import java.io.*;
import java.util.*;
public class Bubble
{  
    static void bubbleSort(int[] array)
     {  
        int n = array.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         
         {  
                 for(int j=1; j<(n-i); j++)
                 {  
                          if(array[j-1] > array[j])
                          {  
                                 //swap elements  
                                 temp = array[j-1];  
                                 array[j-1] = array[j];  
                                 array[j] = temp;  
                         }  
                          
                 }  
         }  
  
    } 
    public static void main(String[] args) {  
        int array[] ={9,5,8,4,6,7,2,1,9,4};  
         
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < array.length; i++){  
                System.out.print(array[i] + " ");  
        }  
        System.out.println();  
        bubbleSort(array);
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < array.length; i++){  
                System.out.print(array[i] + " ");  
        }  

}  
}

/*
OUTPUT:
Array Before Bubble Sort
9 5 8 4 6 7 2 1 9 4
Array After Bubble Sort
1 2 4 4 5 6 7 8 9 9
*/