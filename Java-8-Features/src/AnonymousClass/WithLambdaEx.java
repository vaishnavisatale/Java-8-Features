package AnonymousClass;

public class WithLambdaEx {
    public static void main(String[] args)
    {
        Thread t=new Thread(() ->
        {
            for(int i=0;i<4;i++)
            {
                System.out.println("Child Method");
            }
        });
        t.start();

        for(int i=0;i<4;i++)
        {
            System.out.println("Main Method");
        }
    }
}
