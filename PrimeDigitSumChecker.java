import java.util.Scanner;
class PrimeDigitSumChecker {
    public static void main(String[] args) {
         
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int sum1 = sum(n);
         if(checkPrime(sum1)){
             System.out.print(true);
         }
         else{
             System.out.print(false);
         }
        
    }
        
        static int sum(int n){
            int sum=0;
            while(n!=0){
                sum=sum + n%10;
                n=n/10;
            }
        return sum;
    }

  
        static boolean checkPrime(int num){
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
        
}
