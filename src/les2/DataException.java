package les2;

public class DataException extends RuntimeException {
    public DataException(String Value, int row, int col) {
        super(String.format("Invalid value '%s' in array cell[%d][%d], required integer",
                Value, row, col));
    }
}
