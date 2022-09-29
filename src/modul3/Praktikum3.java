package modul3;

public class Praktikum3 {
    private int nik;
    private String nama;
    private int gapok;
    private int hadir;

    //overloading constructor
    public Praktikum3(int nik, String nama, int gapok, int hadir){
        this.nik = nik;
        this.nama = nama;
        this.gapok = gapok;
    }
    public int getNik() {return nik; }
    public String getNamaKaryawan() {return nama;}
    public int getGapok(){
        return gapok;
    }

    public void hitungGaji(){

        int Trans = (int)(gapok * 0.05);
        int Kerja = (int)(gapok * 0.1);
        int Makan = (int)(35000 * hadir);

        int subTotal = gapok + Trans + Kerja + Makan;
        int Sebelum_Pajak = gapok + Kerja + Trans;
        int Sesudah_Pajak = (int) (Sebelum_Pajak * 0.025);
        int Total = Sebelum_Pajak - Sesudah_Pajak;

        System.out.println("Rp." + Total);
    }
}

