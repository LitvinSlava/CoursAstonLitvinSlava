package src.main.lecture_4;

/**
 * Задание №1 Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * Конструктор класса должен заполнять эти поля при создании объекта.
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 **/

public class Employee {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String jobTitle, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployeeInfo() {
        System.out.println("Информация о сотруднике:");
        System.out.println("ФИО: " + fullName);
        System.out.println("должность: " + jobTitle);
        System.out.println("email: " + email);
        System.out.println("телефон: " + phone);
        System.out.println("зарплата: " + salary);
        System.out.println("возраст: " + age);
    }
}
