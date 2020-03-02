package les2;

public class SizeException extends IllegalArgumentException {

    public SizeException() {
        super("Invalid array size, required 4x4");
    }
}
