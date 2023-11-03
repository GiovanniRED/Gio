// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите математическое выражение через пробел: ");
        String expression = scanner.nextLine();

        scanner.close();

        String[] parts = expression.split(" ");
        int a = Integer.parseInt(parts[0]);
            if(a == 0) {
                throw new IOException();
        }
        String xz = parts[1];
        int b = Integer.parseInt(parts[2]); {
            if(b == 0) {
                throw new IOException();
            }
        }

        int result = 0;

        if (xz.equals("+")) {
            result = a + b;
        } else if (xz.equals("-")) {
            result = a - b;
        } else if (xz.equals("*")) {
            result = a * b;
        } else if (xz.equals("/")) {
            result = a / b;
        }

        System.out.println("Результат: " + result);
    }
}