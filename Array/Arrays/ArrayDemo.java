import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
//         ArrayExample obj= new  ArrayExample();
          demoArrays();
//        System.out.println(obj.arr[0]);

    }
     static void demoArrays(){
        int [] ages=new int[4];
        float[] weights = new float[2];
//        String [] names = new String[3];
        ages [0] = 20;
        ages [1] = 21;
        ages [2] = 22;
        ages [3] = 23;
//        ages [4] =31;//out of bounds
         weights [0] =23.6f;
         weights [1] =27.6f;

         System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
//        System.out.println(ages[0]);
         System.out.println(weights[1]);








     }
}
