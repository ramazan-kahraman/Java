package ders20_multiDimensionalArrays;

public class C03_MDA_EnUzunKelime {
    public static void main(String[] args) {
        //verilen Multi dimensional String bir arraydeki
        //en uzun Stringi bulan kod yaz.

        String [][]arr={{"ilker","nesrin"},{"hasan","heysem","adem","yusuf enes"}};

        String enUzunKelime=arr[0][0];

        for (int i = 0; i <arr.length ; i++) {  //outer arrayin elemanlarini kontrol eder

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j].length()>enUzunKelime.length()){
                    enUzunKelime=arr[i][j];
                }

            }

        }
        System.out.println("En uzun kelime:"+enUzunKelime);

    }
}
