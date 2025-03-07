package src.main.lecture_5;

public class MainLecture_5 {
    public static void main(String[] args) {

        // Создаем животных
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        // Проверяем бег и плавание
        dog1.run(600); // Бобик не может пробежать 600 м.
        dog1.run(400); // Бобик пробежал 400 м.
        dog1.swim(15); // Бобик не может проплыть 15 м.
        dog1.swim(5);  // Бобик проплыл 5 м.

        cat1.run(250); // Мурзик не может пробежать 250 м.
        cat1.run(150); // Мурзик пробежал 150 м.
        cat1.swim(10); // Мурзик не умеет плавать.

        // Создаем миску и массив котов
        Bowl bowl = new Bowl(30);
        Cat[] cats = {cat1, cat2};

        // Кормим котов
        for (Cat cat : cats) {
            cat.eat(bowl, 20); // Каждый кот пытается съесть 20 еды
        }

        // Проверяем сытость котов
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }

        // Добавляем еду в миску
        bowl.addFood(50);

        // Снова кормим котов
        for (Cat cat : cats) {
            cat.eat(bowl, 20);
        }

        // Проверяем сытость котов
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }

        // Выводим количество созданных животных
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
    }
}
