package day07ternarystringmanipulation;



public class Ternary01 {

    public static void main(String[] args) {

        //Ex:1 Bir saynın pozitif olup olmadığını ekrana yazdıran kodu yazınız

        //1. Yol

        int a = -12;
//        if (a>0){
//            System.out.println("Pozitif");
//
//        }else {
//            System.out.println("Pozitif Değil");
//        }

        //2.Yol: Ternary

      //               condition  ?   Condition Doğru ise uygulanacak kod    yanlış ise
        String sonuc =     a>0    ?                  "Pozitif":             "Pozitif Değil";
        System.out.println("Sayı: " + sonuc);

        //ex 2 : 2 sayıdan küçük olanı seçen bir kod yazınız

        int b = 312, c = 23;

        int min = b<c ? b : c;
        System.out.println("Küçük Sayı: " + min);

        //Ex 3: verilen bir sayının mutlak değerini hesaplayan kodu yazınız

        int d = -45;
        int abs = d<0 ? -1*d : d;
        System.out.println("Sayının Mutlak Değeri: " + abs);

        //Ex 4: 2 tane sayı aynı işaretli ise bu sayıları çarpınız. Farklı ise işlem yapamam mesajı veriniz.

        int e= 12, f= -10;
        Object islem = (e>0 && f>0)  || (e<0 && f<0) ? e*f : "İşlem Yapamam";
        System.out.println(islem);

        //turnary farklı dat tiplerinde sonuç return ederse sonucun data tipini "Object" yapınız

        //Java'da her class ın en az bir tane parent class ı vardır. Parent class ı olmayan tek class "Object" tir.





    }
}
