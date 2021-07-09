package midterm1;
import javax.sound.midi.Soundbank;
class perametrize {
 private int id;
 private String name;
 private char b;
 perametrize(){
  System.out.println("I love java");                //default constructor
 }
 perametrize(int i,String s,char p){
  id=i;
  name=s;
  b=p;
  System.out.println(" id :" +id);
  System.out.println(" Name :" +name);               //parameterised constructor
  System.out.println(" Section :" +b);
 }
 public static void main(String[] args){                 //constructor overloading
  perametrize p1=new perametrize();
  perametrize p2=new perametrize(1,"Mohit",'b');
 }
}