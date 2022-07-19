package com.company;

import jdk.jshell.spi.ExecutionControl;
import org.w3c.dom.ls.LSOutput;

import java.io.NotActiveException;
import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    private static   Integer change = 10;
    private static   Integer budged = 0;
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        List<Box> box= new ArrayList<>();
        Box box1 = new Box(1,"w");
        box.add( new Box(100,"Бананочипсы"));
        box.add( new Box(30,"Конфета"));
        box.add( new Box(25,"Вода"));
        BiFunction<Integer,String,Box> maker = Box::new;
        System.out.println(box);
        while (true){
            getAction(box);
        }
    }

    public static void  moneyIncrease(){
        budged = budged + change;
    }

    public static void  getAction(List<Box> boxes){
        if( budged <1){
            System.out.println("Ваш бюджет: "+ budged);
            System.out.println("Выберите действие: ");
            System.out.println("1. Закинуть монету ");
            System.out.println("0. Выход ");
        }
        else if( budged < boxes.get(2).getPrice()){
            System.out.println("Ваш бюджет: "+ budged);
            System.out.println("Выберите действие: ");
            System.out.println("1. Закинуть еще монеты ");
            System.out.println("0. Выход ");
        }else if ( budged < boxes.get(1).getPrice() && budged >= boxes.get(2).getPrice() ) {
            System.out.println("Ваш бюджет: "+ budged);
            System.out.println("Выберите действие: ");
            System.out.println("1. Закинуть еще монеты ");
            System.out.println("2. Купить " + boxes.get(2).getName()+" стоит: " + boxes.get(2).getPrice() );
            System.out.println("0. Выход ");
        }else if (  budged < boxes.get(0).getPrice()&& budged >= boxes.get(1).getPrice() ) {
            System.out.println("Ваш бюджет: "+ budged);
            System.out.println("Выберите действие: ");
            System.out.println("1. Закинуть еще монеты ");
            System.out.println("2. Купить " + boxes.get(2).getName()+" стоит: " + boxes.get(2).getPrice() );
            System.out.println("3. Купить " + boxes.get(1).getName()+" стоит: " + boxes.get(1).getPrice() );
            System.out.println("0. Выход ");
        } else  {
            System.out.println("Ваш бюджет: "+ budged);
            System.out.println("Выберите действие: ");
            System.out.println("1. Закинуть еще монеты ");
            System.out.println("2. Купить " + boxes.get(2).getName()+" стоит: " + boxes.get(2).getPrice() );
            System.out.println("3. Купить " + boxes.get(1).getName()+" стоит: " + boxes.get(1).getPrice() );
            System.out.println("4. Купить " + boxes.get(0).getName()+" стоит: " + boxes.get(0).getPrice() );
            System.out.println("0. Выход ");
        }
        Integer choose = new Scanner(System.in).nextInt();
        switch (choose){
            case 1:
                moneyIncrease();
                return;
            case 2:
                if(budged >= boxes.get(2).getPrice()){
                    System.out.println("Вы купили воду ");
                    budged= budged-boxes.get(2).getPrice();
                } else {System.out.println("Недостаточно средств ... ");
                }

                return;
            case 3:
                if(budged >= boxes.get(1).getPrice()){
                    System.out.println("Вы купили конфету ");
                    budged= budged-boxes.get(1).getPrice();
                } else {System.out.println("Недостаточно средств ... ");
                }
                return;
            case 4:
                if(budged >= boxes.get(0).getPrice()){
                    System.out.println("Вы купили бананочипсы ");
                    budged= budged-boxes.get(0).getPrice();
                } else {System.out.println("Недостаточно средств ... ");
                }
                return;
            case 5:
                System.out.println("  exit  ");
                break;
            default:
                System.out.println("not correct choose....");
                return;
        }

    }

}