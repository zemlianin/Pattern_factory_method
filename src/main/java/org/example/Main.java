package org.example;

public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Sculptor(40, "Петя");
        Artist artist2 = new Painter(40, "Сеня");
        Art art1 = artist1.create();
        Art art2 = artist2.create();
        System.out.println(art1.show());
        System.out.println(art2.show());
    }
}