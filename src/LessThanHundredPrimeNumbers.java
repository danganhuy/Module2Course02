import java.util.Scanner;

public class LessThanHundredPrimeNumbers {
    // [Bài tập] Hiển thị các số nguyên tố nhỏ hơn 100
    public static void main(String[] args) {

        int[] prime = new int[0];

        int curNum = 2;
        int count = 0;
        while (curNum < 100) {
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

        System.out.println("Các số nguyên tố nhỏ hơn 100: ");
        for (int j : prime) {
            System.out.print(j + " ");
        }
    }
}
