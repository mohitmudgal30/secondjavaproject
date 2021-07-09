package nivimohit;


public class Constructor {
    private int age;
    private int height;
    Constructor(){
        int age = 4;
        int height = 6;
        System.out.println("AGE IS:" +age);
        System.out.println("height is: " + height);
    }
    public static void main(String[] args){

        Constructor c1=new Constructor();
    }


}