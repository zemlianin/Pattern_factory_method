package org.example;

/**
 * Конкретная реализация продукта фабричного метода.
 */
public class Sculpture extends Art {
    @Override
    String show() {
        return "Я скульптура!";
    }
}
