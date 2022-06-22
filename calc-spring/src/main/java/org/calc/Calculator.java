package org.calc;

public class Calculator {
    private double x;
    private double y;
    private String op;

    private double result;


    public Calculator(double x, String op, double y) {
        this.x = x;
        this.y = y;
        this.op = op;
        this.result = switch (op) {
            case "add" -> x + y;
            case "sub" -> x - y;
            case "mult" -> x * y;
            case "div" -> x / y;
            default -> 0;
        };
    }

    public double getX() {
        return x;
    }

    public String getOp() {
        return op;
    }

    public double getY() {
        return y;
    }

    public double getResult() {
        return result;
    }
}
