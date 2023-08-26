import java.util.Scanner;
public class BodyIndex {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Please enter your height as meters: ");
        float h = take.nextFloat();
        System.out.println("Please enter your weight as KG: ");
        float w = take.nextFloat();
        float f = w /(h*h);
        System.out.println("Your index: " + f);
    }
}
