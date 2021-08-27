package com.Geekbrains;

import java.util.Random;

public class Dog extends Animals {

    private String name;

    private static int DogsQuantity = 0;

    public static int getDogsQuantity() {
        return DogsQuantity;
    }

    public static void setDogsQuantity(int dogsQuantity) {
        DogsQuantity = dogsQuantity;
    }

    private int DogSwimmingDistance = 10;
    private int dogRunningDistance = 500;

    public Dog()
    {
        DogsQuantity++;
    }

    public Dog(String name)
    {
        DogsQuantity++;
        this.name = name;
    }

    public Dog(String name, boolean setRandom)
    {
        DogsQuantity++;
        this.name = name;
        if (setRandom)
        {
            this.DogSwimmingDistance = new Random().nextInt(20);

            this.dogRunningDistance = new Random().nextInt(1500);

        }
    }

    public Dog(String name, int DogSwimmingDistance, int dogRunningDistance, double dogJumpingDistance)
    {
        DogsQuantity++;
        this.name = name;
        this.DogSwimmingDistance = DogSwimmingDistance;
        this.dogRunningDistance = dogRunningDistance;
    }


    public void run(int distance)
    {
        boolean result;
        if (name != null)
        {
            if (distance <= dogRunningDistance)
            {
                result = true;
                System.out.println(name + " пробежал "+ distance + " м" );
                System.out.println("результат: swim: " + result );
            }
            else
            {
                result = false;
                System.out.println("Собака столько не пробежит ");
                System.out.println("результат: swim: " + result );
            }
        }
        else
        {
            if (distance <= dogRunningDistance)
            {
                result = true;
                System.out.println("Собака пробежала " + distance + " м");
                System.out.println("результат: swim: " + result );
            }
            else
            {
                result = false;
                System.out.println("Собака столько не пробежит ");
                System.out.println("результат: swim: " + result );
            }
        }

    }


    public void run()
    {
        if (name != null)
        {
            System.out.println(name + " бежит ");
        }
        else
        {
            System.out.println("Собака бежит ");
        }

    }


    public void swim(int distance)
    {
        boolean result;
        if (name != null)
        {
            if (distance <= DogSwimmingDistance)
            {
                result = true;
                System.out.println(name + " проплыл " + distance + " м");
                System.out.println("результат: swim: " + result );
            }
            else
            {
                result = false;
                System.out.println("Собака столько не проплывёт ");
                System.out.println("результат: swim: " + result );
            }
        }
        else
        {

            if (distance <= DogSwimmingDistance)
            {
                result = true;
                System.out.println("собака проплыла " + distance + " м");
                System.out.println("результат: swim: " + result );
            }
            else
            {
                result = false;
                System.out.println("Собака столько не проплывёт ");
                System.out.println("результат: swim: " + result );
            }
        }
    }

    public void swim()
    {
        if (name != null)
        {
            System.out.println(name + " плывёт ");
        }
        else
        {
            System.out.println("Собака плывёт ");
        }
    }






    public void printDogsQuantity()
    {
        System.out.println("Количество собак: " + DogsQuantity);
    }
}
