package midterm1;


class defaultconstructor
{
    int id;
    String name;
    //method to display the value of id and name
    void display(int i,String s)
    { id=i;
        name=s;
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    {
//creating objects
        defaultconstructor s1=new defaultconstructor();
        defaultconstructor s2=new defaultconstructor();
//displaying values of the object
        s1.display(5,"mohit");
        s2.display(76,"raman");
    }
}