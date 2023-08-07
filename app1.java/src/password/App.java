import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner1 = new Scanner(System.in)) {
            boolean n = true;
            PasswordVerifier passV = new PasswordVerifier();
            while(n) {
                System.out.println("Введите пароль: ");
                String password = scanner1.nextLine();
                try {
                    passV.checkPassword(password);
                    n = false;
                    System.out.println("Password entered successfully");
                } catch (LesscharactersException | NoCapLettersException | NoNumbersException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
