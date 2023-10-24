package MethodReference;


@FunctionalInterface
interface Test
{
    public void m1(String s);
}
public class Test_InstaceMethod {

    public String m2(String g)
    {
        System.out.println("hello "+g);
        return g.toUpperCase();
    }
    public static void main(String[] args) {
        Test_InstaceMethod t1=new Test_InstaceMethod();
        Test t=t1::m2;
        t.m1("Vaishu");

    }
}
