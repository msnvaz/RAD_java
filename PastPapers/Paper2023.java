public class Paper2023{

    double d1 =5f;
    double d2 = 5.0;
    float f1 = 5f;
    float f2 = 5.0f;

    public static void main(String[] args){
        System.out.println("Hello, World!");

        String bus ="petrol ";
        String car ="diesel";
        car = car+bus;
        System.out.println(car);
       

/*Multiple Variable Declarations: 
    In Java, you cannot declare multiple variables of the same type in a single line using a comma. 
    Each variable must be declared separately.

Missing Initialization: 
    The variable car is not initialized with a value before it's used in the concatenation. 
    This would result in a NullPointerException if the code were to compile.*/

    
    }
    
}