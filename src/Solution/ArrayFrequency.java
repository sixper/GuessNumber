package Solution;

import java.util.*;


public class ArrayFrequency {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[] {10,20,20,10,10,20,5,20};
        int[] frequency = new int[1000];

        for(int i = 0; i < arr.length; i++){

            frequency[arr[i]]++;

        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println();

        for(int i = 0; i < frequency.length; i++){

            if(frequency[i] > 0){

                System.out.println(i + " repeated " + frequency[i] + " times.");

            }

        }


    }

    }








