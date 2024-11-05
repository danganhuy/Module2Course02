import java.util.Scanner;

public class InterestCalculator {
    // [Thực hành] Ứng dụng tính tiền lãi cho vay (v.2023)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Investment Amount: ");
        int money = sc.nextInt();
        System.out.print("Enter the number of months: ");
        int month = sc.nextInt();
        System.out.print("Enter interest rate (%/month): ");
        double interestRate = sc.nextDouble();

        double totalInterest = money * Math.pow(1 + interestRate / 100f, month) - money;
        System.out.println("Total Interest: " + totalInterest);
    }
}
