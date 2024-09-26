public class Pelindrom {
    public static void main(String[] args) {
        int number = 1211;
        System.out.println(pelli(number));
        if (isprime(number)) {
            System.out.println(number + " is  a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    static int pelli(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;

        }
        return reversed;
    }
    static boolean isprime(int number){
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }else{
            return true;
        }

    }
}