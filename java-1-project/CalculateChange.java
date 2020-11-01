import java.util.Scanner; //Import the scanner class

public class CalculateChange {
    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);
        
        float cost = 0;
        float cash = 0;
        float change = 0;

        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        System.out.println("Please input the cost of of the purchase: ");
        cost = getInput.nextFloat();

        System.out.println("Please input the amount of cash given: ");
        cash = getInput.nextFloat();

        if (cash > cost)
        {
            change = cash - cost;
            pennies = (int)(change * 100);
            dollars = pennies / 100;
            pennies -= dollars * 100;
            quarters = pennies / 25;
            pennies -= quarters * 25;
            dimes = pennies / 10;
            pennies -= dimes * 10;
            nickels = pennies / 5;
            pennies -= nickels * 5;

            System.out.println("Your change is: \n" 
                            + dollars + " Dollars\n"
                            + quarters + " Quarters\n"
                            + dimes + " Dimes\n"
                            + nickels + " Nickels, and\n"
                            + pennies + " Pennies\n");
        }
        else
        {
            System.out.println("The cash given cannot cover the cost\n"); 
        }

        
    }
}