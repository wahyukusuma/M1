import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<mahasiswa> mahasiswaList = new ArrayList<>();

    public static void main(String[] args) {
        int pilihan;
        while (true) {
            menu();
            pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    tambahDataMahasiswa();
                    break;
                case 2:
                    tampilkanDataMahasiswa();
                    break;
                case 3:
                    System.out.println("sampai jumpa, semoga harimu menyenangkan!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("pilihan salah.");
            }
        }
    }

    private static void tambahDataMahasiswa() {
        System.out.print("masukan nama mahasiswa: ");
        String name = scanner.nextLine();
        System.out.print("masukan nim mahasiswa (15 nomor): ");
        String nim = scanner.nextLine();
        if (nim.length() != 15) {
            System.out.println("masukan 15 nomor mahasiswamu!!!.");
            return;
        }
        System.out.print("masukan jurusan mu: ");
        String jurusan = scanner.nextLine();

        mahasiswa mahasiswa = new mahasiswa(name, nim, jurusan);
        mahasiswaList.add(mahasiswa);
        System.out.println("Data mahasiswa sudah ditambahkan.");
    }

    private static void tampilkanDataMahasiswa() {
        System.out.println("nama\t\tnim\t\tjurusan");
        for (mahasiswa mahasiswa : mahasiswaList) {
            System.out.println(mahasiswa.getName() + "\t" + mahasiswa.getNim() + "\t" + mahasiswa.getJurusan());
        }
        mahasiswa.tampilkanUniversitas();
    }

    private static void menu() {
        System.out.println("---menu sistem penambahan data mahasiswa---");
        System.out.println("1. tambahkan data mahasiswa");
        System.out.println("2. Display Student Data");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3): ");
    }
}