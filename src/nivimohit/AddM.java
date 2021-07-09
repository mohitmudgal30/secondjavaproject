package nivimohit;
import java.util.*;

public class AddM {
    public static void main(String[] args)
    {
        int a[][],b[][];
        int sum[][];
        int row,column;
        int i,j;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of row : ");
        row = sc.nextInt();
        System.out.print("Enter the total number of column : ");
        column = sc.nextInt();
        a= new int[row][column];// array initialization
        for (i =0; i < row; i++) {
            for (j =0; j < column; j++) {
                System.out.println("Enter elements of 1st matrix");
                a[i][j] = sc.nextInt();
            }
        }
        b= new int[row][column];//new  keyword
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.println("Enter element of second matrix ");
                b[i][j] = sc.nextInt();
            }
        }
        sum = new int[row][column];
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < column; j++)
            {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}