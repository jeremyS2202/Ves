package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        double weight, height, bodyIndex;
        final double METR = 100;

        Scanner input = new Scanner(System.in);

        System.out.println("Эта программа расчитывает индекс массы тела");


        try {
            System.out.println("Введите вес тела");
            weight = input.nextDouble();
            System.out.println("Введите рост тела");
            height = input.nextDouble();
            height = height / METR;
            bodyIndex = weight / (height * height);
            if (bodyIndex < 16.4) {
                System.out.println(" Крайний недостаток веса "+bodyIndex);
            }
            if (bodyIndex <= 16.5 && bodyIndex <= 18.4) {
                System.out.println("Недостаток в весе "+bodyIndex);
            }

            if (bodyIndex >= 18.5 && bodyIndex <= 24.9) {
                System.out.println("Нормальный вес "+bodyIndex);
            }

            if (bodyIndex >= 25 && bodyIndex <= 30) {
                System.out.println("Ожирение "+bodyIndex);
            }

            if  (bodyIndex >= 30.1 && bodyIndex <= 34.9) {
                System.out.println("Ожирение Класс 1 "+bodyIndex);


            if  (bodyIndex >= 35 && bodyIndex <= 40) {
                System.out.println("Ожирение Класс 2 - тяжелое "+bodyIndex);
            }

            if  (bodyIndex>40) {
                System.out.println("Ожирение Класс 3 - крайне тяжелое "+bodyIndex);
            }



            }


        } catch (Exception e) {
            System.out.println("Пошли вы нафиг");

        }

    }
}
