import java.util.Scanner;

public class GreatestCommonFactor {
    // [Thực hành] Tìm ước số chung lớn nhất (v.2023)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt(); a = Math.abs(a);
        System.out.print("Enter b: ");
        int b = sc.nextInt(); b = Math.abs(b);

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("The greatest common factor is: " + a);
    }
}
