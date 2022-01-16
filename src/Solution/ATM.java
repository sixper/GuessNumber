package Solution;

import java.util.*;

public class ATM {


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String username = "";
        String password = "";

        int right = 3;
        int selection = -1;

        int balance = 0;


        while(right > 0){

            System.out.print("Please enter your username: ");
            username = input.nextLine();

            System.out.print("Please enter your password: ");
            password = input.nextLine();

            if(username.equals("patika") && password.equals("dev123")){

                System.out.println("\nWelcome to your bank account");

                do{

                    System.out.println("1 - Deposit Money");
                    System.out.println("2 - Withdraw Money");
                    System.out.println("3 - Balance Inquiry");
                    System.out.println("4 - Exit");

                    System.out.print("\nPlease choose an operation: ");
                    selection = input.nextInt();

                    switch (selection){

                        case 1:

                            System.out.print("Enter money you want to deposit: ");
                            balance += input.nextInt();
                            System.out.println("\nYou have successfully deposit money.");
                            System.out.println("Your current balance is " + balance);
                            System.out.println();
                            break;

                        case 2:

                            System.out.print("Enter money you want to withdraw: ");
                            int draw = input.nextInt();

                            if(draw > balance)
                                System.out.println("Insufficient Balance");
                            else{

                                balance -= draw;
                                System.out.println("\nYou have successfully withdrawn money.");
                                System.out.println("Your current balance is " + balance);
                                System.out.println();

                            }

                            break;

                        case 3:

                            System.out.println("\nYour current balance is " + balance);
                            System.out.println();
                            break;

                        case 4:
                            System.out.println("See you again, goodbye!");
                            break;

                    }


                }while (selection != 4);

                break;

            }else{

                right--;

                if(right == 0){

                    System.out.println("Account has been blocked. Please contact your provider. ");

                }else
                    System.out.println("Wrong username or password, please try again.\n");

            }

        }


    }





}
