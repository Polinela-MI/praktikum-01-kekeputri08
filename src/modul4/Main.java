package modul4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Registrasi Data Karyawan");
        System.out.println("------------------------");

        System.out.println("Pilih Jenis Karyawanyang akan direstrasi:");
        System.out.println("1. Karyawan Paruh Waktu");
        System.out.println("2. Karyawan Penuh Waktu");
        System.out.println("3. Manajer");

        System.out.println("------------------------");
        System.out.print("Pilihan : ");
        int karyawan = input.nextInt();
        switch(karyawan){
            case 1:
                Karyawan karyawan1 = new KaryawanParuhWaktu();
                break;
            case 2:
                Karyawan karyawan2 = new KaryawanPenuhWaktu();
                break;
            case 3:
                Karyawan karyawan3 = new Manejer();
                break;
            System.out.print("NIK : ");
            int nik = input.nextInt();
            System.out.println(" ");
            System.out.print("Gaji Pokok Perjam : ");
            int gajiPokok = input.nextInt();
            System.out.println(" ");
            System.out.print("Total jam kerja : ");
            int jamKerja = input.nextInt();
            System.out.println(" ");
            System.out.print("Nama Karyawan : ");
            String nama = input.next();
            System.out.println(" ");
            System.out.println("------------------------");
            System.out.println("Gaji yang diterima oleh "+ nama + "("+ nik +") adalah = Rp"+Karyawan.hitungGaji());
        }
    }



}
