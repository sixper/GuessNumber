package Solution;

import java.util.*;

public class PlaneTicketPrice {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        int km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        int age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int type = input.nextInt();

        double total;


        if(km > 0 && age > 0 && (type == 1 || type == 2)){

            total = km * 0.1;

            if(age < 12)
                total -= total * 0.5;
            else if(age >= 12 && age <= 24)
                total -= total * 0.1;
            else if(age > 65)
                total -= total * 0.3;

            if(type == 2){

                total -= total * 0.2;
                total *= 2;

            }

            System.out.println("Toplam tutar = " + total);

        }else
            System.out.println("Hatalı Veri Girdiniz !");


        input.close();

    }
}
