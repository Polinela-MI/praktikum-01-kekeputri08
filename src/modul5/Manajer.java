package modul5;



public class Manajer extends Karyawan {
    private int  Kinerja;

    Manajer(String nama, int gajiPokok) {
        super(nama, gajiPokok);
        this.Kinerja = Kinerja;
    }

    public double hitunggaji(){
        double gajiMingguan;
        gajiMingguan= getgajiPokok()*20;
        tunjanganTransportasi=gajiMingguan*0.5;
        double subtotal=gajiMingguan+tunjanganTransportasi;
        if(Kinerja>50){
            double misc = gajiMingguan*(Kinerja/100);
            subtotal=subtotal+misc;
        }
        double pajak =subtotal*0.025;
        double total =subtotal-pajak;
        return total;
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
