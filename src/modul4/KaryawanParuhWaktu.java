package modul4;

public class KaryawanParuhWaktu extends Karyawan {
    private int jamKerja;
    KaryawanParuhWaktu(int nik, String nama, int gajiPokok) {
        super(nik, nama, gajiPokok);
        this.jamKerja = jamKerja;
    }
    public double hitunggaji(){
        double gajiMingguan;
        gajiMingguan= getgajiPokok()*20;
        double tunjanganTrans=gajiMingguan*0.5;
        double subtotal=gajiMingguan+tunjanganTrans;
        if(jamKerja>20){
            double lembur =(jamKerja-20)*(getgajiPokok()+2000);
            subtotal=subtotal+lembur;
        }else if(jamKerja<20){
            double penalti=(20-jamKerja)*getgajiPokok();
            subtotal=subtotal-penalti;
        }
        double pajak = subtotal+0.025;
        double total = subtotal-pajak;
        return total;
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

