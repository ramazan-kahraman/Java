package ders11_stringManipulations;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1="";
        //str1 e değer atanmıştır.

        System.out.println(str1);   // Hiçlik yazdırır.
        System.out.println(str1.concat("Java"));  //Java

        String str2;
        //str2 oluşturuldu ama değer atanmadı
       // System.out.println(str2); //str2 ye değer atanmadığı için yazdırılamaz, CTE verir
      //  System.out.println(str2.concat("Java"));   //değer atanmadığı için method ile kullanılamaz

        str2="Java candır";
        System.out.println(str2);   //Java candır
        System.out.println(str2.concat("."));   // java candır.

        String str3=null;   //str3 e değer atanmamıştır.
                            //null pointer ile javaya değer atamadığımızın farkında olduğumuzu soyluyoruz

        System.out.println(str3);   //null işaretlendiğini yazdırır

        //System.out.println(str3.concat("java"));    //NullPointerException

        System.out.println(str3+"java");    //nulljava yazdırır
        System.out.println(str3.toUpperCase()); //NullPointerException hatası verir yine








    }
}
