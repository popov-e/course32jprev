package ru.otus;

public class Blackbird extends Bird {
    public Blackbird(String name) {
        super(name);
    }

    public void feed() {
        setFlying(true);
    }
}
