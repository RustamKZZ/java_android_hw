package lesson09;

public class MyArrayDataException extends RuntimeException{
    public int i;
    public int j;

    public MyArrayDataException(String message, int i, int j) {
        super(message);
        this.i = i;
        this.j = j;
    }
}
