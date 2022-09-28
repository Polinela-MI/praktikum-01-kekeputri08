package modul2;

import java.util.ArrayList;

public class Karyawan {
    int nik;
    String nama;
    int gapok;

    //overloading constructor
    public Karyawan(int nik, String nama, int gapok){
        this.nik=nik;
        this.nama=nama;
        this.gapok=gapok;
    }

    public int hitungGaji(){

        int Trans = (int)(gapok * 0.05);
        int Kerja = (int)(gapok * 0.1);

        int Sebelum_Pajak = gapok + Kerja + Trans;
        int Sesudah_Pajak = (int) (Sebelum_Pajak * 0.025);
        int Total = Sebelum_Pajak - Sesudah_Pajak;
        return Total;
    }
}
class biasa {
    public static void main(String[] args) {
        ArrayList<Integer> nikList = new ArrayList<Integer>();
        for (int i = 1; i < args.length; i += 3) {
            int nik = Integer.parseInt(args[i]);
            String nama = args[i + 1];
            int gapok = Integer.parseInt(args[i + 2]);

            if (!nikList.contains(nik)) {
                Karyawan karyawan = new Karyawan(nik, nama, gapok);
                nikList.add(nik);
                System.out.println(nik + " - " + nama + " - " + karyawan.hitungGaji());

            }
        }
    }
}
