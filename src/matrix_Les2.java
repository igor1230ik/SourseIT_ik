public class matrix_Les2 {
    public static void main(String[] args) {
        int k = 3;
        int Arr3[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

// Вывод опорного массива

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Arr3[i][j] + " ");

            }
            System.out.println();
        }

// формирование массива перевернутого на 90*.
        // Поворот массива на 90*.
        int Arr4[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Arr4[i][j] = Arr3[(Arr3.length - 1) - j][i];
            }
        }
        System.out.println();
        // Вывод сформированного массива
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Arr4[i][j] + " ");
            }
            System.out.println();
        }

// формирование массива перевернутого на 180*.
        // Поворот массива на 180*.
        int Arr5[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Arr5[i][j] = Arr3[ (Arr3.length - 1)- i][(Arr3.length - 1)-j];
            }
        }
        System.out.println();
        // Вывод сформированного массива
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Arr5[i][j] + " ");
            }
            System.out.println();
        }

// формирование массива перевернутого на 270**.
        // Поворот массива на 270*.
        int Arr6[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Arr6[i][j] = Arr3[j][(Arr3.length - 1)-i];
            }
        }
        System.out.println();
        // Вывод сформированного массива
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Arr6[i][j] + " ");
            }
            System.out.println();
        }


    }
}
