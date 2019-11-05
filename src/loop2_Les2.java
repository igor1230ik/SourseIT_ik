import java.util.Scanner;

public class loop2_Les2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте ширину фигуры фигуры");
       int s = scan.nextInt();               //Ширина фигуры
        System.out.println("Задайте высоту фигуры фигуры");
        int ss = scan.nextInt();               //Высота фигуры

        for(int i = 0; i < s; i++) {
            for (int j = 0; j < ss; j++) {

                if (j % 2 == 0)
                    System.out.print("+++");
                if (j % 2 != 0)
                    System.out.print("---");
            }
            System.out.println();
        }

    }
}
