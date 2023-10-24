package StaticMethods;

interface Test
{
    public static void sum(int a,int b)
    {
        System.out.println("Sum = "+(a+b));
    }
}

public class Demo implements Test{

    public static void main(String[] args)
    {
        Demo d=new Demo();
        //d.sum();
        Test.sum(1,2);
    }
}
