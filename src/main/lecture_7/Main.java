package src.main.lecture_7;
import static src.main.lecture_7.ArrayValidator.checkArraySize;
import static src.main.lecture_7.ArrayValidator.sumArrayValues;

public class Main {
    public static void main(String[] args) {
        // Пример корректного массива
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Пример массива с ошибкой
        String[][] invalidArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "text"} // Ошибка здесь
        };

        String[][] invalidSizeArray = new String[3][4]; // Неверный размер (3x4)

        try {
            // Проверка корректного массива
            checkArraySize(validArray);
            int sum = sumArrayValues(validArray);
            System.out.println("Сумма: " + sum);

            // Проверка массива с ошибкой
            checkArraySize(invalidArray);
            int sum1 = sumArrayValues(invalidArray);
            sumArrayValues(invalidArray);

        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

//        try {
//        // Пример с неверным размером
//        checkArraySize(invalidSizeArray); // Упадет здесь
//    } catch (MyArraySizeException | MyArrayDataException e) {
//        System.err.println("Ошибка: " + e.getMessage());
//        }
    }
}

