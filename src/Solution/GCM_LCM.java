package Solution;

import java.util.*;

public class GCM_LCM {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = input.nextInt();

        System.out.print("Enter second number: ");
        int n2 = input.nextInt();

        int max = 0;


        int i = 1;
        while(i <= n1 && i <= n2){

            if(n1 % i == 0 && n2 % i == 0){

                max = Math.max(max, i);

            }

            i++;

        }

        System.out.println("\nGreatest common divisor of " + n1 + "-" + n2 + " is: " + max);
        System.out.println("Lowest common multiple of " + n1 + "-" + n2 + " is: " + (n1 * n2) / max);


    }


}
