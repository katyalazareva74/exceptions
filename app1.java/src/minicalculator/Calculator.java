package minicalculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    List<Data> lists;

    public Calculator() {
        this.lists = new ArrayList<>();
    }

    CalOperation cop = new CalOperation();

    public Data calculator1(Data data1) throws IllegalArgumentException  {
        if (data1.num1 == null) {
            return data1;
        }
        switch (data1.op) {
            case '+':
                data1.result = cop.addition(data1.num1, data1.num2);
                return data1;
            case '-':
                data1.result = cop.subtraction(data1.num1, data1.num2);
                return data1;
            case '*':
                data1.result = cop.multiplication(data1.num1, data1.num2);
                return data1;
            case '^':
                data1.result = cop.exponentiation(data1.num1, data1.num2);
                return data1;
            case '/':
                data1.result = cop.division(data1.num1, data1.num2);
                return data1;
            default:
                throw new IllegalArgumentException("Invalid operation, try again");
        }
    }

    public void saveOperation(Data data) {
        this.lists.add(data);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.lists);
        return sb.toString();
    }

}
