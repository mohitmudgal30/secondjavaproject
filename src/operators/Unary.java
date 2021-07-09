package operators;

public class Unary {
    public static void main(String[] args) {
        int a=2,b=10,c=15,d=20,e=25;
        System.out.println("a++= "+a++);//value will be updated before the execution of next statement
        System.out.println("a="+a);

        System.out.println("++b="+ ++b);//value will update instantly by 1
        System.out.println("b="+b);

        System.out.println("c--="+c--);//value will be update before the execution of next statement
        System.out.println("c="+c);

        System.out.println("--d="+--d);//value will update instantly by 1
        System.out.println("d="+d);

        System.out.println("+e="+ +e);
        System.out.println("-e="+ -e);//represent -ve




    }
}
