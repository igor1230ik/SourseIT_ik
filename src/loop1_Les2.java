import java.util.Scanner;

public class loop1_Les2 {
    public static void main(String[] args) {

        int s;                          // Переменная высоты фигуры.
        int i = 0, j = 0;                    //Переменные циклов.
        int a = 0;                        // Переменная формирования фигуры

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите высоту фигуры");
        s = scan.nextInt();               //Введенное число

// Цикл увеличения фигуры

        for (i = 0; i < 5; i++) {
            a++;
            for (j = 0; j < i + 1; j++) {

                System.out.print(a);
            }
            System.out.println();
        }

// Цикл уменьшения фигуры

        for (i = 5; i > 0; i--) {
            a--;
            for (j = i - 1; j > 0; j--) {

                System.out.print(a);
            }
            System.out.println();
        }


    }
}
