class sample{
    int n = 10;
    public void something()
    {
        System.out.println("Nothing :(");
    }
}
public class instancevar {
    public static void main(String args[])
    {
        sample obj = new sample();
        sample obj1 = new sample();

        //now lets change the value of the n using one object
        obj.n=12;
        System.out.println(obj.n);
        System.out.println(obj1.n);//the value won't change for this obj
    }
}

