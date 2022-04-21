package Midterm2Coding;

import java.util.Scanner;

public class NotPalindromeDriver {
    public static void main(String[] args) throws NotPalindrome {
        Scanner scan = new Scanner(System.in);
        NotPalindrome problem = new NotPalindrome();

        System.out.println("Enter an integer: ");
        int value = scan.nextInt();

        int result = palindrome(value, 0);

        try{
            if(result != value)
                throw problem;
            System.out.println("The value inputted is a palindrome.");
        }
        catch(NotPalindrome e){
        	System.out.println(e.getMessage());
        }
    }

    private static int palindrome(int value, int result) {
        if(value == 0){
            return result;
        }
        else{
            return palindrome(value/10, value%10+result*10);
        }
    }
}
