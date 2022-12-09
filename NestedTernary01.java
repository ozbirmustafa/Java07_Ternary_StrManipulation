package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        Verilen yılın "leap year" olup olmadığını kontrol eden kodu giriniz

        1) yıl 100 e bölünürse 400 e de bölünmelidir  1600+  1800-
        2) yil 100 e bölünmezse 4 e bölünmelidir.     1996+  2001-
        //interviewda sorulur
         */

        int year = 2022;

        String leapYear = year%100==0 ? (year%400==0 ? "Leap Year" : "Leap Year Değil") : (year%4==0 ? "Leap Year" : "Leap Year Değil");
        System.out.println(leapYear);

        /*
        Aşağıdaki kurallar göre password un geçerli olup olmadığını kontrol eden kodu yazınız
        i)sekiz karaktarden fazla veya sekiz karakter varsa ilk harfi 'i' olmalıdır.
        ii) sekiz karakterden az karakter varsa ilk harfi 'K' olmalıdır.
        */

        String pwd = "Ka3ed54";
        char ilkHarf = pwd.charAt(0);
        String geçerli = pwd.length()<8 ? (ilkHarf=='K' ? "Geçerli " : "Geçersiz ") : (ilkHarf=='i' ? "Geçerli " : "Geçersiz ");
        System.out.println(geçerli);

        String name = "Veli";
        String isim = name.length()>3 ? (name.contains("i") ? "Veli" : "No Name") : ("Ali");
        System.out.println(isim);

        String name1 = "Ali";

        String isim1 = name1.equals("Ali") ? (name.charAt(0)=='A' ? "Good" : "Bad") : ("The Worst");
        System.out.println(isim1);





    }
}
