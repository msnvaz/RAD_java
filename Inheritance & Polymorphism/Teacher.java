public class Teacher extends person{
    public String teacherId;

    public Teacher(String nameIn,String addressIn,String PNIn,String TeacherIdIn){
        super(nameIn, addressIn, PNIn);
        this.teacherId=TeacherIdIn;
    }

    //overrride a method in person class from the teacher class
    @Override
    public void introduce(){
        System.out.println("Hello my name is "+getName()+ " Im a teacher");
    }
}
