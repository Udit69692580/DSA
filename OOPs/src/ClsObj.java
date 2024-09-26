public class ClsObj {
    public static void main(String[] args) {
        int[] roll=new int[5];
        String[] name=new String[5];
        float[] marks = new float[5];
        Student1 st1=new Student1(1,"udit",90.8f);
        Student1 st2=new Student1(2,"bsbj",95.8f);
        Student1 st3=new Student1(3,"snbns",93.8f);
        System.out.println("The details of student 1:");
        st1.display();
        System.out.println("The details of student 2:");
        st2.display();
        System.out.println("The details of student 3:");
        st3.display();

    }
}
class Student1{
    int roll;
    String name;
    float marks;
    Student1(int r,String n,float m){
        this.roll=r;
        this.name=n;
        this.marks=m;
    }
    public void display(){
        System.out.println("roll:"+this.roll);
        System.out.println("Name:"+this.name);
        System.out.println("marks:"+this.marks);

    }
}
