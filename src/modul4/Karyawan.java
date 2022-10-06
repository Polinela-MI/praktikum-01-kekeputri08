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
    public void setNik(int nik){
        this.nik = nik;
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    //gett
    public int getNik() {
        return nik;
    }
    public String getNama() {
        return nama;
    }
    public int getgajiPokok() {
        return gajiPokok;
    }

}









