package MethodReference;

public class Test_StaticMethod {

    public static void m1()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println("Child Method");
        }
    }
    public static void main(String[] args)
    {
        Runnable r= Test_StaticMethod::m1;
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<4;i++)
        {
            System.out.println("Parent Method");
        }
    }
}
