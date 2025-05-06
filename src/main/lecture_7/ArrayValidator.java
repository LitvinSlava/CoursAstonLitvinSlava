package src.main.lecture_7;

public class ArrayValidator {
    //�������� ������� �������
    public static void checkArraySize(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("�������� ������ �������. ��������� 4x4, �������� " + array.length + "x?");
        }
    //�������� ������ ������
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException(
                        "�������� ������ ������ " + i + ". ��������� 4, �������� " + array[i].length);
            }
        }
    }
    public static int sumArrayValues(String[][] array) throws MyArrayDataException {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
        return sum;
    }
}