package src.main.lesson1;

/**
 * First JAVA program.
 */
public class FirstApp {
    public static void main(String[]arg){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    /** ������� �1 �������� ����� printThreeWords(), ������� ��� ������ ������ ���������� � ������� ��� �����: Orange, Banana, Apple.**/
    public static void printThreeWords() {
        System.out.println("-----------------������� �1-----------------");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    /** ������� �2 �������� ����� checkSumSign(), � ���� �������� �������� ��� int ���������� a � b, � ��������������� �� ������
     ����������, �������� ��������. ����� ����� ������ �������������� ��� ����������, � ���� �� ����� ������
     ��� ����� 0, �� ������� � ������� ��������� ������ ��������������, � ��������� ������ - ������
     ��������������**/

    public static void checkSumSign() {
        int a = 1;
        int b = 3;
        int c = a + b;
        System.out.println("-----------------������� �2-----------------");
        if (c >= 0) {
            System.out.println("������������� �����");
        } else {
            System.out.println("������������� �����");
        }
    }
    /** ������� �3 �������� ����� printColor() � ���� �������� ������� int ���������� value � ��������������� �� ����� ���������.
     ���� value ������ 0 (0 ������������), �� � ������� ����� ������ ������� ��������� ��������, ���� ����� �
     �������� �� 0 (0 �������������) �� 100 (100 ������������), �� �������, ���� ������ 100 (100 �������������) - ��������**/

    public static void printColor() {
        int value = 101;
        System.out.println("-----------------������� �3-----------------");
        if (value <= 0) {
            System.out.println("�������");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("������");
        }
        else {
            System.out.println("�������");
        }
    }
    /** ������� �4 �������� ����� compareNumbers(), � ���� �������� �������� ��� int ���������� a � b, � ��������������� ��
     ������ ����������, �������� ��������. ���� a ������ ��� ����� b, �� ���������� ������� � ������� ��������� �a >= b�, � ��������� ������
     �a < b�**/

    public static void compareNumbers() {
        int a = 3;
        int b = 3;
        System.out.println("-----------------������� �4-----------------");
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }

        System.out.println("-------------------������-------------------");
        int a2 = 4;
        System.out.println(++a2);
        System.out.println(a2++);
        System.out.println(a2);
    }
}