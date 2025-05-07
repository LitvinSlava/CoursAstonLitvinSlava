package src.main.lecture_5;

public interface Figure {
    // ������ ��� ������� ��������� � �������
    double calculatePerimeter();
    double calculateArea();

    // ������ ��� ��������� ������
    String getFillColor();
    String getBorderColor();

    // ��������� ����� ��� ������ ����������
    default void printInfo() {
        System.out.println("��������: " + String.format("%.2f", calculatePerimeter()));
        System.out.println("�������: " + String.format("%.2f", calculateArea()));
        System.out.println("���� ����: " + getFillColor());
        System.out.println("���� ������: " + getBorderColor());
        System.out.println("-----------------------");
    }
}
