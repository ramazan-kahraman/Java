package ders10_stringManipulations;

public class C07_soru {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir cümle ve bir metin alın
        cumlede metnin durumuna göre;
        1- cumle metni icermiyor
        2- cumle metni sadece 1 kere iceriyor
        3- cumle metni birden fazla iceriyor
        seceneklerinden uygun olani yazdırın
         */

        String cumle="Java cok guzeldir cok";
        String metin= "cok";

        if (!cumle.contains(metin)){
            System.out.println("cumle metni icermiyor");
        }else {
            int ilkIndex=cumle.indexOf(metin);  //5

            int ikinciIndex=cumle.indexOf(metin,ilkIndex+1);    //ya -1 olacak yada bi index olacak

            if (ikinciIndex==(-1)){
                System.out.println("cumle metni sadece 1 kere iceriyor");
            }else {
                System.out.println("cumle metni birden fazla iceriyor");
            }
        }










    }
}
