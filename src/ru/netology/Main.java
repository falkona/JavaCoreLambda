package ru.netology;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        //int c = calc.divide.apply(a, b); // падает из-за деления на 0, т.к. b=0
        int c = calc.abs.apply(35);
        calc.println.accept(c);
    }
}
