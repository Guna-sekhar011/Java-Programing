import java.util.Scanner;

class UpperCase{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String result = toUpperCase(input);
        System.out.println("Original String: " + input);
        System.out.println("Uppercase: " + result);
    }


    static String toUpperCase(String str){
        String upper_case = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                int add = str.charAt(i) - 32;
                char ch = (char)add;
                upper_case = upper_case + ch;
            }
            else{
                upper_case = upper_case + str.charAt(i);
            }

        }
        return upper_case;
    }
    
}