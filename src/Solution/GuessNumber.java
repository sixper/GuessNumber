package Solution;


import java.util.*;


public class GuessNumber {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = (int)(Math.random() * 100);
        int guess = -1;
        int right = 5;

        System.out.println("Welcome to number guessing game!");
        System.out.println("You have " + right +
                " rights to guess the randomly generated number between 0-100.");


        do{

            System.out.print("\nEnter a number: ");
            guess = input.nextInt();

            if(guess >= 0 && guess <= 100){

                if(guess == number){

                    System.out.println("Congrats! You have guessed the number " + number);

                }else if(guess > number){

                    System.out.println("Number is less than your guess");
                    System.out.println("You have " + --right + " left");

                }else{

                    System.out.println("Number is greater than your guess");
                    System.out.println("You have " + --right + " left");

                }



            }else
                System.out.println("Please enter a number between 0-100");



        }while(guess != number && right > 0);


        if(right == 0){

            System.out.println("\nThe number was " + number);
            System.out.println("You lost the game");

        }





    }

    }








