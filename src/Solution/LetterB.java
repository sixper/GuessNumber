package Solution;

import java.util.Arrays;

public class LetterB {






    public static void main(String[] args) {
        String[][] letter = new String[7][4];


        for(int i = 0; i < letter.length; i++){

            for(int j = 0; j < letter[i].length; j++){

                if(i == 0 || i == letter.length - 1 || i == letter.length / 2){

                    letter[i][j] = "*";

                }else if(j == 0 || j == letter[i].length - 1){

                    letter[i][j] = "*";

                }else{

                    letter[i][j] = "  ";

                }
            }
        }


        for(String[] row : letter){

            for(String element : row){

                System.out.print(element);

            }

            System.out.println();

        }




    }






    }








