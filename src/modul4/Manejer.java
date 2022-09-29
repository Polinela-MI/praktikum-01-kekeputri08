package modul4;

public class Manejer extends Karyawan{
    private int  Kinerja;

    Manejer(int nik, String nama, int gajiPokok) {
        super(nik, nama, gajiPokok);
        this.Kinerja = Kinerja;
    }
    //sett
    public void setKinerja(int kinerja) {
        Kinerja = kinerja;
    }

    //gett
    public int getKinerja() {
        return Kinerja;
    }
}
