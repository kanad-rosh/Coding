package allQuestions;
import java.util.Arrays;
import java.util.Scanner;

class Frequancy{	
public static void countFreq(int arr[], int n)
{
	boolean visited[] = new boolean[n];
	Arrays.fill(visited, false);
	for (int i = 0; i < n; i++) {
		if (visited[i] == true)
			continue;
		int count = 1;
		for (int j = i + 1; j < n; j++) {
			if (arr[i] == arr[j]) {
				visited[j] = true;
				count++;
			}
		}
		System.out.println(arr[i] + " | " + count);
	}
}
public static void main(String []args)
{
	try (Scanner sc = new Scanner(System.in)) {
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		countFreq(arr, n);
	}
}
}
