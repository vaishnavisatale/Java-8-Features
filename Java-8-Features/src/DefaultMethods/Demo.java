package DefaultMethods;

interface Test
{
    default void m1()
    {
        System.out.println("Welcome to Default method of interface");
    }
}
interface Test1
{
    default void m1()
    {
        System.out.println("Welcome to Default method of interface Test 1");
    }
}

class Demo1 implements Test1,Test{
    public static void main(String[] args)
    {
        Demo d=new Demo();
        d.m1();
    }

    @Override
    public void m1() {
        Test.super.m1();
    }
}
public class Demo implements Test{
    public static void main(String[] args)
    {
        Demo d=new Demo();
        d.m1();
    }
}
