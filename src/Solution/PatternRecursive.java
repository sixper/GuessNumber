package Solution;

import java.util.*;

public class PatternRecursive {

    public static int number;
    public static boolean control = false;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N number : ");
        number = input.nextInt();


        printPattern(number);



    }


    public static void printPattern(int x){

        System.out.print(x + " ");

        if(x == number && control)
            return;


        if(x > 0 && !control){

            printPattern(x - 5);

        }else{

            control = true;
            printPattern(x + 5);

        }


    }














}
