package operators;

public class Bitwise {
    public static void main(String[] args) {

        System.out.println("bitwise AND of 2&3=" + (2&3));
        int a=10;
        int b=5;
        int c=20;
        int d=4,e=7,f=9;

        System.out.println("relation (true or false) logic  =    "+(a<b&&a++<c));//relation operator results in true or false.
        System.out.println("first condition is false therefore a = "+a);//in above condition a<b condition is not true therefore the second condition is not chacked therefore value of a is 10
        System.out.println("relation (true or false) bitwise &   =   "+(a<b&a++<c));//relation operator results in true or false postfix a will increase in next statement
        System.out.println("first condition is true therefor a = "+ (a));//11 because inspite of first condition is false second condition is checked
        System.out.println("d&e="+(d&e));
        System.out.println("d|e=" + (d|e));
        System.out.println("d^e="+(d^e));
        System.out.println("~e ="+ ~e);
        System.out.println("~f ="+~f);
        System.out.println("left shift 10<<2 ="+(10<<2));//10*2^2
        System.out.println("left shift 15<<3 ="+(15<<3));//15*2^3
        System.out.println("right shift 10>>2 ="+(10>>2));
        //float l=2.0f,s=3.0;
        //System.out.println(l>>s);
        //we cannot use left<< right >> shift in double or float.
        System.out.println("10>>>2=  "+(10>>>2));

        //For positive number, >> and >>> works same
        System.out.println("positive no >> and >>> is same 20>>2 =\t"+(20>>2));
        System.out.println("positive no >> and >>> is same 20>>>2 =\t"+(20>>>2));
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println("-20>>2 =\t"+(-20>>2));
        System.out.println("-20>>>2 =\t"+(-20>>>2));



    }
}
