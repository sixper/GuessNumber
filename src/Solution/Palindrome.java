package Solution;

import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        isPalindrome(number);





    }


    public static void isPalindrome(int x){

        int sum = 0;
        int number = x;

        while(number != 0){

            sum = (sum * 10) + (number % 10);
            number /= 10;

        }

        if(sum == x)
            System.out.println(x + " is a palindrome. ");
        else
            System.out.println(x + " is not a palindrome. ");



    }











}
