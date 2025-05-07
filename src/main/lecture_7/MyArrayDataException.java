package src.main.lecture_7;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int col, String value) {
        super(String.format(
                "Некорректные данные в ячейке [%d][%d]: '%s'",
                row, col, value
        ));
    }
}
