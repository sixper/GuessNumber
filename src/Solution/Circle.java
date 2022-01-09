package Solution;

import java.util.*;

public class Circle {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz : ");
        double radius = input.nextInt();
        System.out.print("Merkezi açı ölçüsünü giriniz : ");
        double angle = input.nextInt();

        final double pi = 3.14;

        double area = pi * radius * radius;
        double perimeter = 2 * pi * radius;

        double angleArea = (pi * radius * radius * angle) / 360;


        System.out.println("\nDairenin Alanı: " + area);
        System.out.println("Dairenin Çevresi: " + perimeter);

        System.out.println("\nYarıçapı " + radius + " açı ölçüsü " + angle + " derece olan daire dilimini alanı: " + angleArea);








    }
}
