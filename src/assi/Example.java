package assi;


import java.util.Scanner;

class Box{
    private int lenght,breadth,height;
    public void setDimension(int l,int b,int h){

        lenght =l;
        breadth= b;
        height= h;

    }
    public void showDimension(){
        System.out.println("L:" +lenght);
        System.out.println("B:" +breadth);
        System.out.println("h:" +height);
    }
    public void area(){
        int ar=lenght*breadth*height;
        System.out.println("area is :"+ ar);
    }
}
public class Example{
    public static void main(String[] args){
        Box smallBox=new Box();//object creation
        Scanner sc= new Scanner(System.in);
        System.out.print("length is :");
        int u=sc.nextInt();//u
        System.out.print("breath is :");
        int v= sc.nextInt();//v
        System.out.print("height is :");
        int w= sc.nextInt();//w

        smallBox.setDimension(u,v,w);//u,v,w are used for using scanner
        smallBox.showDimension(); //object calling to class  member function
        smallBox.area();
    }
}


