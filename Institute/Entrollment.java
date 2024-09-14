package Institute;

public class Entrollment {
    private String id;
    private String studentId;
    private String courseId;
    
    Entrollment (String studentId,String courseId){
        this.courseId=courseId;
        this.studentId=studentId;
    }
    public String getStudentId(){
        return this.studentId;
    }
    public String getCourseId(){
        return this.courseId;
    }
    public void setStudentId(String studentId){
        this.studentId=studentId;
    }

}
