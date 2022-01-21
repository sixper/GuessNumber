package Solution;

import javax.sound.midi.Soundbank;
import java.util.*;


public class ArraySort {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements separated by spaces: ");

        for(int i = 0; i < size; i++){

            arr[i] = input.nextInt();

        }

        for(int i = 0; i < arr.length; i++){

            int insert = arr[i];

            for(int j = i - 1; j >= 0; j--){

                if(arr[j] > insert){

                    arr[j + 1] = arr[j];

                    if(j == 0)
                        arr[j] = insert;

                }else if(arr[j] < insert){

                    arr[j + 1] = insert;
                    break;

                }

            }

        }


        System.out.println("Array sorted: " + Arrays.toString(arr));

    }

    }








