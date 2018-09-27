package tech.bts.examples;

public class Sum extends Operation {

    public Sum(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double getResult() {
        return getOperand1() + getOperand2();
    }
}
