package les2;

public class Main2 {


    private static final String[][] CORRECT = new String[][]{
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"},
    };

    private static final String[][] INCORRECT_SIZE = new String[][]{
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11"},
            {"13", "14", "15"},
    };


    private static final String[][] INCORRECT_VALUE = new String[][]{
            {"1", "2", "3", "4"},
            {"5", "b", "7", "8"},
            {"9", "1O", "11", "12"},
            {"13", "14", "15", "16"},
    };


    public static void main(String[] args) {
        try {
       // int result = sumArrayValues(CORRECT);
//            int result = sumArrayValues(INCORRECT_SIZE);
            int result = sumArrayValues(INCORRECT_VALUE);
            System.out.println("summa: " + result);
        } catch (SizeException e) {
            System.out.println("Некорректный размер ");
            System.out.println(e.getMessage());
//            e.printStackTrace();
        } catch (DataException e) {
            System.out.println("Некорректные данные ");
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
    }

    private static int sumArrayValues(String[][] data) {
        checkArraySize(data);

        int sumResult = 0;

        for (int rowIndex = 0; rowIndex < data.length; rowIndex++) {
            String[] row = data[rowIndex];
            for (int colIndex = 0; colIndex < row.length; colIndex++) {
                String value = row[colIndex];
                try {

                    sumResult = sumResult + Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    throw new DataException(value, rowIndex, colIndex);
                }
            }
        }

        return sumResult;
    }

    private static void checkArraySize(String[][] data) {
        if (data.length != 4) {
            throw new SizeException();
        }

        for (String[] row : data) {
            if (row.length != 4) {
                throw new SizeException();
            }
        }
    }
}
