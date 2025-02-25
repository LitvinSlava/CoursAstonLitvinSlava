package src.main.lecture_4;

/**
 * ������� �3 ������� ����� Park � ���������� �������, � ������� ��������
 * �������� ����� ������� ���������� �� ������������, ������� ��
 * ������ � ���������.
 **/

public class Park {
    private String name;
    private String location;
    private int yearStart;
    private double area;
    private int visitorsCount;

    public Park(String name, String location, int yearStart, double area, int visitorsCount) {
        this.name = name;
        this.location = location;
        this.yearStart = yearStart;
        this.area = area;
        this.visitorsCount = visitorsCount;
    }

    public class Attraction {
        private String name;
        private double price;
        private String workTime;

        public Attraction(String name, String workTime, double price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        public void printAttractionInfo() {
            System.out.println("����������: " + name);
            System.out.println("���������: " + price + " ���.");
            System.out.println("����� ������: " + workTime);
        }
    }

    public void printParkInfo() {
        System.out.println("����: " + name);
        System.out.println("��������������: " + location);
        System.out.println("��� ���������: " + yearStart);
        System.out.println("�������: " + area + " ��");
        System.out.println("����������� � ���: " + visitorsCount);
    }
}
