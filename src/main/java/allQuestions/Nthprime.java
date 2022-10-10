package allQuestions;

import java.util.Scanner;  
public class Nthprime   
{  
public static void main(String[] args)   
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
int n = sc.nextInt();   
int num=1, count=0, i;  
while (count < n)  
{  
num=num+1;  
for (i = 2; i <= num; i++)  
{   
if (num % i == 0)   
{  
break;  
}  
}  
if (i == num)  
{  
count = count+1;  
}  
}
if(n==1)
	System.out.println("The " +n +"st prime number is: " + num);  
else if(n==2)
	System.out.println("The " +n +"nd prime number is: " + num);
else if(n==3)
	System.out.println("The " +n +"rd prime number is: " + num); 
else 
	System.out.println("The " +n +"th prime number is: " + num);  
}  
}  
