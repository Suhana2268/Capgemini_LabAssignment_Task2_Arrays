package arraysLab;

import java.util.Scanner;

public class SecondSmallElement {
	public static int getSecondSmallest(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		
		return arr[1];
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = getSecondSmallest(arr);
		System.out.println("The second smallest element is:" + res);

	}

}
