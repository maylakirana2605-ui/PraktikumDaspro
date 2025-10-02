import java.util.Scanner;

public class CekGenapGanjil {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int angka;

        System.out.println("--- Pengecekan Bilangan Genap/Ganjil ---");
        System.out.print("Masukkan sebuah bilangan: ");
        angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Output: Genap");
        } else {
            System.out.println("Output: Ganjil");
        }

    }
}