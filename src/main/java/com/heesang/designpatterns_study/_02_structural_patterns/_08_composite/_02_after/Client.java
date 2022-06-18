package com.heesang.designpatterns_study._02_structural_patterns._08_composite._02_after;

public class Client {

    public static void main(String[] args) {
        Item book = new Item("자바의 정석", 15000);
        Item iphone13 = new Item("아이폰13", 20000);

        Bag miniBag = new Bag();
        miniBag.add(book);
        miniBag.add(iphone13);

        Item jacket = new Item("자켓", 100000);
        Bag bigBag = new Bag();
        bigBag.add(jacket);
        bigBag.add(miniBag);

        Character heesang = new Character(bigBag);

        Client client = new Client();
        client.printPrice(miniBag);
        client.printPrice(heesang);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
