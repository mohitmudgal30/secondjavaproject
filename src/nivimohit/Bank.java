package nivimohit;

public class Bank {

    private int acc;  //Method variables
    private int cost;//Method variables
    private String name;	//Method variables

    public void get(int n,int i,String s){
        acc= n;
        cost = i;
        name =s;
    }

    public void print(){            // Method function
        System.out.println("id : " +acc);
        System.out.println("age : " +cost);
        System.out.println("name : " +name);

    }
    public static void main(String[] args)
    {Bank ob1=new Bank();
        ob1.get(1,123,"ravan");
        ob1.print();


    }}
