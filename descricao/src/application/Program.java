package application;

import java.util.Scanner;

public class Program {
	
    private float coffeeQuantity;

    public Program(int coffeeQuantity) {
        this.coffeeQuantity = coffeeQuantity;
    }

    public float getCoffeeQuantity() {
        return coffeeQuantity;
    }

    public void setCoffeeQuantity(float coffeeQuantity) {
        this.coffeeQuantity = coffeeQuantity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many ml of coffee did you drink? ");
        int coffeeCup = sc.nextInt();
        

        Program coffee = new Program(coffeeCup);

        if (coffee.getCoffeeQuantity() >= 300f) {
            coffee.learn();
        } else {
            coffee.sleepyHead();
        }
        sc.close();
    }

    public void learn() {
        System.out.println("let's study!");
    }

    public void sleepyHead() {
        System.out.println("You need more coffee!");
        float requiredCoffee = 300f - coffeeQuantity;
        
        System.out.println("Add " + requiredCoffee + "ml of coffee to continue studying.");
    }
}
