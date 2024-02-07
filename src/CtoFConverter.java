import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
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