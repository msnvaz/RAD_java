import java.util.Scanner;

public class colorcode {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the color code (R, G, B, Y, O) : ");
        char input = scn.next().charAt(0);

        switch(input) {
            case 'R':
              System.out.println("Red");
              break;
              case 'G':
              System.out.println("Green");
              break;
              case 'B':
              System.out.println("Blue");
              break;
              case 'Y':
              System.out.println("Yellow");
              break;
              case 'O':
              System.out.println("Orange");
              break;
            default:
              System.out.println("Invalid Character");
          }

    }
    
}
