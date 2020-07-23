package ru.job4j.oop;

public class Cat {
    private String food;
    private String nick;

    public void show() {
        System.out.println(this.food);
        System.out.println(this.nick);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.nick = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food and his nick.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Innokenty");
        gav.show();
        System.out.println("There are black's food and his nick.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Stepa");
        black.show();
    }
}
