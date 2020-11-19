public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double a = 25;
        double b = 15;
        double c = 5;

        int surfArea = (int) (2 * (a * b + b * c + c * a));
        int volume = (int) (a * b * c);

        System.out.println("Surface Area: " + surfArea);
        System.out.println("Surface Area: " + volume);

    }
}