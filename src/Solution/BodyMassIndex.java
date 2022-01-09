package Solution;

import java.util.*;

public class BodyMassIndex {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz(metre cinsinden) : ");
        double height = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        double weight = input.nextDouble();

        double index = weight / (height * height);

        System.out.println("\nVücut Kitle İndeksiniz: " + index);




        input.close();

    }
}
