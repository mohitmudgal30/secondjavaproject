package nivimohit;


import java.util.Scanner;
public class Leapyear {
        public static void main(String args[])
        {
                int y;
                Scanner sc=new Scanner(System.in);
                System.out.println("enter a program to check for leap year");
                y=sc.nextInt();

                if(((y% 4 == 0) && (y% 100 != 0)) ||
                        (y% 400 == 0))
                {
                        System.out.println("Leap year");
                }
                else
                {
                        System.out.println("not a Leap year");
                }
        }
}