package org.example;

public class Painter extends Artist {

    Painter(int age, String name) {
        super(age, name);
    }

    @Override
    Art Create() {
        return new Picture();
    }
}
