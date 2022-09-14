import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String pilih_operasi;
        int nilai_a = 0;
        int nilai_b = 0;
        double hasil;

        Scanner input_pilihan = new Scanner(System.in);
        System.out.println("_______________________________");
        System.out.println("PILIHAN PENJUMLAHAN ARITMATIKA: ");
        System.out.println("===============================");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Pemangkatan");
        System.out.println("_______________________________");
        System.out.print("Masukkan pilihan [1/2/3/4/5]: ");
        pilih_operasi = input_pilihan.next();