package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {
    public static void main(String[] args) {

        /*
        kullanıcıdan iki sayi alip, bunlarin taoplamini yazdiran bir method olusturun.
        */

        isteToplaYazdir();


    }
    public static void isteToplaYazdir(){

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi girin");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("girilen sayilarin toplami: "+(sayi1+sayi2));
    }


}
