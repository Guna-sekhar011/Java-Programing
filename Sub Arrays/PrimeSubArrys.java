import java.util.Iterator;
import java.util.Scanner;

public class PrimeSubArrys {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		for(int size=1;size<=arr.length;size++) {
			for(int i=0;i<=arr.length-size;i++) {
				int sum=0;
				for(int j=i;j<i+size;j++) {
					sum+=arr[j];
				}
				if (isPrime(sum)) {
					for(int j=i;j<i+size;j++) {
						System.out.print(arr[j]+" ");
					}
					System.out.println();
				}
			}
		}

	}
	public static boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
	}

}
