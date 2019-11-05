public class Number_Erastosfena_Les2 {
    public static void main(String[] args) {

        boolean Num =false;   // Вспомогательная переменная для определения является число простым.

// Цикл определения простого числа
        for ( int i = 2; i < 100; i++) {    //Изначальное значение числа true
            Num = true;
            for (int j = 2; j < i; j++) {  // Перебор цифр и умножение числа "I" до этого значения.
                if (i % j == 0) {           // Если значение при делении по модулю не равно нулю
                    Num = false;
                }
            }
            if (Num==true){
            System.out.print(i + " ");
            }
        }
    }
}
