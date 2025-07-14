import java.util.InputMismatchException;

public class TypeCastingExceptionExample {
    public static void main(String[] args) {
        try {
            Object obj = new Object();
            String str = (String) obj;

            System.out.println(str);
        } catch (InputMismatchException e) {
            // CastClassException child Exception
            // InputMistmatchedException child Exception
            System.out.println("Tidak bisa mengubah object menjadi string.");
        }
    }
}
