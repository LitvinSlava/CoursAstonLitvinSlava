package src.main.lecture_4;

public class Exercise4 {
    public static void main(String[] args) {
        /** ������� �1 ������� ����� "���������" � ������: ���, ���������, email, �������, ��������, �������.
         ����������� ������ ������ ��������� ��� ���� ��� �������� �������.
         ������ ������ ���������� �������� �����, ������� ������� ���������� �� ������� � �������.**/
//        Employee employee = new Employee("������ �������� ����������", "������� �� ������������", "litvinslava1986@gmail.com", "+375292115600", 10000000, 38);
//        employee.printEmployeeInfo();


        /** ������� �2 ������� ������ �� 5 �����������.
         ������:
         // ������� ��������� ������ ��������
         Person[] persArray = new Person[5];
         // ����� ��� ������ ������ ������� ������ ������
         persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
         persArray[1] = new Person(...);
         ...
         persArray[4] = new Person(...);}
         }**/
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("������ �������� ����������", "������� �� ������������", "litvinslava1986@gmail.com", "+375292115600", 10000000, 38);
        employees[1] = new Employee("������ ������� ������������", "������� �� ��������������'", "litvinArseniy2014@gmail.com", "+375292115601", 100000000, 11);
        employees[2] = new Employee("������ �������� ������������", "������� �� �������������", "litvinVika1989@gmail.com", "+375292115602", 1000000, 36);
        employees[3] = new Employee("������ ����� ������������", "������� �� ������������ � ������� ������", "litvinZlata2022@gmail.com", "+375292115603", 2000000000, 2);
        employees[4] = new Employee("���", "��������", "MTZ1991@gmail.com", "+375292115666", 10000000, 33);

        for (Employee employee: employees) {
            employee.printEmployeeInfo();
            System.out.println();
        }
        /** ������� �3 ������� ����� Park � ���������� �������, � ������� ��������
         �������� ����� ������� ���������� �� ������������, ������� ��
         ������ � ���������.**/
    }
}