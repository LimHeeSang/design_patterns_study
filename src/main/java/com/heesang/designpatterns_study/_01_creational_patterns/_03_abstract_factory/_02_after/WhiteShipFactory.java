package com.heesang.designpatterns_study._01_creational_patterns._03_abstract_factory._02_after;

import com.heesang.designpatterns_study._01_creational_patterns._02_factory_method._02_after.DefaultShipFactory;
import com.heesang.designpatterns_study._01_creational_patterns._02_factory_method._02_after.Ship;
import com.heesang.designpatterns_study._01_creational_patterns._02_factory_method._02_after.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    private final ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
