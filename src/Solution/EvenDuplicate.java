package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class EvenDuplicate {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] list = {3,7,3,3,2,9,10,21,1,33,9,1,2,4,8,16,2,4,32,32,6,8,2};

        int[] evenDuplicates = new int[list.length];

        int index = 0;
        for(int i = 0; i < list.length; i++){

            for(int j = i + 1; j < list.length; j++){

                if(list[i] == list[j] && list[i] % 2 == 0){

                    evenDuplicates[index] = list[i];
                    index++;

                }

            }
        }


        System.out.println("Even numbers in list arrays which have duplicates: \n" +
                Arrays.toString(evenDuplicates));


    }






    }








