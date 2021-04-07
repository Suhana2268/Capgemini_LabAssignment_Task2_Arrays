package arraysLab;
import java.util.Scanner;

public class ReverseAndSort {
	
	


	public static int reverse(int n) {
		int x = n;
		int rev = 0;
		while(n != 0) {
			x =  n%10;
			rev = rev * 10 + x;
			n /= 10;
		}
		return rev;
	}
	public static int[] getSorted(int arr[]) {
		int arr1[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arr1[i] = reverse(arr[i]);
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr1[j] > arr1[j+1]) {
					int temp = arr[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
			}
		}
		return arr1;
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
		System.out.println("The reversed array is:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(reverse(arr[i])+" ");
		}
		int arr1[] = new int[arr.length];
		arr1 = getSorted(arr);
		
		
		
		System.out.println("\n"+"The sorted array is:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		

	}

}
