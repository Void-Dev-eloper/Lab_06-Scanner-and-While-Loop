import java.util.Scanner;

public class FuelCost{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallonsOfGas, fuelEfficiency, pricePerGallon, costPer100Miles, distance;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            gallonsOfGas = in.nextDouble();
        } while (gallonsOfGas <= 0);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            fuelEfficiency = in.nextDouble();
        } while (fuelEfficiency <= 0);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            pricePerGallon = in.nextDouble();
        } while (pricePerGallon <= 0);

        costPer100Miles = 100 / fuelEfficiency * pricePerGallon;
        distance = gallonsOfGas * fuelEfficiency;

        System.out.println("The cost per 100 miles is: $" + costPer100Miles);
        System.out.println("The car can go approximately " + distance + " miles with the gas in the tank.");

        in.close();
    }
}