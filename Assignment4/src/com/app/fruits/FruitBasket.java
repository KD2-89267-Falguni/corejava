package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basket size: ");
        Fruit[] basket = new Fruit[sc.nextInt()];
        int count = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Show Fruit Names");
            System.out.println("5. Show Fresh Fruits");
            System.out.println("6. Show Tastes of Stale Fruits");
            System.out.println("7. Mark Fruit as Stale (by index)");
            System.out.println("8. Mark All Sour Fruits as Stale");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 0) break;
            System.out.println("Enter the nameof fruit :");
   		 String name=sc.next();
   		 System.out.println("Enter the color : ");
   		 String color=sc.next();
   		 System.out.println("Enter the weight");
   		 double weight=sc.nextDouble();
   		 System.out.print("Is it fresh? (true/false): ");
            boolean isFresh = sc.nextBoolean();

            switch (choice) {
                case 1: case 2: case 3:
                    if (count >= basket.length) {
                        System.out.println("Basket is full!");
                        continue;
                    }
                    System.out.print("Enter name, color, weight: ");
                    String name = sc.next(), color = sc.next();
                    double weight = sc.nextDouble();

                    if (choice == 1) basket[count++] = new Mango(color,weight,name,isFresh);
                    if (choice == 2) basket[count++] = new Orange(color,weight,name,isFresh);
                    if (choice == 3) basket[count++] = new Apple(color,weight,name,isFresh);
                    break;

                case 4:
                    for (Fruit f : basket)
                        if (f != null) System.out.print(((Mango) f).getName() + " ");
                    System.out.println();
                    break;

                case 5:
                    for (Fruit f : basket)
                        if (f != null && ((Mango) f).isFresh()) System.out.println(f + " | Taste: " + (f).getTaste());
                    break;

                case 6:
                    for (Fruit f : basket)
                        if (f != null && !f.isFresh()) System.out.println("Stale Fruit: " + f.getName() + " | Taste: " + f.getTaste());
                    break;

                case 7:
                    System.out.print("Enter fruit index to mark as stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < count && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println("Marked as stale!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 8:
                    for (Fruit f : basket)
                        if (f != null && f.getTaste().equals("Sour")) f.setFresh(false);
                    System.out.println("All sour fruits marked as stale!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}
