import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);
        AssetManager assetManager = new AssetManager();

        while (true) {
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Exit");
            System.out.println("4. Add Asset");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                // Sign Up
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter email: ");
                String email = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                userManager.signUp(name, email, password);
            } else if (choice == 2) {
                // Sign In
                System.out.print("Enter email: ");
                String email = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                userManager.signIn(email, password);
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else if (choice == 4) {
                assetManager.addAsset();
            } else {
                System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
