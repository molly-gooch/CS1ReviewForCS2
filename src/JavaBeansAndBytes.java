import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 2000;
        System.out.println("We were founded in " + yearFounded + ".");


        // TODO
        // Create two CoffeeDrink objects
        CoffeeDrink doubleMocha = new CoffeeDrink(2, "Mocha", true);
        CoffeeDrink caramel = new CoffeeDrink(1, "Caramel", true);


        // TODO
        // Print out the order details
        System.out.println();
        System.out.println("popular orders: ");
        doubleMocha.printInfo();
        caramel.printInfo();
        System.out.println();

        caramel.setFlavor("Pumpkin Spice");
        caramel.setNumberOfCups(2);
        caramel.setHasWhippedCream(false);
        System.out.println("Changed order: ");
        System.out.println("Caramel has now been changed to: "+caramel.getFlavor() + "! The new number of cups is: "+caramel.getNumberOfCups() + "! It is now " + caramel.getHasWhippedCream() + " that this order has whipped cream");

        // Calling methods
        System.out.println();
        randomDiscount();
        System.out.println();

        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("Caramel");
        System.out.println();
        countCups();
        System.out.println();
        baristasChoice();
        System.out.println();


    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
        int randomInt;
        randomInt = (int)(Math.random()*31);
        System.out.println("Random Discount = " + randomInt +"% off");

    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("Special of the day: " + special);
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5
        for(int x=1; x<=5;x=x+1){
            System.out.println(x);
        }
        System.out.println();
        // Print 2, 5, 8, 11
        for(int x=2; x<12;x=x+3){
            System.out.print(x + ", ");
        }
        System.out.println();
        System.out.println();
        // Print 8 to 0
        for(int x=8; x>=0; x=x-1){
            System.out.println(x);
        }
    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        System.out.println("Barista's Choice: ");
        CoffeeDrink doubleMocha = new CoffeeDrink(2, "Mocha", true);
        CoffeeDrink caramel = new CoffeeDrink(1, "Caramel", true);
        CoffeeDrink pumpkinSpice = new CoffeeDrink(1, "Pumpkin Spice", true);
        CoffeeDrink vanilla = new CoffeeDrink(1, "Vanilla", false);
        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.

        double choiceCoffee;
        choiceCoffee = (Math.random());
        if(choiceCoffee<0.25){
            doubleMocha.printInfo();
        }
        if(choiceCoffee<0.5 && choiceCoffee>0.25){
            caramel.printInfo();
        }
        if(choiceCoffee<0.75 && choiceCoffee>0.5){
            pumpkinSpice.printInfo();
        }
        if(choiceCoffee<0.99 && choiceCoffee>0.75){
            vanilla.printInfo();
        }



    }
}

