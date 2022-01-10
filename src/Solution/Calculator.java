package Solution;

import java.util.*;

public class Calculator {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        double firstNum = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        double secondNum = input.nextInt();

        System.out.println("\nYapılacak işlemi belirtiniz: ");
        System.out.println("1. Toplama ");
        System.out.println("2. Çıkarma ");
        System.out.println("3. Çarpma ");
        System.out.println("4. Bölme ");

        int operation = input.nextInt();


        switch (operation){


            case 1:
                System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                break;

            case 2:
                System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                break;

            case 3:
                System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                break;

            case 4:
                System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
                break;

            default:
                System.out.println("Tanımsız seçim.");
        }

        input.close();

    }
}
