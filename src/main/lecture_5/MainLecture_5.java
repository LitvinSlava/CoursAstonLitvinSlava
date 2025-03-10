package src.main.lecture_5;

public class MainLecture_5 {
    public static void main(String[] args) {

        // Создаем животных
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        // Проверяем бег и плавание
        dog1.run(501);
        dog1.run(499);
        dog1.swim(11);
        dog1.swim(9);

        cat1.run(201);
        cat1.run(199);
        cat1.swim(1);

        // Создаем миску и массив котов
        Bowl bowl = new Bowl(30);
        Cat[] cats = {cat1, cat2};

        // Кормим котов
        for (Cat cat : cats) {
            cat.eat(bowl, 20);
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
