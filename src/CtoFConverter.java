import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        /*
        A program that converts an inputted temperature in C and provides the equivalent temperature in F.
        Hint: Google is your friend! Given C, solve for F.  Again, check for a valid input value
        and only respond with the F value if you got it, otherwise loop until you do.
        Testing: 3 conditions: Bad Input, then test for the known freezing and boiling points.

        F = C * (9/5) + 32

         */
        double fahrenheit;
        double celsius;
        boolean finished = false;
        Scanner in = new Scanner(System.in);

        do {

            System.out.println("Enter the Celsius: ");
            if (in.hasNextDouble()){
                celsius = in.nextDouble();
                in.nextLine();
                fahrenheit = ((celsius * ((double) 9 /5)) + 32);
                System.out.println(celsius + " Celsius to Fahrenheit is " + fahrenheit);
                finished = true;
            }else{
                String trash = in.nextLine();
                System.out.println("Enter a Valid Number: (not) " + "'" + trash + "'");
            }
        }while (!finished);




    }
}