import java.util.Arrays;

public class Arr_Random_Les2 {
    public static void main(String[] args) {

    int k = 0;


        int Arr1[] = new int[10];
        int Arr2[][] = new int[10][2];


        for (int i = 0; i < 10; i++) {
            Arr1[i] = (int) (Math.random() * 10);
            System.out.print(Arr1 [i]+ " ");
        }

       System.out.println('\n');

        for (int i = 0; i < 10; i++) {
            Arr2[i][0] = Arr1[i];
            Arr2[i][1] =  Arr2[i][0]*2;

        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((Arr2[i][j]) + " ");
            }
            System.out.println();
        }

    }
}

