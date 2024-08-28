public class Maths {
    public static double pie= 3.141414;

    public static double calculateArea(double r){
        double area = pie*(r*r);
        return area;
    }
    
    public static double power(double b,double e){
        double pow=b;
        for (int i = 1; i < e; i++) {
            pow = pow*b;
        }
        return pow;
    }

    
}
