package Solution;

import java.util.Arrays;

public class HarmonicMean {






    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;

        for(int element : numbers){

            sum += 1 / (double)element;

        }


        System.out.print("Harmonic mean of " + Arrays.toString(numbers) + " series is ");
        System.out.printf("%.4f", numbers.length / sum);

    }






    }








