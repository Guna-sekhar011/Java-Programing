import java.util.Scanner;
class ReverseDigits {
    public static void main(String[] args) {
         
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         System.out.print(reverse(n));
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
