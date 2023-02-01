package ders11_stringManipulations;

public class C05_repeat_trim {
    public static void main(String[] args) {

        String str="java guzeldir ";

        System.out.println(str.repeat(4));  //java guzeldir java guzeldir java guzeldir java guzeldir

        str="  java guzeldir  ";
        System.out.println(str.length());   //17

        str=str.trim(); //başta ve sondaki boşlukları siler

        System.out.println(str);    //java guzeldir
        System.out.println(str.length());   //13






    }
}
