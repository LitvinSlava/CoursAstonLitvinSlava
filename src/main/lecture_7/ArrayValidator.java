package src.main.lecture_7;

public class ArrayValidator {
    //�������� ������� �������
    public static void checkArraySize(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("�������� ������ �������. ��������� 4x4, �������� " + array.length + "x?");
        }
    //�������� ������ ������
}