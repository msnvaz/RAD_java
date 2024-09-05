public class Member {
    
    private String MemberId;
    private String MemberName;

    public String getMemberName(){
        return this.MemberName;
    }

    public String getMemberId(){
        return this.MemberId;
    }

    public void display(){
        System.out.println("Member ID: " + this.MemberId);
        System.out.println("Member Name: " + this.MemberName);
    }

    //constructor
    public Member(String MemberIdIn, String MemberNameIn){
        this.MemberId = MemberIdIn;
        this.MemberName = MemberNameIn;
    }   
}
