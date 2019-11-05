import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat=Pattern.compile("Java");        //составление шаблона compile. Перевод в символьную строку.
        mat=pat.matcher("Java");     //создание объекта для сравнения с шаблоном.
        found=mat.matches();               //Проверка на совпадение

            System.out.println("Проверка на совпадение");
                 if (found) System.out.println("Совпадает");
            else
                            System.out.println("Не совпадает");

        mat=pat.matcher("Java9");
        found=mat.matches();
        System.out.println("Проверка на совпадение");
        if (found) System.out.println("Совпадает");
        else
            System.out.println("Не совпадает");




    }
}
