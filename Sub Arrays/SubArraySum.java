
import java.util.Scanner;

public class SubArraySum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[]=new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		scan.close();
		for(int size=1;size<=arr.length;size++) {
			for(int i=0;i<=arr.length-size;i++) {
				int sum=0;
				for(int j=i;j<i+size;j++) {
					sum=sum+arr[j];
				}
				if(sum==k) {
					for(int j=i;j<i+size;j++) {
						System.out.print(arr[j]+" ");
					}
					System.out.println();
				}
			}
		}
		
	}

}
