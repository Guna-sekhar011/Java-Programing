import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[]=new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		int size = scan.nextInt();
		scan.close();
		subArray(arr,size);
	}
	public static void subArray(int arr[],int size) {
		for(int i=0;i<=arr.length-size;i++) {
			for(int j=i;j<i+size;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}

}
