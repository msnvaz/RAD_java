import java.util.Scanner;

public class planet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the planet number (1-8) : ");
        int input = scn.nextInt();

        String planetName;

        switch (input) {
            case 1:
                planetName = "Mercury";
                break;
            case 2:
                planetName = "Venus";
                break;
            case 3:
                planetName = "Earth";
                break;
            case 4:
                planetName = "Mars";
                break;
            case 5:
                planetName = "Jupiter";
                break;
            case 6:
                planetName = "Saturn";
                break;
            case 7:
                planetName = "Uranus";
                break;
            case 8:
                planetName = "Neptune";
                break;
            default:
                planetName = "Invalid planet number";
        }
          System.out.println(planetName);
    }
    
}
