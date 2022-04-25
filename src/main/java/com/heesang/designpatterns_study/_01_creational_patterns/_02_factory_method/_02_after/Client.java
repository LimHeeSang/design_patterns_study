package com.heesang.designpatterns_study._01_creational_patterns._02_factory_method._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "limheesang@mail.com");
        client.print(new BlackShipFactory(), "blackship", "limheesang@mail.com");
    }

    private void print(ShipFactory ship, String name, String email) {
        System.out.println(ship.orderShip(name, email));
    }
}
