package org.example;

public class Sculptor extends Artist{
    Sculptor(int age, String name) {
        super(age, name);
    }

    /**
     * Создание скульптуры
     * @return Скульптура
     */
    @Override
    Art Create() {
        return new Sculpture();
    }
}
