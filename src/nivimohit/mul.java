package nivimohit;
import java.util.Scanner;


class Single{
    private int id;
    private String name;
    private int age;
    public void set(int k,String g,int p) {
        id=k;
        name=g;
        age=p;
    }
    public void get() {
        System.out.println("the id is : "+id);
        System.out.println("the name is : "+name);
        System.out.println("the age is : "+age);
    }
}
public class mul extends  Single{
    private String course;
    private String branch;
    public void set1(String s,String l) {
        course=s;
        branch=l;
    }
    public void get1() {
        System.out.println("the course taken by the student is : "+course);
        System.out.println("the branch taken by the student is : "+branch);


    }

    public static void main(String[] args) {
        mul m1=new mul();
        Scanner Sc=new Scanner(System.in);

        System.out.print("Enter the value of id: ");
        int a=Sc.nextInt();

        System.out.print("the name is:");
        String f=Sc.next();
        System.out.print("Enter the value of age: ");
        int c=Sc.nextInt();
        System.out.print("Enter the course: ");
        String z=Sc.next();
        System.out.print("Enter the branch: ");
        String x=Sc.next();



        m1.set(a,f,c);
        m1.get();
        m1.set1(z,x);
        m1.get1();
    }
}