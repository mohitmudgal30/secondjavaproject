package midterm1;

import java.util.Scanner;

public class Bank {
    private String acc_holder_name;
    private int acc_number;
    private int acc_balance;
    Bank(String s,int p,int n){
        acc_holder_name=s;
        acc_number=p;
        acc_balance=n;

    }
    public void Print(){
        System.out.println(" the acc holder name is :" +acc_holder_name);
        System.out.println(" the acc number is :" +acc_number);
        System.out.println(" the acc holder balance is :" +acc_balance);
    }
    public static void main(String[] args){
        String p;
        int q;
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the acc_holder name :");
        p=sc.nextLine();
        System.out.println("enter the acc_holder number :");
        q=sc.nextInt();
        System.out.println("enter the acc_holder balance :");
        r=sc.nextInt();
        Bank b1=new Bank(p,q,r);
        b1.Print();
    }

}