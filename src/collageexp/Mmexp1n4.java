package collageexp;
import java.util.*;
import java.util.Arrays;
public class Mmexp1n4
{
    public static void main(String[] args)
    {
        int a[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.print("Program To Display 2d Array\n Enter Array Elements :\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Array Elements:\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();

        }
    }
}