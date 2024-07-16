import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);

        System.out.print("Enter a String : ");
        String sentence = scn.nextLine();

        String[] strArray= sentence.split("");

        String[] checkedArray = null;

        strArray[0]=checkedArray[0];

        for(int i=0;i<strArray.length;i++){
            for(int j=i;i<strArray.length;j++){
                if(strArray[i+1]==strArray[j]){
                }else{
                    strArray[i+1]=checkedArray[i+1];
                }
            }
        }
    scn.close();

        for (int k = 0; k< checkedArray.length; k++){  
        System.out.println(checkedArray[k]); 
    }
}
}