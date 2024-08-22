import java.util.Scanner;
class SumOfDigits {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum1 = sum(n);
        System.out.print(sum1);
    }


    static int sum(int n){
      int sum=0;
      while(n!=0){
        sum=sum + n%10;
        n=n/10;
      }
      return sum;
    }
}
      
