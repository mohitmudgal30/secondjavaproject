package midterm1;

public class fnoverloading {
    private  int a,b;
    private String c;
  public   void mohit(int f){
      a=f;                                             //fn overloading
        System.out.println("marks obtain  "+a);

    }
    public void mohit(int x,int y, String j){
        a=x;
        b=y;
        c=j;
        System.out.println("value of x "+a);
        System.out.println("value of y "+b);
        System.out.println("value of j "+c);

    }

    public static void main(String[] args) {
        fnoverloading fn1= new fnoverloading();

        fn1.mohit(12);
        fn1.mohit(12,15,"kjhgf");

    }

}
