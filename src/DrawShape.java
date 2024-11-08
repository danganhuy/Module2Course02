import java.util.Scanner;

public class DrawShape {
    // [Thực hành] Thiết kế menu cho ứng dụng (v.2023)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== MENU ====");
        System.out.println("1.Draw the triangle");
        System.out.println("2.Draw the rectangle");
        System.out.println("3.Draw the square");
        System.out.println("4.Draw the diamond");
        System.out.println("5.Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the rectangle");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                break;
            case 3:
                System.out.println("Draw the square");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                break;
            case 4:
                System.out.println("Draw the diamond");
                System.out.println("      *      ");
                System.out.println("   *******   ");
                System.out.println("*************");
                System.out.println("   *******   ");
                System.out.println("      *      ");
            case 5:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
