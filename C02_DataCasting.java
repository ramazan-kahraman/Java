package ders04_matematikselişlemler_incrementDecrement;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayı girin");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        int bölmeSonucuTamsayi=(int)(sayi1/sayi2);
        System.out.println(bölmeSonucuTamsayi);

    }
}
