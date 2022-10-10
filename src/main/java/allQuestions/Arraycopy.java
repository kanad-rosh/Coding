package allQuestions;

import java.util.Scanner;

public class Arraycopy {    
    public static void main(String[] args) {  
    	try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt(); 
			int [] arr1 = new int [n] ;  
			for(int i=0;i<n;i++) arr1[i]=sc.nextInt();
			int arr2[] = new int[arr1.length];    
			for (int i = 0; i < arr1.length; i++) {     
			    arr2[i] = arr1[i];     
			}        
			System.out.println("Elements of original array: ");    
			for (int i = 0; i < arr1.length; i++) {     
			   System.out.print(arr1[i] + " ");    
			}     
			    
			System.out.println();       
			System.out.println("Elements of new array: ");    
			for (int i = 0; i < arr2.length; i++) {     
			   System.out.print(arr2[i] + " ");    
			}
		}     
    }    
}    