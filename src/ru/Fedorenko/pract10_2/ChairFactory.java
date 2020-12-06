package ru.Fedorenko.pract10_2;

public class ChairFactory implements AbstractChairFactory {

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair((int)(Math.random()*100));
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }
}
