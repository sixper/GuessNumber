package Solution;

import java.util.*;

public class Sort3Number {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int a = input.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        int b = input.nextInt();

        System.out.print("3. Sayıyı giriniz: ");
        int c = input.nextInt();


        if(a >= b && a >= c){

            System.out.print(a + " >= ");

            if(b >= c)
                System.out.print(b + " >= " + c);
            else
                System.out.print(c + " >= " + b);

        }else if(b >= a && b >= c){

            System.out.print(b + " >= ");

            if(a >= c)
                System.out.print(a + " >= " + c);
            else
                System.out.print(c + " >= " + a);


        }else{

            System.out.print(c + " >= ");

            if(a >= b)
                System.out.print(a + " >= " + b);
            else
                System.out.print(b + " >= " + a);


        }



        input.close();

    }
}
