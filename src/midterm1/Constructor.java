package midterm1;

public class Constructor{
    private int l,b,h;
    public Constructor(){               // Constructor formation
        l=10;
        b=8;
        h=4;
    }
    public void getdim(){
        System.out.println("lenght :" + l);
        System.out.println("bredth :" +b);
        System.out.println("height :" +h);
    }
    public static void main(String[] args){
        Constructor b1 = new Constructor();
        b1.getdim();

    }
}
