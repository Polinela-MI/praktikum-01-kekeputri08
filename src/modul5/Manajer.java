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
        misc=gajiMingguan+tunjanganTransportasi;
        if(Kinerja>50){
            double bonus = gajiMingguan*(Kinerja/100);
            misc=misc+bonus;
        }
        double pajak =misc*0.025;
        double total =misc-pajak;
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
