package com.company;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Machine {
    private static Integer index;
    private  Integer price;
    private String name;
    private static List<String> names = List.of("Бананочипсы", "Конфета", "Вода");
    private static List<Integer> prices = List.of(100, 30, 25);
   // private static HashMap<Integer,String> goods =



    public Machine() {
    }

    public Machine(Integer price, String name) {
        this.price = price;
        this.name = name;
    }
    public Machine(Integer index, Integer price, String name) {
        this.index=index;
        this.price = price;
        this.name = name;
    }
    public static List<Machine> makeMachine(List<Machine> machines) {
        for(int i = 0 ; i<3;i++){
            index = index+1;
            machines.stream()
                    .

        }
        return machines;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format("%s \t %s %s",index, price,name);
    }
}
