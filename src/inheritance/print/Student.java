package inheritance.print;


class Student extends Person{      // student = subclass(Derived class) and Person is superclass(Base class)
    private int roll_no;
    public void setroll(int r){
        roll_no=r;
    }
    public int getroll(){
        return(roll_no);
    }
}

