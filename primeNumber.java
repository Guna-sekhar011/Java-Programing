package Prime;
import java.util.Scanner;

//checking prime number or not
class checker{
	
	boolean check(int n) {
		int count = 0;
		for(int i = 1;i<=n;i++) {
			if(n%i==0) {
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

//printing prime numbers 
class printer{
	
	void print(int n) {
		for(int i = 1;i<=n;i++) {
			int count = 0;
			for(int j = 1 ; j<=i ; j++)
			if (i%j==0) {
				count++;
			}
			if(count==2) {
				System.out.println(i);
			}
		}
	}
}

//simplified version 
class printer2 extends checker{
	void print(int num) {
		for(int i=1 ;i<=num;i++) {
			if(check(i)) {
				System.out.println(i);
			}
		}
	}
}

//printing prime numbers within the range
class rangePrinter extends checker{
	void print(int start, int end) {
		for(int i = start; i<=end; i++) {
			if(check(i)) {
				System.out.println(i);
			}
		}
	}
}


public class primeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check wether it is prime or not: ");
		int prime = scan.nextInt();
		
		checker c = new checker();
		System.out.println(c.check(prime));
		
		System.out.println("Enter range: ");
		int range = scan.nextInt();
		
		printer2 p = new printer2();
		p.print(range);
		
		System.out.println("Enter number starts from:");
		int start = scan.nextInt();
		System.out.println("Enter number to end:");
		int end = scan.nextInt();
		
		rangePrinter r = new rangePrinter();
		r.print(start, end);
	}

}
