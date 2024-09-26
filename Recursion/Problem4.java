 class Fibo {
    public static void main(String[] args) {
        int num = 10;
        int first = 0, second = 1;
        for (int i = 0; i < num; i++) {
            int next = first + second;
            System.out.print(" "+next);
            first=second;
            second=next;
        }
    }
}