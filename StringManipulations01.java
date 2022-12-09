package day07ternarystringmanipulation;

public class StringManipulations01 {
    public static void main(String[] args) {
        /*
        String class methodları
        1- equals() : i) iki tane string in aynı olup olmadığını anlamak için kullanılır
                      ii) equals() methodu "boolean" return eder.

        2- equalsIgnoreCase() : i) iki tane String in aynı olup olmadığını büyük harf küçük harfe dikkat etmeden anlamamıza yarar
                                ii) "boolean" return eder.

        3 - toLowerCase() :     i) Bir Stringteki tüm harfleri küçük harfe çevirir
                                ii) "String" return eder.

        4 - toUpperCase() :     i) Bir Stringteki tüm harfleri büyük harfe çevirir
                                ii) "String" return eder.

        5 -  charAt() :         i) Bir String ten belli bir index deki characteri almak için kullanılır
                                ii) "char" return eder

        6 -  length() :         i)Bir Stringteki kaç tane character kullanıldığını öğrenmek için kullanılır.
                                ii) "int" return eder.

        7 - contains() :        i)Bir Stringte belli bir characterin veya characterlerin var olup olmadığını anlamak için kullanılır
                                ii) "boolean" return eder.

        8 - split() :           i)Bir String i istediğimiz karakterden parçalamaya yarar.
                                ii) "Array" return eder.



        Bir pwd nin geçerli olup olmadığını aşağıdaki kurallara göre kontrol eden kodu yazınız.
        i) en az 8 karakter olmalı
        ii) Space karakteri içermemeli
        iii) İlk harfi "M" ya da "m" olmalı
        iv) son karakteri "?" olmalı

         */



        String pwd = "Manisa12?";
        boolean first = pwd.length()>7;
        boolean second = !pwd.contains(" ");
        boolean third = pwd.charAt(0)=='m' || pwd.charAt(0)=='M';
        boolean fourth = pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first && second && third && fourth);






    }
}
