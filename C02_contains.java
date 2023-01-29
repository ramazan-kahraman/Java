package ders10_stringManipulations;

public class C02_contains {
    public static void main(String[] args) {

        String str="Java ile kodlama çok zevkli";

        System.out.println(str.contains("çok"));    //true

        System.out.println(str.contains("odla"));   //true

        System.out.println(str.contains("a"));  //true

        //System.out.println(str.contains('s'));  //parametre olarak char kabul etmez

        //CharSquence : char dizisi

        System.out.println(str.contains("java"));   //false

        String str2="Java";
        System.out.println(str.contains(str2)); //true









    }
}
