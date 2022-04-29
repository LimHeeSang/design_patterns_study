package com.heesang.designpatterns_study._01_creational_patterns._02_factory_method._02_after;

import com.heesang.designpatterns_study._01_creational_patterns._03_abstract_factory._01_before.WhiteAnchor;
import com.heesang.designpatterns_study._01_creational_patterns._03_abstract_factory._01_before.WhiteWheel;

public class Ship {

    private String name;

    private String color;

    private String logo;

    private WhiteWheel wheel;

    private WhiteAnchor anchor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }

    public WhiteWheel getWheel() {
        return wheel;
    }

    public void setWheel(WhiteWheel wheel) {
        this.wheel = wheel;
    }

    public WhiteAnchor getAnchor() {
        return anchor;
    }

    public void setAnchor(WhiteAnchor anchor) {
        this.anchor = anchor;
    }
}
