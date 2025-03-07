package src.main.lecture_4;

/**
 * ������� �1 ������� ����� "���������" � ������: ���, ���������, email, �������, ��������, �������.
 * ����������� ������ ������ ��������� ��� ���� ��� �������� �������.
 * ������ ������ ���������� �������� �����, ������� ������� ���������� �� ������� � �������.
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
        System.out.println("���������� � ����������:");
        System.out.println("���: " + fullName);
        System.out.println("���������: " + jobTitle);
        System.out.println("email: " + email);
        System.out.println("�������: " + phone);
        System.out.println("��������: " + salary);
        System.out.println("�������: " + age);
    }
}
