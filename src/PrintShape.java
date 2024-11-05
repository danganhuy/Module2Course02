import java.util.Scanner;

public class PrintShape {
    // [Bài tập] Hiển thị các loại hình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== MENU ====");
        System.out.println("1.Print triangle");
        System.out.println("2.Print rectangle");
        System.out.println("3.Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Print triangle");
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < i+1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Print rectangle");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
