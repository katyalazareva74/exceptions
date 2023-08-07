package minicalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public void calculation() {
        try (Scanner scanner1 = new Scanner(System.in)) {
            char z = 'n';
            Calculator calck = new Calculator();
            Data data = new Data();
            while (z == 'n') {
                try {
                    System.out.println("Введите целое первое число: ");
                    int num1 = scanner1.nextInt();
                    System.out.println("Введите операцию (+, -, *, /, ^): ");
                    char op = scanner1.next().charAt(0);
                    System.out.print("Введите целое второе число:\n");
                    int num2 = scanner1.nextInt();
                    data = new Data(num1, num2, op, 0);
                } catch (InputMismatchException e) {
                    String str2 = scanner1.nextLine();
                    System.out.println("Incorrect number input");
                }
                try {
                    data = calck.calculator1(data);
                } catch (ArithmeticException | IllegalArgumentException e) {
                    data = new Data();
                    System.out.println(e.getMessage());
                }
                calck.saveOperation(data);
                String str = data.toString();
                System.out.println(str);
                System.out.println("Вы хотите завершить работу (y или n)? ");
                z = scanner1.next().charAt(0);
                if (z == 'y') {
                    String str1 = calck.toString();
                    System.out.println(str1);
                    System.out.println("Завершение работы");
                }
            }
        }
    }
}
