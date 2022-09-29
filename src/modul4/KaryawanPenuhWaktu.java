package modul4;

public class KaryawanPenuhWaktu  extends Karyawan{
        private int jamKerja;

    KaryawanPenuhWaktu(int nik, String nama, int gajiPokok) {
        super(nik, nama, gajiPokok);
        this.jamKerja = jamKerja;
    }

    public double hitunggaji(){
        double gajiMingguan;
        gajiMingguan= getgajiPokok()*40;
        double tunjanganTrans=gajiMingguan*0.5;
        double subtotal=gajiMingguan+tunjanganTrans;
        if(jamKerja>40){
            double lembur =(jamKerja-40)*(getgajiPokok()+5000);
            subtotal=subtotal+lembur;
        }else if(jamKerja<40){
            double penalti=(40-jamKerja)*getgajiPokok();
            subtotal=subtotal-penalti;
        }
        double pajak = subtotal+0.025;
        double total = subtotal-pajak;
        return total;
    }

    //sett
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    //gett
    public int getJamKerja() {
        return jamKerja;
    }
}