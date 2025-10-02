import java.util.Scanner;

public class SistemKampus {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- 1. Izin Masuk Perpustakaan ---");
        
        System.out.print("Bawa Kartu Mahasiswa? (true/false): ");
        boolean bawaKM = sc.nextBoolean();
        
        System.out.print("Sudah Registrasi Online? (true/false): ");
        boolean registrasiOnline = sc.nextBoolean();
        
        if (bawaKM || registrasiOnline) {
            System.out.println("Status Perpustakaan: Boleh Masuk\n");
        } else {
            System.out.println("Status Perpustakaan: Ditolak Masuk\n");
        }
        
        sc.nextLine();
        System.out.println("--- 2. Akses WiFi Kampus ---");
        System.out.print("Masukkan jenis pengguna (Dosen/Mahasiswa/Lain): ");
        String jenisPengguna = sc.nextLine();
        
        if (jenisPengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int jumlahSKS = sc.nextInt();
            if (jumlahSKS >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }       
        } else {
            System.out.println("Akses ditolak");
        }

    }
}