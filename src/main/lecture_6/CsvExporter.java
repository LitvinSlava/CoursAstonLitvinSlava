package src.main.lecture_6;
import java.io.*;

public class CsvExporter implements DataExporter {
    private final String filePath;

    public CsvExporter(String filePath) {
        this.filePath = filePath;
    }

    public void export(String[] header, int[][] data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writeHeader(writer, header);
            writeData(writer, data);
        } catch (IOException e) {
            handleException("Export failed", e);
        }
    }

    private void writeHeader(BufferedWriter writer, String[] header) throws IOException {
        writer.write(String.join(";", header));
        writer.newLine();
    }

    private void writeData(BufferedWriter writer, int[][] data) throws IOException {
        for (int[] row : data) {
            String[] strRow = new String[row.length];
            for (int i = 0; i < row.length; i++) {
                strRow[i] = String.valueOf(row[i]);
            }
            writer.write(String.join(";", strRow));
            writer.newLine();
        }
    }

    private void handleException(String message, Exception e) {
        System.err.println(message + ": " + e.getMessage());
        e.printStackTrace();
    }
}
