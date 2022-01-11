package Solution;

import java.util.*;

public class Combination {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Kombinasyon için n,r ikilisi giriniz : ");
        int n = input.nextInt();
        int r = input.nextInt();

        int combination = permutation(n) / (permutation(r) * permutation(n - r));

        System.out.println("N'nin r'li combinasyonları C(n,r) == " + combination);

        input.close();

    }


    public static int permutation(int num){


        int result = 1;

        for(int i = num; i > 1; i--){

            result *= i;

        }


        return result;
    }
}
