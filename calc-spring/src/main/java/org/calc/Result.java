package org.calc;

public class Result {
    private double x;
    private double y;
    private String op;
    private double result;

    public Result(double x, String op, double y, double result) {
        this.x = x;
        this.op = op;
        this.y = y;
        this.result = result;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getOp() {
        return op;
    }

    public double getResult() {
        return result;
    }
}