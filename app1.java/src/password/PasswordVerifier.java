public class PasswordVerifier {

    public void checkPassword(String str1) throws LesscharactersException, NoCapLettersException, NoNumbersException {
        if (str1.length() < 8) {
            throw new LesscharactersException("Less than eight characters");
        }
        if (!str1.matches(".*\\p{Lu}.*")) {
            throw new NoCapLettersException("No capital letters");
        }
        if (str1.matches("^\\D*$")) {
            throw new NoNumbersException("No numbers");
        }

    }
}
