package New;
import java.util.Scanner;
class rec{
	void recursionFun(int count, int x) {
		if (count%2==0) {
			System.out.println(count);
		}
		if (count<x){
			count++;
			recursionFun(count,x);
		}
	}
}
public class Day33 {

	public static void main(String[] args) {
		System.out.println("Enter range: ");
		Scanner scan = new Scanner(System.in);
		int ran = scan.nextInt();
		rec r = new rec();
		r.recursionFun(1,ran);
	}
}