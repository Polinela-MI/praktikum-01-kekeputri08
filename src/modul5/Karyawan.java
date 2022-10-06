package modul5;

public class Karyawan {
    private int nik;
    private String nama;
    private int gajiPokok;
    public static int currentNIK=0;
    double tunjanganTransportasi;
    double pajak;
    double misc;

    public double hitungGaji(){
        tunjanganTransportasi =  0.05 * gajiPokok;
         misc= gajiPokok + tunjanganTransportasi;
         pajak = misc * 0.025;
         double Total = misc - pajak;
         return Total;
}

    Karyawan( String nama, int gajiPokok) {
        this.nik = currentNIK;
        currentNIK++;
        this.nama = nama;
        this.gajiPokok = gajiPokok;

    }
    //sett


    public void setNik(int nik) {
        this.nik = nik;
    }

    public static void setCurrentNIK(int currentNIK) {
        Karyawan.currentNIK = currentNIK;
    }

    public void setNama (String nama){
        this.nama = nama;
    }
    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public void setTunjanganTranportasi(int tunjanganTranportasi) {
        this.tunjanganTransportasi = tunjanganTransportasi;
    }

    public void setMisc(int misc) {
        this.misc = misc;
    }

    public void setPajak(int pajak) {
        this.pajak = pajak;
    }

    //gett


    public int getNik() {
        return nik;
    }

    public static int getCurrentNIK() {
        return currentNIK;
    }

    public String getNama() {
        return nama;
    }
    public int getgajiPokok() {
        return gajiPokok;
    }

    public double getTunjanganTranportasi() {
        return tunjanganTransportasi;
    }

    public double getMisc() {
        return misc;
    }

    public double getPajak() {
        return pajak;
    }
}