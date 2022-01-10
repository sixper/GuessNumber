package Solution;

import java.util.*;

public class Calculator {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double math,physic,turkish,chemistry,music;
        double average = 0;

        System.out.print("Matematik notunuzu giriniz: ");
        math = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        physic = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkish = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        chemistry = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        music = input.nextInt();

        if(math >= 0 && math <= 100)
            average += math;

        if(physic >= 0 && physic <= 100)
            average += physic;

        if(turkish >= 0 && turkish <= 100)
            average += turkish;

        if(chemistry >= 0 && chemistry <= 100)
            average += chemistry;

        if(music >= 0 && music <= 100)
            average += music;

        average /= 5;

        System.out.println("Not ortalamanız: " + average);

        if(average >= 55)
            System.out.println("Tebrikler sınıfı geçtiniz.");
        else
            System.out.println("Sınıfta kaldınız");



        input.close();

    }
}
