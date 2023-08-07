package minicalculator;

public class CalOperation {

    public int addition(int n1, int n2) {
        return n1 + n2;
    }

    public int subtraction(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public int exponentiation(int n1, int n2)throws ArithmeticException {
        if (n2 < 0)
            throw new ArithmeticException("Negative power, try again");
        else {
            int res = n1;
            if (n2 == 0)
                res = 1;
            else if (n2 > 1) {
                for (int i = 2; i <= n2; i++) {
                    res = res * n1;
                }
            }
            return res;
        }
    }

    public int division(int n1, int n2) throws ArithmeticException {
        if (n2 == 0)
            throw new ArithmeticException("Division by zero is not possible");
        return n1 / n2;
    }
}
