package com.Geekbrains;


public class Main {



    public static void main(String[] args) {

        // Задание 1
        System.out.println("\n" + "Задание 1:" + "\n");
        Animals animal = new Animals();
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        animal.run();
        animal.swim();


        dog1.run();
        dog1.swim();


        cat1.run();
        cat1.swim();



        // Задание 2-4
        System.out.println("\n" + "Задание 2 и Задание 3 :" + "\n");
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.run();
        dog.swim();
        cat.run();
        cat.swim();
        dog.run(200);
        dog.swim(23);
        cat.run(900);
        cat.swim(2);

        Dog Bobik = new Dog("Бобик");
        Cat catVasia = new Cat("Вася");

        Bobik.swim(5);
        Bobik.swim();
        Bobik.run(5);
        Bobik.run();




        catVasia.swim(4);
        catVasia.swim();
        catVasia.run(5);
        catVasia.run();



        // 4: добавить подсчёт созданным животным
        System.out.println("\n" + "Задание 4 :" + "\n");
        animal.printAnimalsQuantity();
        dog.printDogsQuantity();
        cat.printCatsQuantity();


    }
}