package src.main.lecture_4;

public class Exercise4 {
    public static void main(String[] args) {
        /** Задание №1 Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
         Конструктор класса должен заполнять эти поля при создании объекта.
         Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.**/

        /**Employee employee = new Employee("Литвин Вячеслав Васильевич", "инженер по тестированию", "litvinslava1986@gmail.com", "+375292115600", 10000000, 38);
         employee.printEmployeeInfo();/**


         /** Задание №2 Создать массив из 5 сотрудников.
         Пример:
         вначале объявляем массив объектов
         Person[] persArray = new Person[5];
         потом для каждой ячейки массива задаем объект
         persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
         persArray[1] = new Person(...);
         ...
         persArray[4] = new Person(...);}
         }**/

        /**Employee[] employees = new Employee[5];
         employees[0] = new Employee("Литвин Вячеслав Васильевич", "инженер по тестированию", "litvinslava1986@gmail.com", "+375292115600", 10000000, 38);
         employees[1] = new Employee("Литвин Арсений Вячеславович", "эксперт по прокрастинации'", "litvinArseniy2014@gmail.com", "+375292115601", 100000000, 11);
         employees[2] = new Employee("Литвин Виктория Владимировна", "инженер по домохозяйству", "litvinVika1989@gmail.com", "+375292115602", 1000000, 36);
         employees[3] = new Employee("Литвин Злата Вячеславовна", "эксперт по аудио сказкам и детским песням", "litvinZlata2022@gmail.com", "+375292115603", 2000000000, 2);
         employees[4] = new Employee("МТЗ", "мотоблок", "MTZ1991@gmail.com", "+375292115666", 10000000, 33);

         for (Employee employee: employees) {
         employee.printEmployeeInfo();
         System.out.println();
         }/**
         /** Задание №3 Создать класс Park с внутренним классом, с помощью объектов
         которого можно хранить информацию об аттракционах, времени их работы и стоимости.**/
        Park park = new Park("Центральный парк", "Полоцк", 862, 341.0, 10000000);
        park.printParkInfo();
        System.out.println();

        Park.Attraction attraction1 = park.new Attraction("Колесо обозревания", "10:00 - 22:00", 5.0);
        Park.Attraction attraction2 = park.new Attraction("Американские горки", "11:00 - 20:00", 7.0);
        Park.Attraction attraction3 = park.new Attraction("Карусель", "09:00 - 18:00", 3.0);

        System.out.println("Аттракционы парка:");
        attraction1.printAttractionInfo();
        System.out.println();
        attraction2.printAttractionInfo();
        System.out.println();
        attraction3.printAttractionInfo();
    }
}