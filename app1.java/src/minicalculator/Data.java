package minicalculator;

public class Data {
    Integer num1;
    Integer num2;
    char op;
    Integer result = 0;

    public Data() {
    }

    public Data(int n1, int n2, char op, int result) {
        this.num1 = n1;
        this.num2 = n2;
        this.op = op;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.num1 + " ");
        sb.append(this.op + " ");
        sb.append(this.num2 + " = ");
        sb.append(this.result + "");
        return sb.toString();
    }

}
