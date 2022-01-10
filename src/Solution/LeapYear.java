package Solution;

import java.util.*;

public class LeapYear {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        int year = input.nextInt();


        if(year % 4 == 0){

            if(year % 100 == 0){

                if(year % 400 == 0)
                    System.out.println(year + " bir artık yıldır !");
                else
                    System.out.println(year + " bir artık yıldır değildir !");

            }else
                System.out.println(year + " bir artık yıldır !");


        }else
            System.out.println(year + " bir artık yıldır değildir !");



        input.close();

    }
}
