package org.calc;

public class Calculator {

    public Result calculate(double x, String op, double y) {
        double result = switch (op) {
            case "add" -> x + y;
            case "sub" -> x - y;
            case "mult" -> x * y;
            case "div" -> x / y;
            default -> 0;
        };
        return new Result(x, op, y, result);
    }
}
