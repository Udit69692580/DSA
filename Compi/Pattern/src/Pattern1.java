public class Pattern1 {
    public static void main(String[] args) {
    pattern(4);
    }
    static void pattern(int n){
        for(int r=0;r<n;r++){
            for (int c=0;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
