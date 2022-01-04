//To sort the elements in given array using insertion sort
import java.io.*;
import java.util.*;
public class Insertion {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i>-1) && (array[i]>key) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr = {12,18,19,13,17,11,16,15,14,15};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr); 
           
        System.out.println("After Insertion Sort");    
        for(int i:arr){    
            System.out.print(i+" ");    
        }    
    }    
} 
/*
Output:
Before Insertion Sort
12 18 19 13 17 11 16 15 14 15
After Insertion Sort
11 12 13 14 15 15 16 17 18 19
*/
