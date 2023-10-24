package LambdaExpressions;
@FunctionalInterface
interface Test
{
    public void m1();
}
public class InstanceVariable {
    int x=10;
    public void m2()
    {
        Test t=()->
        {
            int x=11;
            System.out.println(x);
            x=12;
            System.out.println(x);

            System.out.println(this.x);

        };
        t.m1();
    }
    public static void main(String[] args)
    {
        InstanceVariable obj=new InstanceVariable();
        obj.m2();
    }
}
