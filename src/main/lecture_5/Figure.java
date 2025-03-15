package src.main.lecture_5;

public interface Figure {
    // Методы для расчета периметра и площади
    double calculatePerimeter();
    double calculateArea();

    // Методы для получения цветов
    String getFillColor();
    String getBorderColor();

    // Дефолтный метод для вывода информации
    default void printInfo() {
        System.out.println("Периметр: " + String.format("%.2f", calculatePerimeter()));
        System.out.println("Площадь: " + String.format("%.2f", calculateArea()));
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границ: " + getBorderColor());
        System.out.println("-----------------------");
    }
}
