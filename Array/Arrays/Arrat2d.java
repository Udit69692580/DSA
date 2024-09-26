public class Arrat2d {
    public static void main(String[] args) {
        arrayy();
    }
     static void arrayy(){
        int arr[][]=new int [3][3];
//       int[][] arr={{1,2,3},
//                      {4,5,6},
//                       {7,8,9}};
        arr[0][0]=12;
         arr[0][1]=13;
         arr[0][2]=14;
         arr[1][0]=15;
         arr[1][2]=16;
         System.out.println(arr[0][0]);
         System.out.println(arr[0][1]);
         System.out.println(arr[0][2]);
         System.out.println(arr[1][0]);
         System.out.println(arr[1][2]);
         System.out.println(arr.length);//no.of rows

//         System.out.println(arr[0][1]);//2
    }
}
