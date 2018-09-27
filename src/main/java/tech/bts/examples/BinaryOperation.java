package tech.bts.examples;

/**
 * A binary operation has 2 operands.
 *
 * Note: when you "extend" an interface, you need to use the keyword "implements".
 * Note: this class is abstract because it doesn't implement the method {@link Operation#getResult()}.
 */
abstract public class BinaryOperation implements Operation {

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
