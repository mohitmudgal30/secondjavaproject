package nivimohit;
import java.util.*;//or (import java.util.Scanner) same

public class Bankni {
    private String acc_name;
    private int acc_number;
    private int acc_balance;
    public void readdetails(String s,int n,int i){
        acc_name  = s;
        acc_number = n;
        acc_balance = i;

    }
    public void getdetails(){
        System.out.println("Account holder name : " +acc_name);
        System.out.println("Account holder number : " +acc_number);
        System.out.println("Account balance : " +acc_balance);
    }
    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            System.out.println("enter acc_name");
            String s = sc.nextLine();
            System.out.println("Enter acc_num");
            int n = sc.nextInt();
            System.out.println("Enter acc_balance");
            int i = sc.nextInt();


        Bankni b1 = new Bankni();//object is created
        b1.readdetails(s,n,i);
        b1.getdetails();
    }}