

package nivimohit;

public class Paracon {

    private int acc;  //Method variables
    private int cost;//Method variables
    private String name;	//Method variables

    public Paracon(int n,int i,String s){
        acc= n;
        cost = i;
        name =s;
    }

    public  void p(){            // Method function
        System.out.println("id : " +acc);
        System.out.println("age : " +cost);
        System.out.println("name : " +name);

    }
    public static void main(String[] args)
    {
        Paracon ob2 =new Paracon(12,12,"kjh");
        ob2.p();






    }}
