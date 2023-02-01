package ders11_stringManipulations;

public class C06_soru {
    public static void main(String[] args) {

        //kullanıcıdan bir cumle alın
        //cümlede ev geçiyorsa "home home sweet home"
        //cümlede iş geiyorsa "çalışmak güzeldir"
        //ikisini de içeriyorsa "hem ev lazım hem iş"
        //hiçbirini içermiyorsa "çok çalışman lazım" yazdırın.

        String cumle="sana geldim, ödevler birikmis";

        String cumleCopy=cumle.toLowerCase();

        if (cumleCopy.contains("ev")&&cumleCopy.contains("is")){
            System.out.println("hem ev lazım hem iş");
        } else if (cumleCopy.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (cumleCopy.contains("is")) {
            System.out.println("çalışmak güzeldir");
        }else {
            System.out.println("çook çalışman lazım çok!");
        }
    }
}
