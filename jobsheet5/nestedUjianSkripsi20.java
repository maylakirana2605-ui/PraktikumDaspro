import java.util.Scanner;

public class nestedUjianSkripsi20 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();
        
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";

            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal log bimbingan P1 dan P2 belum memenuhi syarat";

            } else if (bimbinganP1 < 8) {
                pesan = "Gagal log bimbingan P1 belum mencapai 8 kali";
                
            } else {
                pesan = "Gagal log bimbingan P2 belum mencapai 4 kali";
            } 

        } else {
            pesan = "Gagal log bimbingan mahasiswa masih memiliki tanggungan kompen";
        }

        System.out.println(pesan);

    }
}