public class lesson_1 {
    public static void main(String[] args) {    // 1.прописал метод mail()
        byte a = 100;                           // 2.создал переменные и инициализировал их
        short b = 30000;
        int c = -1111;
        long d = 200000000000000000L;
        float e = 12.12f;
        double f = -100.101;
        char i = '*';
        boolean k = false;
    }

    public static int calculate(int a,int b, int c, int d) {    // 3.метод вычисляющий выражение
        return a * (b + (c / d));
    }

    public static boolean task10and20 (int x1, int x2) {        // 4.метод принимающий на вход два числа
        return 10 <= x1 + x2 && x1 + x2 <= 20;
    }

    public static void isPositiveOrNegative(int x) {            // 5. положительное || отрицатеьное
        if(x >= 0)  {
            System.out.println("Число положительное");
        }   else    {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int x) {   // 6.метод возвращает true, если число отрицательное
        if(x < 0)   {
            return true;
        }
        return false;
    }

    public static void greetings(String name) {                 // 7.метод выводит сообщение в консоль
        System.out.println("Привет, указанное имя!");
    }
}
