package tech.bts.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of class inheritance (hierarchy of classes).
 *
 * Here we define the {@link Operation} interface and 3 subclasses:
 * {@link BinaryOperation}, {@link UnaryOperation} and {@link Zero}.
 *
 * {@link BinaryOperation} and {@link UnaryOperation} are abstract because
 * they can't decide how to calculate the result. Those classes have concrete
 * subclasses that implement the {@link Operation#getResult()} method.
 */
public class OperationsProgram {

    public static void main(String[] args) {

        // Create some operations
        Operation op1 = new Sum(5, 7);
        Operation op2 = new Multiplication(3, 5);
        Operation op3 = new Division(5, 2);
        Operation op4 = new Square(3);
        Operation op5 = new Zero();

        // Add the operations to a list
        List<Operation> operations = new ArrayList<Operation>();
        operations.add(op1);
        operations.add(op2);
        operations.add(op3);
        operations.add(op4);
        operations.add(op5);

        // Loop through the operations and print their result
        for (Operation op : operations) {
            System.out.println(op.getResult());
        }
    }
}
