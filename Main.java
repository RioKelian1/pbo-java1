import java.util.Scanner;
class LibrarySystem {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";
    private static final String[] STUDENT_NIMS = {"202310370311015"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n== Library System ==\n");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit\n");
            System.out.print("Choose option (1-3): ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter your NIM: ");
                    String nim = scanner.nextLine();
                    if (isStudent(nim)) {
                        System.out.println("\nSuccessful Login as Student");
                        // Do student related tasks here
                    } else {
                        System.out.println("\nUser Not Found");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username (admin): ");
                    String username = scanner.nextLine();
                    System.out.print("Enter your password (admin): ");
                    String password = scanner.nextLine();
                    if (isAdmin(username, password)) {
                        System.out.println("\nSuccessful Login as Admin");
                        // Do admin related tasks here
                    } else {
                        System.out.println("\nAdmin User Not Found!!");
                    }
                    break;
                case 3:
                    System.out.println("\npengen turu\n");
                    System.exit(0);
                default:
                    System.out.println("\nInvalid option. Please choose a number between 1 and 3.");
            }
        }
    }

    private static boolean isStudent(String nim) {
        for (String studentNIM : STUDENT_NIMS) {
            if (studentNIM.equals(nim)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAdmin(String username, String password) {
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }
}
