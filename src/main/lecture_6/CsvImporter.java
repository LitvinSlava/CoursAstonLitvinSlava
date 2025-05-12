package src.main.lecture_6;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvImporter implements DataImporter{
    private final String filePath;

    public CsvImporter(String filePath) {
        this.filePath = filePath;
    }

    public AppData importData() throws IOException {
        List<String> lines = readAllLines();
        if (lines.isEmpty()) {
            throw new IOException("File is empty");
        }

        String[] header = parseHeader(lines.get(0));
        int[][] data = parseData(lines.subList(1, lines.size()));

        return new AppData(header, data);
    }

    private List<String> readAllLines() throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    private String[] parseHeader(String headerLine) {
        return headerLine.split(";");
    }

    private int[][] parseData(List<String> dataLines) {
        int[][] data = new int[dataLines.size()][];
        for (int i = 0; i < dataLines.size(); i++) {
            data[i] = parseDataRow(dataLines.get(i));
        }
        return data;
    }

    private int[] parseDataRow(String row) {
        String[] parts = row.split(";");
        int[] values = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            values[i] = Integer.parseInt(parts[i].trim());
        }
        return values;
    }
}
