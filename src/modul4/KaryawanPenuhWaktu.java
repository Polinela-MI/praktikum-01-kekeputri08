package modul4;

public class KaryawanPenuhWaktu  extends Karyawan{
        private int jamKerja;

    KaryawanPenuhWaktu(int nik, String nama, int gajiPokok) {
        super(nik, nama, gajiPokok);
        this.jamKerja = jamKerja;
    }
    //sett
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    //gett
    public int getJamKerja() {
        return jamKerja;
    }
}
