package modul4;

class Karyawan {
    private int nik;
    private String nama;
    private int gajiPokok;

    Karyawan(int nik, String nama, int gajiPokok) {
    }
    //sett
    public void setnik(int nik){
        this.nik = nik;
    }
    public void setnama (String nama){
        this.nama = nama;
    }
    public void setgajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    //gett
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









