package com.heesang.designpatterns_study._01_creational_patterns._03_abstract_factory._02_after;

import com.heesang.designpatterns_study._01_creational_patterns._02_factory_method._02_after.Ship;
import com.heesang.designpatterns_study._01_creational_patterns._02_factory_method._02_after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

        System.out.println();

        ShipFactory shipFroFactory = new WhiteShipFactory(new WhiteShipPartsProFactory());
        Ship proShip = shipFroFactory.createShip();
        System.out.println(proShip.getAnchor().getClass());
        System.out.println(proShip.getWheel().getClass());
    }
}
