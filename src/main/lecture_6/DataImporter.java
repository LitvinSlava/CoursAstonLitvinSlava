package src.main.lecture_6;
import java.io.*;

public interface DataImporter {
    AppData importData() throws IOException;
}