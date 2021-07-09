package operators;

public class Unary1 {
    public static void main(String[] args) {
        int a=3,b=4,c;
        System.out.println("above a++="+ a);
        c=a++*--b;//3*3=9
        System.out.println("a="+a);//a=4
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}
