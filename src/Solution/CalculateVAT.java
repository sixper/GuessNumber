package Solution;

import java.util.*;

public class CalculateVAT {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("1. kenar uzunluğunu giriniz : ");
        double e1 = input.nextInt();
        System.out.print("2. kenar uzunluğunu giriniz : ");
        double e2 = input.nextInt();


        double hypo = Math.sqrt((e1 * e1) + (e2 * e2));

        double area = (e1 * e2) / 2;
        double perimeter = e1 + e2 + hypo;

        System.out.println("\nÜçgenin; ");
        System.out.println("Hipotenüs Uzunluğu: " + hypo);
        System.out.println("Alanı: " + area);
        System.out.println("Çevresi: " + perimeter);




    }
}
