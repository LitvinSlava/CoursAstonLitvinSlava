package src.main.lecture_7;
import static src.main.lecture_7.ArrayValidator.checkArraySize;

public class Main {
    public static void main(String[] args) {
        // Пример корректного массива
        String[][] correctArray = new String[4][4];

        // Пример массива с ошибкой
        String[][] invalidArray = new String[4][5];

        try {
            checkArraySize(correctArray); // Пройдет без ошибок
            checkArraySize(invalidArray);  // Выбросит исключение
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}

