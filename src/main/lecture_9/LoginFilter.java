package src.main.lecture_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*������� �5. ����� �������� ���������, ������� ����� ��������� ��
������������ ���� ��������� �������. ��� ������ ������������ ������
������ ������ - ��������� ������ ���������� ���� ������ ��
������������ � ������� � ������� ������, ������������ �� ����� f
(��������).*/

public class LoginFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> logins = new ArrayList<>();

        System.out.println("������� ������ (������ ������ ��� ����������):");

        // ������ ������� �� ������ ������
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            logins.add(input);
        }

        // ���������� �������, ������������ �� 'f'
        List<String> filteredLogins = logins.stream()
                .filter(login -> !login.isEmpty() && login.charAt(0) == 'f')
                .collect(Collectors.toList());

        System.out.println("\n������, ������������ �� 'f':");
        filteredLogins.forEach(System.out::println);
    }
}