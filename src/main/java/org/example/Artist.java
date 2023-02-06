package org.example;

public abstract class Artist{
    int age;
    String name;
    Artist(int age,String name){
        this.age = age;
        this.name = name;
    }

    /**
     * Фабричный метод.
     * @return произведение искусства
     */
    abstract Art Create();
}
