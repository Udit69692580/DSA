package OOPsinJava;

public class StudentClass {

    public static void main(String[] args) {
        Student x= new Student("Udit",217);
        System.out.println(x.nofStudent);
        System.out.println(x.collegeName);
//        x.collegeName="BBSR"; this is not possible because of final keyword
//        System.out.println(x.collegeName);
//        x.name="Udit";
//        x.rollno=217;
//        x.persent=80.85;
        System.out.println(x.name);
        System.out.println(x.rollno);
//        System.out.println(x.persent);

        Student s=new Student("Dipti",219);
        System.out.println(s.nofStudent);//this will give 2 because of static keyword
        System.out.println(s.collegeName);
        System.out.println(s.name);
        System.out.println(s.rollno);
//        System.out.println(s.persent);
//        s.name="Dipti";
//        s.rollno=219;
//        s.persent=89.5;
//        s.name="Nikesh";
//        System.out.println(s.name);
//        changeName(s);
//        System.out.println(s.name);
//        System.out.println(s.getRollno());
//        s.setRollno(219);
//        System.out.println(s.getRollno());
    }
//    public static class Student{//Creating a new DataType
//        String name;
//        int rollno;
//        double persent;
//    }
//    static void changeName(Student s){
//
//        s.name="Giri";
//    }
}
