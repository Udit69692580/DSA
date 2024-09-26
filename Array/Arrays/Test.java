public class Test {

    void fun(int y)
    {
        y=y+10;
        System.out.println(y);
    }
    void fun2()
    {
        int x=20;
        System.out.println(x);
    }
    public static void main(String a[])
    {
        int x=90;
        Test t=new Test();
        t.fun(x);
        System.out.println(x);
        t.fun2();
    }
}
