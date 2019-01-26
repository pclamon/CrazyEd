package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Cheese diameter: ");
        int diam = userInput.nextInt();

        switch (diam)
        {
            case (1):
                diam = 1;
                break;
            case (2):
                diam = 2;
                break;
            case (3):
                diam = 3;
                break;
            default:
                System.out.println("That order is TOO crazy.");
        }

        System.out.println("Length: ");
        int length = userInput.nextInt();

        if (length < 1)
        {
            System.out.println("That order is not crazy enough.");
        }
    }

    public static int calculateOrder(int length, int diam)
    {
        int price = 0;
        int shipping = 0;
        int order;
        int handlingCharge = 5;
        boolean freeShipping = false;

        switch (diam)
        {
            case (1):
                price = 2;
                break;
            case (2):
                price = 4;
                break;
            case (3):
                price = 6;
                break;
        }

        switch (diam)
        {
            case (1):
            case (2):
                shipping = 2;
                break;
            case (3):
                shipping = 4;
                break;
        }
        order = handlingCharge + shipping * length + price * length;

        return order;
    }

}
