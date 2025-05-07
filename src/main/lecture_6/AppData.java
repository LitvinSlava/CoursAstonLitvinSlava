package src.main.lecture_6;
import java.io.*;

public class AppData {
    // Поля объявлены как final для обеспечения неизменяемости
    private final String[] header;
    private final int[][] data;

    //конструктор
    public AppData(String[] header, int[][] data) {
        this.header = header != null ? header.clone() : new String[0];
        this.data = deepCopy(data != null ? data : new int[0][]);
    }
    // Метод для экспорта данных
    public void exportData(DataExporter exporter) {
        exporter.export(header, data);
    }

    // Метод для создания объекта из импортированных данных
    public static AppData importData(DataImporter importer) throws IOException {
        return importer.importData();
    }

    // Копирование двумерного массива
    private static int[][] deepCopy(int[][] matrix) {
        int[][] result = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i].clone();
        }
        return result;
    }
}
