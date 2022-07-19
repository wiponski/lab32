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
        box.add( new Box(100,"�����������"));
        box.add( new Box(30,"�������"));
        box.add( new Box(25,"����"));
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
            System.out.println("��� ������: "+ budged);
            System.out.println("�������� ��������: ");
            System.out.println("1. �������� ������ ");
            System.out.println("0. ����� ");
        }
        else if( budged < boxes.get(2).getPrice()){
            System.out.println("��� ������: "+ budged);
            System.out.println("�������� ��������: ");
            System.out.println("1. �������� ��� ������ ");
            System.out.println("0. ����� ");
        }else if ( budged < boxes.get(1).getPrice() && budged >= boxes.get(2).getPrice() ) {
            System.out.println("��� ������: "+ budged);
            System.out.println("�������� ��������: ");
            System.out.println("1. �������� ��� ������ ");
            System.out.println("2. ������ " + boxes.get(2).getName()+" �����: " + boxes.get(2).getPrice() );
            System.out.println("0. ����� ");
        }else if (  budged < boxes.get(0).getPrice()&& budged >= boxes.get(1).getPrice() ) {
            System.out.println("��� ������: "+ budged);
            System.out.println("�������� ��������: ");
            System.out.println("1. �������� ��� ������ ");
            System.out.println("2. ������ " + boxes.get(2).getName()+" �����: " + boxes.get(2).getPrice() );
            System.out.println("3. ������ " + boxes.get(1).getName()+" �����: " + boxes.get(1).getPrice() );
            System.out.println("0. ����� ");
        } else  {
            System.out.println("��� ������: "+ budged);
            System.out.println("�������� ��������: ");
            System.out.println("1. �������� ��� ������ ");
            System.out.println("2. ������ " + boxes.get(2).getName()+" �����: " + boxes.get(2).getPrice() );
            System.out.println("3. ������ " + boxes.get(1).getName()+" �����: " + boxes.get(1).getPrice() );
            System.out.println("4. ������ " + boxes.get(0).getName()+" �����: " + boxes.get(0).getPrice() );
            System.out.println("0. ����� ");
        }
        Integer choose = new Scanner(System.in).nextInt();
        switch (choose){
            case 1:
                moneyIncrease();
                return;
            case 2:
                if(budged >= boxes.get(2).getPrice()){
                    System.out.println("�� ������ ���� ");
                    budged= budged-boxes.get(2).getPrice();
                } else {System.out.println("������������ ������� ... ");
                }

                return;
            case 3:
                if(budged >= boxes.get(1).getPrice()){
                    System.out.println("�� ������ ������� ");
                    budged= budged-boxes.get(1).getPrice();
                } else {System.out.println("������������ ������� ... ");
                }
                return;
            case 4:
                if(budged >= boxes.get(0).getPrice()){
                    System.out.println("�� ������ ����������� ");
                    budged= budged-boxes.get(0).getPrice();
                } else {System.out.println("������������ ������� ... ");
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