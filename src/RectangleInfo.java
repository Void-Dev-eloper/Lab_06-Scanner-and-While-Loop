import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args){
        /*
        Write a program that asks the user for the lengths of the sides of a rectangle.
        Again, loop the input until it is valid.
        (Note only two measure here, the Width and the Height…)
        Testing: use some simple values to confirm that the calculations are correct.

        Then print
        •	The area and perimeter of the rectangle
        •	The length of the diagonal (use the Pythagorean theorem)
        Note: a 3 by 4 rectangle will have diagonal of 5
         */
        Scanner in = new Scanner(System.in);
        double width, height, area, perimeter, diagonal;
        do {
            System.out.println("Enter the Height of the Rectangle: ");
            while(!in.hasNextDouble()){
                System.out.println("Invalid Input, Please Try again");
                in.next();
            }
            height = in.nextDouble();
        }while (height <= 0);

        do {
            System.out.println("Enter the Width of the Rectangle: ");
            while (!in.hasNextDouble()){
                System.out.println("Invalid Input, Please Try again");
                in.next();
            }
            width = in.nextDouble();
        }while(width <= 0);

        area = width * height;
        perimeter = 2*(width + height);
        diagonal = (width * width) + (height * height);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);
    }
}
