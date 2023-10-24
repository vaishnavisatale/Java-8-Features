package ConstructorReference;

@FunctionalInterface
interface Demo
{
    public void m1(String s);
}
public class Test {
    String s;
    Test(String s)
    {
        this.s=s;
        System.out.println("Hello "+s);
    }
    public static void main(String[] args) {

        //with lambda expression
        Demo d=s->new Test(s);
        d.m1("Vaishu");

        // with constructor reference

        Demo d1=Test::new;
        d1.m1("Santosh");

    }
}
