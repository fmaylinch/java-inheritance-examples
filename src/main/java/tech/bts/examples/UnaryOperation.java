package tech.bts.examples;

abstract public class UnaryOperation extends Operation {

    private double operand;

    public UnaryOperation(double operand) {
        this.operand = operand;
    }

    public double getOperand() {
        return operand;
    }
}
