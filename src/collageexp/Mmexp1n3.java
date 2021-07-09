package collageexp;
import java.util.*;
import java.util.Arrays;
public class Mmexp1n3 {
    public static void main(String[] args)
    {
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Program TO Add Array\n Enter First Array Elements :\n");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Second  Array Elements :\n");
        for(int i=0;i<5;i++)
        {
            b[i]=sc.nextInt();
            c[i]=a[i]+b[i];
        }
        System.out.print("Array Eleme Elements Sum:\n");
        for(int i=0;i<5;i++)
        {
            System.out.println(c[i]);
        }
    }
}

