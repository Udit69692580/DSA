public class Maxvalue {
    public static void main(String[] args) {
        sum();

    }
    static void sum(){
        int []n = {1,5,11,4,5,};
        int x=5;
        int ans =-1;
        for(int i=0;i<n.length;i++){
            if(x==n[i]){
                ans = i;
                break;//if we dont put break loop will traverse to the end
            }
        }
        System.out.println("found"+" " + x+" " +"atindex:"+ ans);

//        for(int i=0;i<n.length;i++){
//            if(n[i]>ans){
//                ans = n[i];
//            }/*else{
//                System.out.println("not found");
//            }

//        }
//        System.out.println(ans);
    }
}
