
interface A{
    void methodA();
}
interface B{
    void methodB();
}
class Demo implements A,B{
    public void methodA(){
        System.out.println("This is 1st method");
    }
    public void methodB(){
        System.out.println("This is method");
    }
}

public class Mulinh {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.methodA();
        obj.methodB();
    }
}
