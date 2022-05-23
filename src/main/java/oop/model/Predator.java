package oop.model;

public abstract class Predator extends Animal implements MeatEatable {
    @Override
    public String eat(Animal eat) {
        if (eat.getClass() != this.getClass()) {
            return "I'm a " + this.getClass().getSimpleName()
                    + " and I eat a " + eat.getClass().getSimpleName();
        }
        return "I'm a " + this.getClass().getSimpleName()
        + " and I don't want to eat myself!";
    }
}
