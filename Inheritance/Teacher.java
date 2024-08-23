public class Teacher extends person{
    public String teacherId;

    public Teacher(String nameIn,String addressIn,String PNIn,String TeacherIdIn){
        super(nameIn, addressIn, PNIn);
        this.teacherId=TeacherIdIn;
    }
}
