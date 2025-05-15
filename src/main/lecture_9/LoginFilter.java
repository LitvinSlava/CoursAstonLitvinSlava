package src.main.lecture_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*Задание №5. Нужно написать программу, которая будет принимать от
пользователя ввод различных логинов. Как только пользователь введет
пустую строку - программа должна прекратить приём данных от
пользователя и вывести в консоль логины, начинающиеся на букву f
(строчную).*/

public class LoginFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> logins = new ArrayList<>();

        System.out.println("Вводите логины (пустая строка для завершения):");

        // Чтение логинов до пустой строки
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            logins.add(input);
        }

        // Фильтрация логинов, начинающихся на 'f'
        List<String> filteredLogins = logins.stream()
                .filter(login -> !login.isEmpty() && login.charAt(0) == 'f')
                .collect(Collectors.toList());

        System.out.println("\nЛогины, начинающиеся на 'f':");
        filteredLogins.forEach(System.out::println);
    }
}