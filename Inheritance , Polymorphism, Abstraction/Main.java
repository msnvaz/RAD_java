//if the packages are not in the same package 
//you have to import them like Inheritance.Student
//foldername.javafile


public class Main {
    public static void main(String[] args) {

        //person Sandeep= new person("Sandeep","Mora","45645");
        //Sandeep.introduce();
        //cannot create because person class is abstract

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

        //PartTimeTeacher Tea1 = new PartTimeTeacher();
        //final keyword is used in teacher class
        //so parttime teacher cannot be used to create new objects

        //if we use final keyword in a variable
        //its value cannot be used later
        //so similar to constant
    }
}
