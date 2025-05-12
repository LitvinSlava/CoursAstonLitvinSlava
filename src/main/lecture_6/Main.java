package src.main.lecture_6;
import java.io.*;


public class Main {
    public static void main(String[] args) {
         /*Задание №1 Реализовать сохранение данных в csv файл
           Задание №2 Реализовать загрузку данных из csv файла. Файл читается целиком.*/

        // 1. Создаем тестовые данные
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };
        AppData appData = new AppData(header, data);

        // 2. Экспортируем в файл
        DataExporter exporter = new CsvExporter("data/exportData.csv");
        appData.exportData(exporter);

        // 3. Импортируем из файла
        try {
            DataImporter importer = new CsvImporter("data/importData.csv");
            AppData importedData = AppData.importData(importer);
        } catch (IOException e) {
            System.err.println("Import failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}