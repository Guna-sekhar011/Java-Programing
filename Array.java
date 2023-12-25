package Array;

import java.util.Scanner;

class Application{
	
	void print(int arr[]){
		System.out.println("Printing values...");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	void even(int arr[]) {
		System.out.println("Even numbers..");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	void reverse(int arr[]) {
		System.out.println("Reversing the array..");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	
	int sum(int arr[]) {
		System.out.println("Sum of Array is:");
		int Sum=0;
		for(int i = 0; i<arr.length;i++) {
			Sum +=arr[i];
		}
		return Sum;
	}
	
	long product(int arr[]) {
		System.out.println("Product of Array:");
		long Product = 1;
		for(int i=0;i<arr.length;i++) {
			Product = Product * arr[i];
		}
		return Product;
	}
	
	int Max(int arr[]) {
		int max = 0;
		System.out.println("Maximum number: ");
		for(int i =0 ; i<arr.length;i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
}




public class Array {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter lenght of the array: ");
		int n = Scan.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter values...");
		for(int i=0;i<n;i++) {
			arr[i]=Scan.nextInt();
		}
		
		Application a = new Application();
		a.print(arr);
		a.even(arr);
		a.reverse(arr);
		System.out.println(a.sum(arr));
		System.out.println(a.product(arr));
		System.out.println(a.Max(arr));

}
}
