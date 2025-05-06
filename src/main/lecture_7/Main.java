package src.main.lecture_7;
import static src.main.lecture_7.ArrayValidator.checkArraySize;

public class Main {
    public static void main(String[] args) {
        // ������ ����������� �������
        String[][] correctArray = new String[4][4];

        // ������ ������� � �������
        String[][] invalidArray = new String[4][5];

        try {
            checkArraySize(correctArray); // ������� ��� ������
            checkArraySize(invalidArray);  // �������� ����������
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}

