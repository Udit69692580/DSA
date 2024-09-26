public class TraversingArray {
    public static void main(String[] args) {
        traverse();
    }
    static void traverse(){
        int[][] arr={{1,2,3},{4,5,6}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
//        int [] n={1,2,3,4};
//        for(int i=0;i<4;i++){
//            System.out.println(n[i]);
//        }
////        for each loop
//        for(int a : n){//a is the varriable of integer type where we store all the element of n
//            System.out.println(a);
//        }
//        int i=0;
//        while(i<4){
//            System.out.println(n[i]);
//            i=i+1;
//        }
    }
}
