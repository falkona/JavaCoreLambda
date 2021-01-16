package ru.netology.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        //int c = calc.divide.apply(a, b); // падает из-за деления на 0, т.к. b=0
        int c = calc.abs.apply(35); // вроде нормально работает, проверила на 0, положительном и отрицательном значении
        calc.println.accept(c);
    }
}
