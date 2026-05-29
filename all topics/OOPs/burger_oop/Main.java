package burger_oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Item> menu=new ArrayList<>();

        String food;

        while (true){
            System.out.println("WELCOME TO BURGER");
            System.out.println("  1. Manager\n  2. Customer");
            int ch=in.nextInt();
            in.nextLine();
            switch (ch){
                case 1:
                    while(true) {
                        System.out.println("enter the - type - - name -  and - price -");
                        food = in.nextLine();
                        if (food.equals("exit")) break;

                        String[] foods = Arrays.stream(food.split(","))
                                .map(String::trim)
                                .toArray(String[]::new);

                        menu.add(new Item(foods[0], foods[1], Double.parseDouble(foods[2])));
                    }
                    break;
                case 2:

                    System.out.println("MENU --");

                    for(Item x:menu){
                        x.printItem();
                    }
                    break;
            }
        }



      /*  Item coke = new Item("drink", "coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avocado = new Item("Topping", "avocado", 1.50);
        avocado.printItem();

        Burger burger = new Burger("regular", 4.00);
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.printItem();

        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemizedList();

        MealOrder secondMeal = new MealOrder("turkey", "7-up",
                "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();*/

        /*MealOrder deluxeMeal = new MealOrder("deluxe", "7-up",
                "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE",
                "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();*/
    }

}