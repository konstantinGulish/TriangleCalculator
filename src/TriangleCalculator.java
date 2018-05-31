import  java.util.Scanner;
public class TriangleCalculator {
    public static void main (String [] args) {
        double side1,
                side2,
                side3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        side1=scan.nextDouble();
        System.out.println("Enter side 2: ");
        side2=scan.nextDouble();
        System.out.println("Enter side 3: ");
        side3=scan.nextDouble();

        if (side1==side2 && side1==side3){
            System.out.println("The triangle is equilateral");
        }
        else if ((side1*side1)+(side2*side2)==(side3*side3)){
            System.out.println("The triangle is a right triangle");
        }
    }
}
