package arraysLab;

import java.util.Arrays;
import java.util.Scanner;


public class DuplicateDesc {
	static int j = 0;
	public static int[] modifyArray(int []arr) {
		
		Arrays.sort(arr);
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[arr.length-1];
		for(int i = 0; i < j; i++) {
			for(int k = 0; k < j-i-1; k++) {
				if(arr[k] < arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
		
		
		return arr;
		
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
		int arr1[] = new int[arr.length];
		arr1 = modifyArray(arr);
		System.out.println("The duplicates are removed and the array has sorted in descending order");
		if (j < arr.length) {
			System.out.println("The duplicates are removed and the array has sorted in descending order");
		for(int i = 0; i < arr.length-1; i++) {
			System.out.print(arr1[i]+" ");
		}
		}
		else {
			System.out.println("There are no duplicates found");
			
			if(j == arr.length) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr1[i]+" ");
			}
			}
		}
	}

}
