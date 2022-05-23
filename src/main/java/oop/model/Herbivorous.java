package oop.model;

public abstract class Herbivorous extends Animal implements HerbEatable {
    @Override
    public String eat(Herb eat) {
        return "I'm a " + this.getClass().getSimpleName()
                + " and I eat a " + eat.getClass().getSimpleName();
    }
}
