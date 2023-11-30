package com.example.chapter1;

import com.example.chapter1.DuckSimulator.Duck;

public class MainApplication {

    public static void main(String[] args) {
        Duck mallardDuck = new DuckSimulator.MallardDuck();
        Duck woodDuck = new DuckSimulator.WoodDuck();

        System.out.println("Mallard Duck:");
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.swim();

        System.out.println("\nWood Duck:");
        woodDuck.display();
        woodDuck.performQuack();
        woodDuck.performFly();
        woodDuck.swim();
    }
}

