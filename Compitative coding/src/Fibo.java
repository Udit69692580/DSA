public class Fibo {
    public static void main(String[] args) {
        int num = 10;
        int first = 0, second = 1;

        for (int i = 3; i < num; i++) {
            int next = first + second;
            System.out.println(" "+next);
            first=second;
            second=next;
        }
    }
}