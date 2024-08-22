import java.util.Scanner;
public class DigitPalindromeChecker {
    public static void main(String[] args) {
         
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         if(reverse(n)==n){
             System.out.print("Palindrome");
         }
         else{
             System.out.print("Not a Palindrome");
         }

         
    }
    
    static int reverse(int num){
        int rev = 0;
        int last=0;
        while(num!=0){
            last = num%10;
            rev = rev*10 +last;
            num = num/10;
        }
        return rev;
    }
    
}
