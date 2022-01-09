package Solution;

import java.util.*;

public class Grocery {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? : ");
        double pear = input.nextInt() * 2.14;

        System.out.print("Elma kaç kilo ? : ");
        double apple = input.nextInt() * 3.67;

        System.out.print("Domates kaç kilo ? : ");
        double tomato = input.nextInt() * 1.11;

        System.out.print("Muz kaç kilo ? : ");
        double banana = input.nextInt() * 0.95;

        System.out.print("Patlıcan kaç kilo ? : ");
        double eggPlant = input.nextInt() * 5;

        double total = pear + apple + tomato + banana + eggPlant;

        System.out.println("\nToplam tutar : " + total);



        input.close();

    }
}
