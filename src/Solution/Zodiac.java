package Solution;

import java.util.*;

public class Zodiac {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı rakam olarak giriniz : ");
        int month = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz : ");
        int day = input.nextInt();


        if(month == 1){

            if(day <= 21)
                System.out.println("\nOğlak burcu. ");
            else
               System.out.println("\nKova burcu");

        }else if(month == 2){

            if(day <= 19)
                System.out.println("\nKova burcu. ");
            else
               System.out.println("\nBalık burcu");

        }else if(month == 3){

            if(day <= 20)
                System.out.println("\nBalık burcu. ");
            else
               System.out.println("\nKoç burcu");

        }else if(month == 4){

            if(day <= 20)
                System.out.println("\nKoç burcu. ");
            else
               System.out.println("\nBoğa burcu");

        }else if(month == 5){

            if(day <= 21)
                System.out.println("\nBoğa burcu. ");
            else
               System.out.println("\nİkizler burcu");

        }else if(month == 6){

            if(day <= 22)
                System.out.println("\nİkizler burcu. ");
            else
               System.out.println("\nYengeç burcu");

        }else if(month == 7){

            if(day <= 22)
                System.out.println("\nYengeç burcu. ");
            else
               System.out.println("\nAslan burcu");

        }else if(month == 8){

            if(day <= 22)
                System.out.println("\nAslan burcu. ");
            else
               System.out.println("\nBaşak burcu");

        }else if(month == 9){

            if(day <= 22)
                System.out.println("\nBaşak burcu. ");
            else
               System.out.println("\nTerazi burcu");

        }else if(month == 10){

            if(day <= 22)
                System.out.println("\nTerazi burcu. ");
            else
               System.out.println("\nAkrep burcu");

        }else if(month == 11){

            if(day <= 21)
                System.out.println("\nAkrep burcu. ");
            else
               System.out.println("\nYay burcu");

        }else{

            if(day <= 21)
                System.out.println("\nYay burcu. ");
            else
               System.out.println("\nOğlak burcu");

        }




        input.close();

    }
}
