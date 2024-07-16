import java.util.*;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1;
        while(scan.hasNext()){
            String NewLine = scan.nextLine();
            System.out.println(i+ " "+ NewLine);
            i++;
        }
    }
}