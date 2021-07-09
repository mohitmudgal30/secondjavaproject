package midterm1;

public class Inheritance {
    private int id ;
    private String name;
    public void setid(int p,String l){
        id=p;
        name=l;
    }
    public void getid(){
        System.out.println(" the student id is : "+id);
        System.out.println(" the student name is : "+name);
    }
}
class Raju extends Inheritance{
    private int roll_no;
    private long mobile_no;
    private String branch;
    public void setroll(int d,long o,String k){
        roll_no=d;
        mobile_no=o;
        branch=k;
    }
    public void getroll(){
        System.out.println(" the student roll no is "+roll_no);
        System.out.println(" the student mobile no is "+mobile_no);
        System.out.println(" the student branch is : "+branch);

    }

    public static void main(String[] args){
        Raju r1=new Raju();
        r1.setid(1,"Nivesh");
        r1.getid();
        r1.setroll(25,8302, "CS");
        r1.getroll();



    }
}