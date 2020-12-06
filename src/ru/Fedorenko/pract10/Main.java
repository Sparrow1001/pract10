package ru.Fedorenko.pract10;

public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex complex = factory.createComplex();
        Complex complex1 = factory.CreateComplex(111,222);
    }
}
