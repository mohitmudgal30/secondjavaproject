package inheritance;

class Single {
    private int roll;
    private String name;
    public void setstudent(int a,String b){
        roll=a;
        name=b;
    }
    public  void  getstudent(){
        System.out.println("the roll no. is : "+ roll);
        System.out.println("the name is :"+ name);
    }
}
public class Mul extends Single{
    private int id;
    private  String contactname;
    public  void setcontact(int c,String d){
        id=c;
        contactname=d;
    }
    public void getcontact(){
        System.out.println("the id is :"+ id);
        System.out.println("the contactname is : "+ contactname);

    }
    public static void main(String[] args) {
        Mul s1=new Mul();
        s1.setstudent(13,"bhuvnesh");
        s1.getstudent();

        s1.setcontact(123,"qwertghjn");
        s1.getcontact();
    }
}

//comment mohit is

