package tech.bts.examples;

abstract public class BinaryOperation extends Operation {

    private double operand1;
    private double operand2;

    public BinaryOperation(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

}
