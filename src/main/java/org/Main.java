package org;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.subtract(1, 2));
        System.out.println(calculator.multiply(1, 2));
        System.out.println(calculator.divide(3, 3));
    }
}