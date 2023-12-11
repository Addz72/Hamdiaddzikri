import java.util.ArrayList;
import java.util.Scanner;

public class Perbaikan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> mahasiswa = new ArrayList<>();
        ArrayList<String> mataKuliah = new ArrayList<>();
        ArrayList<Integer> sks = new ArrayList<>();
        ArrayList<Double> nilai = new ArrayList<>();

        // Input data
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();
        mahasiswa.add(namaMahasiswa);

        System.out.print("Masukkan semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        int n = 0;
        System.out.print("Masukkan jumlah mata kuliah: ");
        n = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama mata kuliah " + (i + 1) + ": ");
            String namaMK = scanner.nextLine();
            mataKuliah.add(namaMK);

            System.out.print("Masukkan SKS " + namaMK + ": ");
            int sk = scanner.nextInt();
            scanner.nextLine(); // clear buffer
            sks.add(sk);

            System.out.print("Masukkan nilai " + namaMK + ": ");
            double nl = scanner.nextDouble();
            scanner.nextLine(); // clear buffer
            nilai.add(nl);
        }

        // Output
        System.out.println("\nKartu Hasil Studi (KHS)");
        System.out.println("-----------------------------------");
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Semester: " + semester);
        System.out.println("\nMata Kuliah\t\tSKS\t\tNilai\t\tBobot\t\tNilai x Bobot");
        System.out.println("---------------------------------------------------------------");

        double totalNilai = 0;
        double totalBobot = 0;

        for (int i = 0; i < n; i++) {
            double nilaiAkhir = nilai.get(i) * sks.get(i);
            totalNilai += nilaiAkhir;
            totalBobot += sks.get(i);

            System.out.printf("%s\t\t%d\t\t%.2f\t\t%.2f\t\t%.2f%n", mataKuliah.get(i), sks.get(i), nilai.get(i), (double) sks.get(i) / totalBobot, nilaiAkhir);
        }

        double ipk = totalNilai / totalBobot;
        System.out.println("\nIPK: " + ipk);
    }
}