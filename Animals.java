package com.Geekbrains;

public class Animals {

    private static int AnimalsQuantity = 0;

    public Animals()
    {
        AnimalsQuantity++;
    }

    public static void setAnimalsQuantity(int animalsQuantity) {
        AnimalsQuantity = animalsQuantity;
    }

    public static int getAnimalsQuantity() {
        return AnimalsQuantity;
    }

    public void swim()
    {
        System.out.println("Животное плывёт");
    }


    public void swim(int distance)
    {
        System.out.println("Животное плывёт " + distance + " м");
    }


    public void run()
    {
        System.out.println("Животное бежит ");
    }

    public void run(int distance)
    {
        System.out.println("Животное бежит " + distance +" м" );
    }

    public void printAnimalsQuantity()
    {
        System.out.println("Количество животных: " + AnimalsQuantity);
    }

}
