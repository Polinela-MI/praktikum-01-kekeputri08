package modul4;

public class Manejer extends Karyawan{
    private int  Kinerja;

    Manejer(int nik, String nama, int gajiPokok) {
        super(nik, nama, gajiPokok);
        this.Kinerja = Kinerja;
    }

    public double hitunggaji(){
        double gajiMingguan;
        gajiMingguan= getgajiPokok()*20;
        double tunjanganTrans=gajiMingguan*0.5;
        double subtotal=gajiMingguan+tunjanganTrans;
        if(Kinerja>50){
            double bonus = gajiMingguan*(Kinerja/100);
            subtotal=subtotal+bonus;
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
