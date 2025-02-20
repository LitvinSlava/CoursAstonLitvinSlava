package src.main.lesson2;
import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        //    System.out.println(checkSum(16, 5)); // ������ 1-�� �������

        //    System.out.println(plusOrMinus(999));    // ������ 2-�� �������

        //    System.out.println(trueOrFalse(-5));    // ������ 3-�� �������

        //    String string = "4 �������!";           // ������ 4-�� �������
        //    int count = 10;                         // ������ 4-�� �������
        //    printStringText(string, count);         // ������ 4-�� �������

        //    System.out.println(leapYear(2001));    // ������ 5-�� �������

        //int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};                           // ������ 6-�� �������
        //arrayCheck(array);                                                      // ������ 6-�� �������
        //System.out.println("������ ����� ������: " + Arrays.toString(array));   // ������ 6-�� �������

        //int[] myArray = new int[100]; // ������ 7-�� �������
        //arrayCheck1_100(myArray); // ������ 7-�� �������
        //System.out.println("������ �� 1 �� 100: " + Arrays.toString(myArray)); // ������ 7-�� �������

        //int[] array6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};                  // ������ 8-�� �������
        //arrayDouble6(array6);                                                  // ������ 8-�� �������
        //System.out.println("������ ����� ������: " + Arrays.toString(array6));   // ������ 8-�� �������

        /*������� � 9

        int n = 10; // ������ ����������� �������
        int[][] array = new int[n][n];

        // ��������� ������� ��������� (i == j)
        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
        }

        // �������������: ���������� ������ ��������� (i + j == n - 1)
        // �������� ������ ���������
        for (int i = 0; i < n; i++) {
            array[i][n - 1 - i] = 1;
        }

        // ����� �������
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }*/

        //������� �10
        int len = 10;
        int initialValue = 5;

        int[] array = createArray(len, initialValue);
        System.out.println("������: " + Arrays.toString(array));
    }

    /** ������� �1 �������� �����, ����������� �� ���� ��� ����� ����� � �����������, ��� �� ����� ����� � �������� �� 10 �� 20
     (������������), ���� �� � ������� true, � ��������� ������ � false.**/

    public static boolean checkSum(int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20 ? true : false;
    }

    /** ������� �2 �������� �����, �������� � �������� ��������� ���������� ����� �����, ����� ������ ���������� � �������,
     ������������� �� ����� �������� ��� �������������. ���������: ���� ������� ������������� ������**/
    public static String plusOrMinus(int a) {
        return a >= 0 ? "�������������" : "�������������";
    }

    /** ������� �3 �������� �����, �������� � �������� ��������� ���������� ����� �����. ����� ������ ������� true, ����
     ����� �������������, � ������� false ���� �������������.**/
    public static boolean trueOrFalse(int a) {
        return a >= 0 ? true : false;
    }

    /** ������� �4 �������� �����, �������� � �������� ���������� ���������� ������ � �����, ����� ������ ���������� �
     ������� ��������� ������, ��������� ���������� ���**/
    public static void printStringText(String string,int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(string + " " + count + " ���");
        }
    }

    /** ������� �5 �������� �����, ������� ����������, �������� �� ��� ����������, � ���������� boolean (���������� - true, ��
     ���������� - false). ������ 4-� ��� �������� ����������, ����� ������� 100-��, ��� ���� ������ 400-� � ����������**/

    public static boolean leapYear(int a) {
        if (a % 400 == 0) {
            return true;
        } else if (a % 100 == 0) {
            return false;
        } else if (a % 4 == 0) {
            return true;
        } else {         // ����� ������� ������ return false;
            return false;
        }
    }

    /** ������� �6 ������ ������������� ������, ��������� �� ��������� 0 � 1. ��������: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. � ������� ����� �
     ������� �������� 0 �� 1, 1 �� 0**/
    public static void arrayCheck(int [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
    }


    /** ������� �7 ������ ������ ������������� ������ ������ 100. � ������� ����� ��������� ��� ���������� 1 2 3 4 5 6 7 8 ...
    100**/
    public static void arrayCheck1_100(int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
    /** ������� �8 ������ ������ [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] ������ �� ���� ������, � ����� ������� 6 �������� �� 2;**/
    public static void arrayDouble6(int [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
    }
    /** ������� �9 ������� ���������� ��������� ������������� ������ (���������� ����� � �������� ����������), � � �������
     �����(-��) ��������� ��� ������������ �������� ��������� (����� ������ ���� �� ����������, ���� ��� ������).
     ���������� �������� ����� �� ���������� ����� �� ���������� ��������: ������� ����� ��������� �����, ��
     ���� [0][0], [1][1], [2][2], ..., [n][n]**/

   /* public static void monoArray(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                //array[i][j] = 1;
                System.out.println(array[i][j] + " ");
            System.out.println();
        }
    }*/

    /** ������� �10 �������� �����, ����������� �� ���� ��� ���������: len � initialValue, � ������������ ���������� ������ ���� int
     ������ len, ������ ������ �������� ����� initialValue**/
        private static int[] createArray(int len, int initialValue) {
            int[] result = new int[len];
            for (int i = 0; i < len; i++) {
                result[i] = initialValue;
            }
            return result;
        }
}

