package LambdaExpressions;
@FunctionalInterface
interface A
{
    public void show();
}
@FunctionalInterface
interface B
{
    public void show1();
}
public class Demo implements A{

    @Override
    public void show() {
        System.out.println("Without Lambda Expression");
    }
    public static void main(String[] args)
    {
        //Without Lambda Expression
        A a=new Demo();
        a.show();

        //With Lambda Expression
        B b=()->System.out.println("With Lambda Expression");
        b.show1();
    }
}
