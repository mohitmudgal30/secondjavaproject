package nivimohit;
import java.util.Scanner;

public class Evenodd {
    private int n;

    public Evenodd(){


        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no.");
         n =sc.nextInt();


    }
    public void chech(){
        if (n%2==0){
            System.out.println("no. is even");
        }
        else {
            System.out.println("no. is odd");
        }
    }

    public static void main(String[] args) {
        Evenodd e1=new Evenodd();
        e1.chech();

    }



}
