package OOPsinJava;

public class Student {
    final String collegeName="CUTM";
     String name;
     int rollno;
    double persent;
    static int nofStudent;
    public int getRollno(){ //getter

        return rollno;
    }
    public void setRollno(int roll){//setter
        rollno=roll;
    }
    public Student(String naam,int rno){
        name=naam;
        rollno=rno;
//        persent=per;
        nofStudent++;
    }
}
