package Solution;

import javax.sound.midi.Soundbank;
import java.util.*;


public class Transpose {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Row size: ");
        int row = input.nextInt();

        System.out.print("Column size: ");
        int column = input.nextInt();


        int[][] arr = new int[row][column];
        int[][] transpose = new int[column][row];

        System.out.print("Enter array elements separated by spaces: ");

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){

                arr[i][j] = input.nextInt();
                transpose[j][i] = arr[i][j];

            }

        }

        System.out.println("Matrix: ");

        for(int[] elementRow : arr){

            for(int element : elementRow){

                System.out.print(element + "  ");

            }

            System.out.println();

        }

        System.out.println("Transpose: ");

        for(int[] elementRow : transpose){

            for(int element : elementRow){

                System.out.print(element + "  ");

            }

            System.out.println();

        }

    }

    }








