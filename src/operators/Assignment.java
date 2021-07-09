package operators;

public class Assignment {
    public static void main(String[] args) {
        int a,b;
        a=12;//12 is assigned to a
        b=18;
        System.out.println(a);
        a=a+b;//Compile time error because 10+10=20 now int
        System.out.println(a);
    }
}
