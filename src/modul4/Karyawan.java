package modul4;

class Karyawan {
    private int nik;
    private String nama;
    private int gajiPokok;

    Karyawan(int nik, String nama, int gajiPokok) {
    }
    //set
    public void setnik(int nik){
        this.nik = nik;
    }
    public void setnama (String nama){
        this.nama = nama;
    }
    public void setgajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public int getnik() {
        return nik;
    }
    public String getnama() {
        return nama;
    }
    public int getgajiPokok() {
        return gajiPokok;
    }

}


class KaryawanParuhWaktu extends Karyawan{
    int jamKerja = 20;

    KaryawanParuhWaktu(int jamKerja){
    }

    public void setjamKerja(int jamKerja){
        this.jamKerja = jamKerja;
    }

    public int getjamKerja() {
        return jamKerja;

}

class KaryawanPenuhWaktu extends Karyawan{
    int jamKerja = 40;

    KaryawanPenuhWaktu(int jamKerja){
    }

    public void setjamKerja(int jamKerja){
        this.jamKerja = jamKerja;
    }

    public int getjamKerja() {
        return jamKerja;
}

class Manajer extends Karyawan{
    int Kinerja = ;

    Manajer(int kinerja){
    }

    public void Kinerja(int Kinerja){
        this.Kinerja = Kinerja;
    }

    public int getKinerja() {
        return Kinerja;
}

