package AnonymousClass;

public class WithoutLambdaEx {
    public static void main(String[] args)
    {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<4;i++)
                System.out.println("Child Method");
            }
        });

        t.start();

        for(int i=0;i<4;i++)
            System.out.println("Parent Method");

    }


}
