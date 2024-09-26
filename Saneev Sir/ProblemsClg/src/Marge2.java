import java.util.Scanner;

class Marge2
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Read the number of elements for List 1
        int X = scanner.nextInt(); // Read the number of elements for List 2

        int[] list1 = new int[N + X + N]; // Create an array to hold List 1 + List 2 + List 1

        // Read the N space separated integers for List 1 and store them in the array
        for (int i = 0; i < N; i++) {
            list1[i] = scanner.nextInt();
        }

        // Read the X space separated integers for List 2 and store them in the array
        for (int i = N; i < N + X; i++) {
            list1[i] = scanner.nextInt();
        }

        // Copy the elements of List 1 again after List 2
        for (int i = N + X; i < (N + X + N); i++) {
            list1[i] = list1[i - N - X];
        }

        // Output the merged list
        for (int i = 0; i < (2 * N + X); i++) {
            System.out.print(list1[i] + " ");
        }

    }
}
