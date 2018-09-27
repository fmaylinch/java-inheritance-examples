package tech.bts.examples;

public class Division extends Operation {

    public Division(double operand1, double operand2) {
        super(operand1, operand2);
    }

    public double getResult() {
        return getOperand1() / getOperand2();
    }

}
