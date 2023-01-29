package ders09_StringManipulations;

public class C07_substring {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5,8)); //gun yazdırır.
        //5.indexden baslar (8-5=3)karakter yazdırır
        //5.index dahil(inclusive), 8.index haric(exclusive)

        System.out.println(str.substring(9,17));  //gectikce
        System.out.println(str.substring(3,7)); //a gu

        String isim="HASAN";
        //verilen ismi ilk harfi büyük geriye kalanlar kucuk harf olarak yazdır.
        System.out.println(isim.substring(0,1).toUpperCase()+ // ilk harfi alıp buyuk harf yaptık
                isim.substring(1).toLowerCase());   //1.index ve sonrasını alıp kucuk harf yaptık

        System.out.println(isim);





    }
}
