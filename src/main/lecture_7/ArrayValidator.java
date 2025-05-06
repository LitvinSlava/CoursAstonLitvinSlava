package src.main.lecture_7;

public class ArrayValidator {
    //Проверка размера массива
    public static void checkArraySize(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива. Ожидается 4x4, получено " + array.length + "x?");
        }
    //Проверка длинны строки
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException(
                        "Неверный размер строки " + i + ". Ожидается 4, получено " + array[i].length);
            }
        }
    }
}