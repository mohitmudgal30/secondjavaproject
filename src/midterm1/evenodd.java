package midterm1;

import java.util.Scanner;

public class evenodd
{

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc1.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}