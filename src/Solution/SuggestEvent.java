package Solution;

import java.util.*;

public class SuggestEvent {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen hava sıcaklığını giriniz: ");

        int temperature = input.nextInt();

        if(temperature < 5){
            System.out.println("Go kayak");
        }else if(temperature >= 5 && temperature < 15)
            System.out.println("Sinema zamanı");
        else if(temperature >= 15 && temperature < 25)
            System.out.println("Piknik <3");
        else
            System.out.println("Hadi yüzelim");



        input.close();

    }
}
