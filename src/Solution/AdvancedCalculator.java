package Solution;

import java.util.*;

public class AdvancedCalculator {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;

        System.out.println("\n1- Addition");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println("5- Exponentiation");
        System.out.println("6- Factorial");
        System.out.println("7- Modulo");
        System.out.println("8- Rectangle area and perimeter");
        System.out.println("9- Exit");



        do{

            System.out.print("\nPlease choose an operation: ");
            select = input.nextInt();
            System.out.println();

            switch (select){

                case 1:
                    addition();
                    break;

                case 2:
                    subtraction();
                    break;

                case 3:
                    multiplication();
                    break;

                case 4:
                    division();
                    break;

                case 5:
                    exponentiation();
                    break;

                case 6:
                    factorial();
                    break;

                case 7:
                    modulo();
                    break;

                case 8:
                    rectangle();
                    break;

                case 9:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("You have entered a wrong number. ");

            }




        }while (select != 9);



    }

    public static void addition(){

        double sum = 0;
        String number = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to sum: ");

        while(true){


            number = input.nextLine();

            if(number.equals(""))
                break;
            else
                sum += Double.parseDouble(number);

        }

        System.out.println("The result is " + sum);


    }

    public static void subtraction(){

        double sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers ? : ");
        int count = input.nextInt();


        for(int i = 1; i <= count; i++){

            System.out.print("Enter " + i + ". " + "number: ");
            double number = input.nextDouble();

            if(i == 1)
                sum += number;
            else
                sum -= number;

        }

        System.out.println("\nThe result is " + sum);

    }

    public static void multiplication(){

        double sum = 1;
        String number = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to multiply: ");

        while(true){


            number = input.nextLine();

            if(number.equals(""))
                break;
            else
                sum *= Double.parseDouble(number);

        }

        System.out.println("The result is " + sum);


    }

    public static void division(){

        double sum = 0;
        String number = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to division: ");

        while(true){


            number = input.nextLine();

            if(number.equals(""))
                break;
            else{

                if(sum == 0)
                    sum = Double.parseDouble(number);
                else if(Double.parseDouble(number) != 0)
                    sum /= Double.parseDouble(number);
                else
                    System.out.println("You can not divide 0");
            }

        }

        System.out.printf("The result is %.2f",sum);
        System.out.println();


    }

    public static void exponentiation(){

        double base = 0;
        int pow = 0;

        double sum = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base number: ");
        base = input.nextDouble();

        System.out.print("Enter power: ");
        pow = input.nextInt();

        for(int i = 1; i <= pow; i++){

            sum *= base;

        }

        System.out.print("\nThe result is " + sum);
        System.out.println();



    }

    public static void factorial(){

        int sum = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to calculate factorial: ");
        int number = input.nextInt();

        for(int i = 2; i <= number; i++){

            sum *= i;

        }

        System.out.print("\nThe result is " + sum);
        System.out.println();


    }

    public static void modulo(){


        Scanner input = new Scanner(System.in);

        System.out.print("Enter first operand: ");
        int first = input.nextInt();

        System.out.print("Enter second operand: ");
        int second = input.nextInt();


        System.out.print("\n" + first + " % " + second + " is " + first % second);
        System.out.println();


    }

    public static void rectangle(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first edge: ");
        int first = input.nextInt();

        System.out.print("Enter second edge: ");
        int second = input.nextInt();

        System.out.print("\nThe area of rectangle is  " + first * second);
        System.out.println("\nThe perimeter of rectangle is  " + (first + second) * 2);


    }


}
