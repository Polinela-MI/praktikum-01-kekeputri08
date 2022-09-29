package modul4;

class Karyawan {
    private int nik;
    private String nama;
    private int gajiPokok;

    public void hitungGaji(){
        int tunjanganTransport = (int) 0.05 * gajiPokok;
        int subTotalGaji = gajiPokok + tunjanganTransport;
        int pajak = subTotalGaji * (int)0.025;
        int TotalGajiMinggu = subTotalGaji - pajak;
    }


    Karyawan(int nik, String nama, int gajiPokok) {
        this.nik = nik;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
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









