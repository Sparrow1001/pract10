package ru.Fedorenko.pract10_2;

public class FunctionalChair implements Chair {
    public int Sum(int a, int b){
        return a+b;
    }
    FunctionalChair(){
        Sum((int)(Math.random()*10), (int)(Math.random()*10));
    }
}
