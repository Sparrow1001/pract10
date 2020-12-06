package ru.Fedorenko.pract10_2;

public class MagicChair implements Chair {
    public void doMagic(){
        System.out.println("uuuu Magic!!!");
    }
    public MagicChair(){
        doMagic();
    }

    @Override
    public String toString() {
        return "Magic Chair";
    }
}
