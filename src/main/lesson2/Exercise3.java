package src.main.lesson2;
import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        //    System.out.println(checkSum(16, 5)); // метода 1-го задания

        //    System.out.println(plusOrMinus(999));    // метода 2-го задания

        //    System.out.println(trueOrFalse(-5));    // метода 3-го задания

        //    String string = "4 задание!";           // метода 4-го задания
        //    int count = 10;                         // метода 4-го задания
        //    printStringText(string, count);         // метода 4-го задания

        //    System.out.println(leapYear(2001));    // метода 5-го задания

        //int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};                           // метода 6-го задания
        //arrayCheck(array);                                                      // метода 6-го задания
        //System.out.println("Массив после замены: " + Arrays.toString(array));   // метода 6-го задания

        //int[] myArray = new int[100]; // метода 7-го задания
        //arrayCheck1_100(myArray); // метода 7-го задания
        //System.out.println("Массив от 1 до 100: " + Arrays.toString(myArray)); // метода 7-го задания

        //int[] array6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};                  // метода 8-го задания
        //arrayDouble6(array6);                                                  // метода 8-го задания
        //System.out.println("Массив после замены: " + Arrays.toString(array6));   // метода 8-го задания

        /*задание № 9

        int n = 10; // Размер квадратного массива
        int[][] array = new int[n][n];

        // Заполняем главную диагональ (i == j)
        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
        }

        // Дополнительно: заполнение второй диагонали (i + j == n - 1)
        // Добавить вторую диагональ
        for (int i = 0; i < n; i++) {
            array[i][n - 1 - i] = 1;
        }

        // Вывод массива
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }*/

        //Задание №10
        int len = 10;
        int initialValue = 5;

        int[] array = createArray(len, initialValue);
        System.out.println("Массив: " + Arrays.toString(array));
    }

    /** Задание №1 Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
     (включительно), если да – вернуть true, в противном случае – false.**/

    public static boolean checkSum(int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20 ? true : false;
    }

    /** Задание №2 Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом”**/
    public static String plusOrMinus(int a) {
        return a >= 0 ? "положительное" : "отрицательное";
    }

    /** Задание №3 Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если
     число отрицательное, и вернуть false если положительное.**/
    public static boolean trueOrFalse(int a) {
        return a >= 0 ? true : false;
    }

    /** Задание №4 Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в
     консоль указанную строку, указанное количество раз**/
    public static void printStringText(String string,int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(string + " " + count + " раз");
        }
    }

    /** Задание №5 Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не
     високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный**/

    public static boolean leapYear(int a) {
        if (a % 400 == 0) {
            return true;
        } else if (a % 100 == 0) {
            return false;
        } else if (a % 4 == 0) {
            return true;
        } else {         // можно оставит только return false;
            return false;
        }
    }

    /** Задание №6 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и
     условия заменить 0 на 1, 1 на 0**/
    public static void arrayCheck(int [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
    }


    /** Задание №7 Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ...
    100**/
    public static void arrayCheck1_100(int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
    /** Задание №8 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;**/
    public static void arrayDouble6(int [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
    }
    /** Задание №9 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
     цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то
     есть [0][0], [1][1], [2][2], ..., [n][n]**/

   /* public static void monoArray(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                //array[i][j] = 1;
                System.out.println(array[i][j] + " ");
            System.out.println();
        }
    }*/

    /** Задание №10 Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
     длиной len, каждая ячейка которого равна initialValue**/
        private static int[] createArray(int len, int initialValue) {
            int[] result = new int[len];
            for (int i = 0; i < len; i++) {
                result[i] = initialValue;
            }
            return result;
        }
}

