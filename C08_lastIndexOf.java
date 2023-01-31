package ders10_stringManipulations;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str="Java hafiften beyin yakiyor";

        str.lastIndexOf("a");   //21 a harfini aramaya sondan başlar, ancak sonucu yine soldan sağa sayıp verir.

        System.out.println(str.lastIndexOf("a"));   //21

        System.out.println(str.lastIndexOf('e'));   //15

        System.out.println(str.lastIndexOf("java"));    //-1 küçük j ile aradığımız için yok diyor.

        System.out.println(str.lastIndexOf("e",14));    // 11 14.index öncesinde e yi arar







    }
}
