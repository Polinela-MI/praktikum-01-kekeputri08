package modul3;

public class Praktikum3 {
    int nik;
    String nama;
    int gapok;
    int kehadiran;

    //overloading constructor
    public Praktikum3(int nik, String nama, int gapok, int kehadiran){
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
