package com.example.chapter1;

public class DuckSimulator {

    // FlyBehavior interface
    interface FlyBehavior {
        void fly();
    }

    // QuackBehavior interface
    interface QuackBehavior {
        void quack();
    }

    // Quack class implementing QuackBehavior
    static class Quack implements QuackBehavior {
        public void quack() {
            System.out.println("QUACK");
        }
    }

    // MuteQuack class implementing QuackBehavior
    static class MuteQuack implements QuackBehavior {
        public void quack() {
            System.out.println("SILENCE");
        }
    }

    // FlyWithWings class implementing FlyBehavior
    static class FlyWithWings implements FlyBehavior {
        public void fly() {
            System.out.println("I'm flying");
        }
    }

    // FlyNoWay class implementing FlyBehavior
    static class FlyNoWay implements FlyBehavior {
        public void fly() {
            System.out.println("I can't fly");
        }
    }

    // Abstract Duck class
    static abstract class Duck {
        FlyBehavior flyBehavior;
        QuackBehavior quackBehavior;

        public Duck() {
        }

        public abstract void display();

        public void performFly() {
            flyBehavior.fly();
        }

        public void performQuack() {
            quackBehavior.quack();
        }

        public void swim() {
            System.out.println("All ducks float, even decoys!");
        }
    }

    // MallardDuck class extending Duck
    static class MallardDuck extends Duck {

        public MallardDuck() {
            quackBehavior = new Quack();
            flyBehavior = new FlyWithWings();
        }

        @Override
        public void display() {
            System.out.println("I'm a real Mallard duck");
        }
    }

    // WoodDuck class extending Duck
    static class WoodDuck extends Duck {

        public WoodDuck() {
            quackBehavior = new MuteQuack();
            flyBehavior = new FlyNoWay();
        }

        @Override
        public void display() {
            System.out.println("I am a wooden duck");
        }
    }
}
