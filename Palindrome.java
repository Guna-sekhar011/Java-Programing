import java.util.Scanner;

class Palindrome{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str2 ="";
        for(int i=str.length()-1;i>=0;i--){
            str2=str2+str.charAt(i);
        }
    
        int res = str.compareTo(str2);
        if(res==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    
    }
}
