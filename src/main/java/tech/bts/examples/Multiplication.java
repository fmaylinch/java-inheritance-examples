package tech.bts.examples;

public class Multiplication extends Operation {

    public Multiplication(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double getResult() {
        return getOperand1() * getOperand2();
    }
}
