package allQuestions;

import java.util.Scanner;

class Leftrotate {  
    public static void main(String[] args) { 
    	try (Scanner sc = new Scanner(System.in)) {
			int p= sc.nextInt();
			int [] arr = new int [p];  
			for(int i=0;i<p;i++) arr[i]=sc.nextInt();
			int n = sc.nextInt();  
			for(int i = 0; i < n; i++){  
			    int j, first;  
			    first = arr[0];  
			    for(j = 0; j < arr.length-1; j++){  
			        arr[j] = arr[j+1];  
			    }  
			    arr[j] = first;  
			}  
			System.out.println();  
			System.out.println("Array after left rotation: ");  
			for(int i = 0; i< arr.length; i++){  
			    System.out.print(arr[i] + " ");  
			}
		}  
    }  
}  
