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
class ParuhWaktu{
    int jamKerja = 20;
}

class PenuhWaktu{
    int jamKerja = 40;
}

class Manajer{
    int Kinerja = ;
}

