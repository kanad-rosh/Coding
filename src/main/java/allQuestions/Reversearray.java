package allQuestions;

import java.util.Scanner;

public class Reversearray {

	public static void main(String[] args) { 
    	try (Scanner sc = new Scanner(System.in)) {
			int n= sc.nextInt();
			int [] arr = new int [n];  
			for(int i=0;i<n;i++) arr[i]=sc.nextInt();  
				System.out.println("Reverse of Array");
	    	for(int i = n-1; i>=0;i--) {
	    		System.out.print(arr[i] + " ");
    	}
    	}
    	}
}
