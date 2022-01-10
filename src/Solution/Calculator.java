package Solution;

import java.util.*;

public class Calculator {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String userName;
        String password;

        System.out.print("\nKullanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if(userName.equals("sixper")){

            if(password.equals("deneme123"))
                System.out.println("Başarıyla giriş yaptınız.");
            else{

                System.out.print("\nŞifrenizi yanlış girdiniz. Sıfırlamak ister misiniz ? E/H: ");
                if(input.nextLine().equals("E")){

                    System.out.print("Yeni şifrenizi giriniz: ");
                    String newPassword = input.nextLine();
                    if(newPassword.equals("deneme123") || newPassword.equals(password))
                        System.out.print("Yeni şifre eskisi ile aynı olamaz.");
                    else{

                        password = newPassword;
                        System.out.println("Yeni şifre başarı ile oluşturuldu.");

                    }


                }
            }
        }else
            System.out.println("Kullanıcı adınızı yanlış girdiniz.");





        input.close();

    }
}
