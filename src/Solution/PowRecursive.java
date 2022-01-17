package Solution;

import java.util.*;

public class PowRecursive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a base value : ");
        int base = input.nextInt();

        System.out.print("Enter a power value : ");
        int power = input.nextInt();

        System.out.println("Result is " + pow(base, power));






    }


    public static int pow(int base, int pow){


        if(pow > 0){

            return base * pow(base, pow - 1);

        }else{

            return 1;

        }


    }











}
