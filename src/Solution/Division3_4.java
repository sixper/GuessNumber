package Solution;

import java.util.*;

public class Division3_4 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int num = input.nextInt();

        int count = 0;
        int average = 0;


        for(int i = 0; i <= num; i++){

            if(i % 3 == 0 && i % 4 == 0){

                count++;
                average += i;

            }
        }

        System.out.println("0-" + num + " arasındaki 3 ve 4 bölünen sayıların ortalaması: " + (double)average / count);





        input.close();

    }
}
