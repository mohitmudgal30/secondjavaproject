package operators;

public class Logical { //logical operators are {&&,||,!}
    public static void main(String[] args) {

        System.out.println(33>13&&12<=12);
        System.out.println(18>33||22<=12);
        System.out.println(!(8!=7));
       int a=10,b=5,c=20;/*
        System.out.println(a<b&&a<c);//false && true = false
        System.out.println(a<b&a<c);//false & true = false
        System.out.println(a<b&&a++<c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a<b&a++<c);//false && true = false
        System.out.println(a);//11 because second condition is checked
//now a=11;
       */ System.out.println(a>b||a>c);//true || true = true

        System.out.println(a>b|a<c);//true | true = true
//|| vs|

        System.out.println(a>b||a++<c);//true || true = true
        System.out.println(a);//11 because second condition will not be  checked
        System.out.println(a>b|a++<c);//true | true = true
        System.out.println(a);//11 because second condition is checked

    }
}
