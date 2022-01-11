package Solution;

import java.util.*;

public class PowerOf4_5 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int num = input.nextInt();


        for(int i = 1; i <= num; i *= 4){

            System.out.println(i + " 4'ün bir kuvvetidir.");

        }

        System.out.print("\n");


        for(int i = 1; i <= num; i *= 5){

            System.out.println(i + " 5'in bir kuvvetidir.");

        }













        input.close();

    }
}
