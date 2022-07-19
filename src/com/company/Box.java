package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Box  {
    int money = 0;
    private   Integer price;
    private  String name;

    public Box(Integer price, String name) {
        this.price = price;
        this.name = name;
    }
    public String getName(){return name;}

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("[%s] \t %-10s  ", price,name);
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

}
