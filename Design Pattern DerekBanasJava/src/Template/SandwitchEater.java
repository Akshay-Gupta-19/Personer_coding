/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Template;

/**
 *
 * @author Akshay Gupta
 */

//Have an abstract class with calling many methods but their excution depends on child classes decesion
public class SandwitchEater {
    public static void main(String[] args) {
        SandwithcMaker maker=new ItalianHoagie();
        maker.makeSandwich();
    }
}

abstract class SandwithcMaker {

    final void makeSandwich() {

        cutBun();

        if (customerWantsMeat()) {

            addMeat();

        }

        if (customerWantsCheese()) {

            addCheese();

        }

        if (customerWantsVegetables()) {
            addVegetables();

        }

        if (customerWantsCondiments()) {

            addCondiments();

        }

        wrapTheHoagie();

    }

    abstract void addMeat();

    abstract void addCheese();

    abstract void addVegetables();

    abstract void addCondiments();

    public void cutBun() {

        System.out.println("The Hoagie is Cut");

    }

    // These are called hooks
    // If the user wants to override these they can
    // Use abstract methods when you want to force the user
    // to override and use a hook when you want it to be optional
    boolean customerWantsMeat() {
        return true;
    }

    boolean customerWantsCheese() {
        return true;
    }

    boolean customerWantsVegetables() {
        return true;
    }

    boolean customerWantsCondiments() {
        return true;
    }

    public void wrapTheHoagie() {

        System.out.println("\nWrap the Hoagie");

    }

    public void afterFirstCondiment() {

        System.out.println("\n");

    }

}

class ItalianHoagie extends SandwithcMaker {

    String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
    String[] cheeseUsed = {"Provolone"};
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};
    
    @Override
    boolean customerWantsCheese() {
        return false;
    }

    public void addMeat() {

        System.out.print("Adding the Meat: ");

        for (String meat : meatUsed) {

            System.out.print(meat + " ");

        }

    }

    public void addCheese() {

        System.out.print("Adding the Cheese: ");

        for (String cheese : cheeseUsed) {

            System.out.print(cheese + " ");

        }

    }

    public void addVegetables() {

        System.out.print("Adding the Vegetables: ");

        for (String vegetable : veggiesUsed) {

            System.out.print(vegetable + " ");

        }

    }

    public void addCondiments() {

        System.out.print("Adding the Condiments: ");

        for (String condiment : condimentsUsed) {

            System.out.print(condiment + " ");

        }

    }

}
