// CoffeeDrink object class

class CoffeeDrink {

   private int numberOfCups;
    private String flavor;
    private boolean hasWhippedCream;



    // Constructor for CoffeeDrink class
    public CoffeeDrink(int pNumberOfCups, String pFlavor, boolean pHasWhippedCream) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        numberOfCups=pNumberOfCups;
        flavor=pFlavor;
        hasWhippedCream=pHasWhippedCream;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        // Include information stored in each variable.
        System.out.println("Number of Cups: " + numberOfCups);
        System.out.println("Flavor: " + flavor);
        System.out.println("Has Whipped Cream = " + hasWhippedCream);

    }

    public void setFlavor(String flavor){
            this.flavor = flavor;
        }

    public String getFlavor(){
        return flavor;
    }

    public void setNumberOfCups(int numberOfCups){
        this.numberOfCups = numberOfCups;
    }

    public int getNumberOfCups(){
        return numberOfCups;
    }

    public void setHasWhippedCream(boolean hasWhippedCream){
        this.hasWhippedCream=hasWhippedCream;
    }

    public boolean getHasWhippedCream(){
        return hasWhippedCream;
    }
}
