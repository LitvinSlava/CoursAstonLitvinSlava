package src.main.lecture_6;
import java.io.*;

public class AppData {
    // ���� ��������� ��� final ��� ����������� ��������������
    private final String[] header;
    private final int[][] data;

    //�����������
    public AppData(String[] header, int[][] data) {
        this.header = header != null ? header.clone() : new String[0];
        this.data = deepCopy(data != null ? data : new int[0][]);
    }
    // ����� ��� �������� ������
    public void exportData(DataExporter exporter) {
        exporter.export(header, data);
    }

    // ����� ��� �������� ������� �� ��������������� ������
    public static AppData importData(DataImporter importer) throws IOException {
        return importer.importData();
    }

    // ����������� ���������� �������
    private static int[][] deepCopy(int[][] matrix) {
        int[][] result = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i].clone();
        }
        return result;
    }
}
