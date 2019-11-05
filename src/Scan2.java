import java.util.Scanner;

public class Scan2 {

    public static void main (String args[]) {

while (true) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите число из 6 символов");
        String s = scan.nextLine();
        System.out.println(s);
        int a = s.length();


        if (a != 6) {
            System.out.println("Вы ввели мельше 6 символов!" + "\n" + "Ввелите число повторно");
        }



    if (a == 6) {
        for (int i = 0; i < a; i++) {

            System.out.println(s.charAt(i));

        }
        break;
        }
    }







    }
}





