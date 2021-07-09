package nivimohit;
class Multi{
    private int id;
    private int roll_no;
    public void setid(int i){
        id=i;
    }
    public void setroll(int n){
        roll_no=n;
    }
    public int getid(){
        return(id);
    }
    public int getroll(){
        return(roll_no);
    }
}


class Raj extends Multi{
    private String name;
    private String course;
    public void setname(String s){
        name=s;
    }
    public void setcourse(String c){
        course=c;
    }
    public String getname(){
        return(name);
    }
    public String getcourse(){
        return(course);
    }
}
class Exe extends Raj{
    private int age;
    private int mobile_no;
    public void setage(int p){
        age=p;
    }
    public void setmobile(int m){
        mobile_no=m;
    }
    public int getage(){
        return(age);
    }
    public int getmobile(){
        return(mobile_no);
    }
}
public class MI{
    public static void main(String[] agrs){
        Exe e1 = new Exe();
        e1.setid(12);
        e1.setroll(56);
        e1.setname("Nivesh");
        e1.setcourse("CS");
        e1.setage(20);
        e1.setmobile(89565484);

        System.out.println("id :"+ e1.getid());
        System.out.println("roll_no :"+ e1.getroll());
        System.out.println("name :"+ e1.getname());
        System.out.println("course :"+ e1.getcourse());
        System.out.println("age :"+ e1.getage());
        System.out.println("mobile :"+ e1.getmobile());

    }
}