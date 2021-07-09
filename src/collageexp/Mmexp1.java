package collageexp;
import java.util.Scanner;

public class Mmexp1 {

    public static void main(String[] args) {
// quest 3
        int x[]={15,27,61,10,15,18};

        int y[]={22,41,87,120,15,19};


        System.out.println(x[3]+y[3]);
        //quest   1

        int a=19;

        if(a>=18)
        {
            System.out.println("allow to voting");
        }
        else
        {

            System.out.println("not allow to vote");}

        //quest 4
        int t;

        for(t=10;t<=70;t++)
        {
            System.out.print(t + ",");

        }
        System.out.println(" ");
        int q;

        for(q=10;q<=70;q++)
        {
            if(q==35)
            {
                continue;
            }
            System.out.print(q + " ,");
        }
        System.out.println(" ");
        // quest  2
        int day=4;
        switch(day)
        {
            case 1:
                System.out.print("january"+ " ,");
            case 2:
                System.out.print("feb"+ ",");
            case 3:
                System.out.print("mar"+ ",");
            case 4:
                System.out.print("aprail"+",");
            case 5:
                System.out.print("may"+",");

            case 6:
                System.out.print("june"+",");
            case 7:
                System.out.print("july"+",");
                break;
            case 8:
                System.out.print("august"+",");
            case 9 :
                System.out.print("sep"+",");
            case 10 :
                System.out.print("oct"+",");
            case 11 :
                System.out.print("nev"+",");
            case 12 :
                System.out.print("dec"+",");

        }
        System.out.println("  ");





    }
}
