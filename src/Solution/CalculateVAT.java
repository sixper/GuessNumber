package Solution;

import java.util.*;

public class CalculateVAT {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen toplam tutarı giriniz: ");

        double val = input.nextInt();

        if(val <= 1000){

            val += (val * 18) / 100;

        }else{

            val += (val * 8) / 100;

        }

        System.out.println("KDV dahil toplam tutar: " + val);

    }
}
