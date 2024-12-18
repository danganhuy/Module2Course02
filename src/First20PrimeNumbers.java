import java.util.Scanner;

public class First20PrimeNumbers {
    // [Bài tập] Hiển thị 20 số nguyên tố đầu tiên
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] prime = new int[0];

        int curNum = 2;
        int count = 0;
        while (count < number) {
            boolean isPrime = true;
            for (int i = 0; i < prime.length; i++) {
                if (curNum % prime[i] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                prime = java.util.Arrays.copyOf(prime, prime.length + 1);
                prime[count] = curNum;
                count++;
            }
            curNum++;
        }

        System.out.println(number + " số nguyên tố đầu tiên: ");
        for (int j : prime) {
            System.out.print(j + " ");
        }
    }
}
