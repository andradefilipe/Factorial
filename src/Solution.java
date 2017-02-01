import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n >=2 || n <=12){
            System.out.println(factorial(n));
            
        }
        sc.close();
        
    }
    
    private static int factorial(int input){
        if (input <=1)
            return 1;
        else
            return input * factorial(input-1);
        
    }
}