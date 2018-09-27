package tech.bts.examples;

/**
 * A unary operation has one operand.
 *
 * Note: when you "extend" an interface, you need to use the keyword "implements".
 * Note: this class is abstract because it doesn't implement the method {@link Operation#getResult()}.
 */
abstract public class UnaryOperation implements Operation {

    private double operand;

    public UnaryOperation(double operand) {
        this.operand = operand;
    }

    public double getOperand() {
        return operand;
    }
}
