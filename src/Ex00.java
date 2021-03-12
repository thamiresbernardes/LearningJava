import java.util.Locale;

public class Ex00 {
    public static void main(String[] args) {
        int y = 32;
        double x = 65.5;
        System.out.println(y);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
    }
}