package com.heesang.designpatterns_study._02_structural_patterns._08_composite._01_before;

public class Client {

    public static void main(String[] args) {
        Item book = new Item("자바의 정석", 15000);
        Item iphone13 = new Item("아이폰13", 20000);

        Bag bag = new Bag();
        bag.add(book);
        bag.add(iphone13);

        Client client = new Client();
        client.printPrice(book);
        client.printPrice(bag);
    }

    public void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    public void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);
    }
}
