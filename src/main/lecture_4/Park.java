package src.main.lecture_4;

/**
 * Задание №3 Создать класс Park с внутренним классом, с помощью объектов
 * которого можно хранить информацию об аттракционах, времени их
 * работы и стоимости.
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
            System.out.println("Аттракцион: " + name);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println("Время работы: " + workTime);
        }
    }

    public void printParkInfo() {
        System.out.println("Парк: " + name);
        System.out.println("Местоположение: " + location);
        System.out.println("Год основания: " + yearStart);
        System.out.println("Площадь: " + area + " га");
        System.out.println("Посетителей в год: " + visitorsCount);
    }
}
