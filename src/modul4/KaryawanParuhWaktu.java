package modul4;

public class KaryawanParuhWaktu extends Karyawan {
    private int jamKerja;
    KaryawanParuhWaktu(int nik, String nama, int gajiPokok) {
        super(nik, nama, gajiPokok);
        this.jamKerja = jamKerja;
    }

    //set
    void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    //gett
    int getJamKerja() {
        return jamKerja;
    }
}

