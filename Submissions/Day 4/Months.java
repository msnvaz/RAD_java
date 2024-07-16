import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the month number (1-12) : ");
        int input = scn.nextInt();

        String season;

        switch (input) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn (Fall)";
                break;
            default:
                season = "Invalid month";
          }
          System.out.println(season);
    }
    
}
