package Solution;

import java.util.*;

public class TaximeterPrice {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen Kilometre : ");

        double km = input.nextInt();

        double price = 10 + (km * 2.2);

        if(price < 20)
            System.out.println("\nTaksimetre tutarı: 20.0 TL.");
        else
            System.out.println("Taskimetre tutarı: " + price + " TL.");





    }
}
