package oop.model;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Cow cow = new Cow();
        Goat goat = new Goat();
        Grass grass = new Grass();
        System.out.println(lion.eat(lion));
        System.out.println(lion.eat(cow));
        System.out.println(cow.eat(grass));
        System.out.println(goat.eat(grass));
    }
}
