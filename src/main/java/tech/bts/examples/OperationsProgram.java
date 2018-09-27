package tech.bts.examples;

import java.util.ArrayList;
import java.util.List;

public class OperationsProgram {

    public static void main(String[] args) {

        Operation op1 = new Sum(5, 7);
        Operation op2 = new Multiplication(3, 5);
        Operation op3 = new Division(5, 2);
        Operation op4 = new Square(3);
        Operation op5 = new Zero();

        List<Operation> operations = new ArrayList<Operation>();
        operations.add(op1);
        operations.add(op2);
        operations.add(op3);
        operations.add(op4);
        operations.add(op5);

        // Loop the list and print the result of each operation

        // live templates
        for (Operation op : operations) {
            System.out.println(op.getResult());
        }
    }
}
