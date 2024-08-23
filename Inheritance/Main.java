//if the packages are not in the same package 
//you have to import them like Inheritance.Student
//foldername.javafile


public class Main {
    public static void main(String[] args) {
        Teacher sam = new Teacher("Sama","CMB","0987","tea/01");
        //sam.setName("Samantha Mathara");
        sam.introduce();

        student john = new student("John","Mora","876554","stu/01");
        //john.setName("John Cena");
        john.introduce();
        System.out.println(john.getAddress());
        //u can change the value of a contructed object by a setter
        john.setAddress("Colombo");
        System.out.println(john.getAddress());
    }
}
