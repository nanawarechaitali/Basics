import java.util.Scanner;

public class CheckSmallestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        double x = sc.nextDouble();
        System.out.println("Input second number: ");
        double y = sc.nextDouble();
        System.out.println("Input third number: ");
        double z = sc.nextDouble();
        System.out.println("The smallest value is "+ smallest(x,y,z)+"\n");


    }
    public static double smallest(double x ,double y , double z){
        return Math.min(Math.min(x ,y) ,z);
    }
}
