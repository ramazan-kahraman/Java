package Free_calismalar;

import java.util.Scanner;

public class free_calisma33 {
    public static void main(String[] args) {
       /*
        Kullanicidan main method icinde  ayri ayri isim ve soyismini alin
        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        isim bosluk soyisim seklinde bize donduren bir method olusturun
        input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz

        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ismi ve soyismi gir");
        String isim= scan.nextLine();
        String soyisim= scan.nextLine();
        isimDuzenleMethodu(isim,soyisim);



    }
    public static void isimDuzenleMethodu(String isim,String soyisim){
        System.out.println(isim.toUpperCase().charAt(0)+isim.toLowerCase().substring(1) + " "
                        +soyisim.toUpperCase().charAt(0)+soyisim.toLowerCase().substring(1));
    }
}
