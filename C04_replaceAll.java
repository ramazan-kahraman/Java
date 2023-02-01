package ders11_stringManipulations;

public class C04_replaceAll {
    public static void main(String[] args) {

        //kullanıcının girdiği metinde
        // harf dışında kalan tüm karakterleri temizleyen bir kod yazın
        //Not:space silinmemeli

        String str="Ja5+va cok 1*guzel";

        str=str.replaceAll("\\d","");   //Ja+va cok *guzel
        str=str.replaceAll(" ","5");    //Ja+va5cok5guzel
        str=str.replaceAll("\\W","");   //Java5cok5guzel
        str=str.replaceAll("5"," ");    //Java cok guzel


        System.out.println(str);





    }
}
