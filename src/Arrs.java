import java.util.Scanner;
import java.util.Random;
public class Arrs {

    public static void main(String[] args) {

        int k = 0;

        int Arr1[][] = new int[10][2];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                k = k + (int) (Math.random() * 10);
                Arr1[i][j] = k;
                Arr1[i][1] = Arr1[i][0] * 2;
                System.out.print(Arr1[i][j] + " ");
            }
        }


        System.out.println('\n');


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print((Arr1[i][j]) + " ");
            System.out.println();
        }
    }
}
