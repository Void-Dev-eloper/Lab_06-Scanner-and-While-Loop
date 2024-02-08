import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1;
        int userGuess;

        do {
            System.out.println("Guess the number in the range of 1-10: ");
            while (!in.hasNextInt()){
                System.out.println("You have guess the Number that is not in range!");
                in.next();
            }
            userGuess = in.nextInt();
            if (userGuess < randomNumber){
                System.out.println("Too Low! Please Try Again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too High! Please Try Again.");
            }else{
                System.out.println("You got it right! The number was: " + randomNumber);
            }
        }while(userGuess != randomNumber);
    }
}
