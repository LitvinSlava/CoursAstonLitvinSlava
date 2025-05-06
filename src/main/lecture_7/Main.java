package src.main.lecture_7;
import static src.main.lecture_7.ArrayValidator.checkArraySize;
import static src.main.lecture_7.ArrayValidator.sumArrayValues;

public class Main {
    public static void main(String[] args) {
        // ������ ����������� �������
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // ������ ������� � �������
        String[][] invalidArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "text"} // ������ �����
        };

        try {
            // �������� ����������� �������
            checkArraySize(validArray);
            int sum = sumArrayValues(validArray);
            System.out.println("�����: " + sum);

            // �������� ������� � �������
            checkArraySize(invalidArray);
            int sum1 = sumArrayValues(invalidArray);
            sumArrayValues(invalidArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}

