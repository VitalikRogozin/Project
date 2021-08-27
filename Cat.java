package com.Geekbrains;

import java.util.Random;

public class Cat extends Animals {

    private static int CatsQuantity = 0;

    public static int getCatsQuantity() {
        return CatsQuantity;
    }

    public static void setCatsQuantity(int catsQuantity) {
        CatsQuantity = catsQuantity;
    }

    // коты не могут плавать, значит проплывут 0 => const
    private final int CatSwimmingDistance = 0;
    private int CatRunningDistance = 10;


    private String name;

    public Cat()
    {
        CatsQuantity++;
    }

    public Cat(String name)
    {
        CatsQuantity++;
        this.name = name;
    }

    public Cat(String name, boolean setRandom)
    {
        CatsQuantity++;
        this.name = name;
        if (setRandom)
        {
            this.CatRunningDistance = new Random().nextInt(50);

        }
    }

    public Cat(String name, int CatRunningDistance, double CatJumpingDistance)
    {
        CatsQuantity++;
        this.name = name;
        this.CatRunningDistance = CatRunningDistance;

    }



    public void run(int distance)
    {
        boolean result;
        if (name != null)
        {
            if (distance <= CatRunningDistance)
            {
                result = true;
                System.out.println(name + " пробежал "+ distance + " м" );
                System.out.println("результат: run: " + result);

            }
            else
            {
                result = false;
                System.out.println("Кот " + name + " столько не пробежит ");
                System.out.println("результат: run: " + result);
            }
        }
        else
        {

            if (distance <= CatRunningDistance)
            {
                result = true;
                System.out.println("Кот пробежал "+ distance + " м" );
                System.out.println("результат: run: " + result);

            }
            else
            {
                result = false;
                System.out.println("Кот столько не пробежит ");
                System.out.println("результат: run: " + result);
            }
        }
    }

    public void run()
    {

        if (name != null)
        {
            System.out.println(name + " бежит");
        }
        else
        {
            System.out.println("Кот бежит ");
        }
    }

    public void swim(int distance)
    {
        boolean result;
        if (name != null)
        {
            result = false;
            System.out.println("Кот " + name + " не умеет плавать ");
            System.out.println("результат: swim: " + result);
        }
        else
        {
            result = false;
            System.out.println("Кот не умеет плавать ");
            System.out.println("результат: swim: " + result);
        }
    }

    public void swim()
    {
        boolean result;
        if (name != null)
        {
            result = false;
            System.out.println(name + " не умеет плавать ");
            System.out.println("результат: swim: " + result);
        }
        else
        {
            result = false;
            System.out.println("Кот не умеет плавать ");
            System.out.println("результат: swim: " + result);
        }
    }



    public void printCatsQuantity()
    {
        System.out.println("Количество Кошек: " + CatsQuantity);
    }

}
