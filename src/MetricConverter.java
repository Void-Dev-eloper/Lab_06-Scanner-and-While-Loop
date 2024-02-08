import java.util.Scanner;
public class MetricConverter {
    public static void main (String[] args){
        /*
        Write a program that prompts the user for a measurement in meters and then converts it to miles, feet, and inches.
        Again, check for valid input and exit with an error msg if you don’t get it. You can look up the conversion formulas with the Web
         */
        Scanner in = new Scanner(System.in);

        double miles, feet, inches, meters;

        do {
            System.out.println("Please enter your metrics in meters: ");
            while(!in.hasNextDouble()){
                System.out.println("Invalid Input, Please Try Again.");
                in.next();
            }
            meters = in.nextDouble();
        }while(meters <= 0);

        feet = meters * 3.2808;
        inches = feet*12;
        miles = feet/5280;

        System.out.printf("Meters in Ft: %.2f", feet);
        System.out.println(" ");
        System.out.printf("Meters in Inches: %.2f", inches);
        System.out.println(" ");
        System.out.println("Meters in Miles: " + miles);

    }
}
