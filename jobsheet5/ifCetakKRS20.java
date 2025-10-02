import java.util.Scanner;

public class ifCetakKRS20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String statusPembayaran;
        String instruksiSelanjutnya;

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): "); 
        boolean uktLunas = sc.nextBoolean();

        statusPembayaran = uktLunas ? 
            "Pembayaran UKT terverifikasi" : 
            "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        instruksiSelanjutnya = uktLunas ?
            "Silahkan cetak KRS dan minta tanda tangan DPA" :
            "";

        System.out.println(statusPembayaran);
        
        if (!instruksiSelanjutnya.isEmpty()) { 
             System.out.println(instruksiSelanjutnya);
        }

    }
}