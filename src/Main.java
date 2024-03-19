import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();

        while (true) {
            System.out.println("==== Library System ====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter your NIM (input 99 to back): ");
                int nim = scanner.nextInt();

                if (nim == 99) {
                    continue;
                }

                for (Student student : admin.getStudents()) {
                    if (student.getNim().equals(String.valueOf(nim))) {
                        System.out.println("==== Student Menu ====");
                        System.out.println("1. Buku terpinjam");
                        System.out.println("2. Pinjam buku");
                        System.out.println("3. Pinjam Buku atau Logout");
                        System.out.print("Choose option (1-3): ");
                        int studentChoice = scanner.nextInt();

                        if (studentChoice == 1) {
                            System.out.println("Buku terpinjam");
                        } else if (studentChoice == 2) {
                            System.out.println("Pinjam buku");
                        } else if (studentChoice == 3) {
                            System.out.println("Logging out from student account.");
                            break;
                        } else {
                            System.out.println("Invalid option.");
                        }

                        break;
                    }
                }
            } else {

            }
        }
    }
}
