package tech.bts.examples;

public class Square extends UnaryOperation {

    public Square(double operand) {
        super(operand);
    }

    public double getResult() {
        return getOperand() * getOperand();
    }
}
