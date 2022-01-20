package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] list = {15,12,788,1,-1,-778,2,0};

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("\nArray: " + Arrays.toString(list));

        for(int element : list){

            if(element < number && element >= min){

                min = element;

            }

            if(element > number && element <= max){

                max = element;

            }

        }

        System.out.println("Lowest number which greater than input" + ": " + max);
        System.out.println("Biggest number which less than input : " + min);




    }






    }








