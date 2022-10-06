package modul5;



public class KaryawanPenuhWaktu  extends Karyawan {
    private int jamKerja;

    KaryawanPenuhWaktu(String nama, int gajiPokok) {
        super(nama, gajiPokok);
        this.jamKerja = jamKerja;
    }

    public double hitunggaji(){
        double gajiMingguan;
        gajiMingguan= getgajiPokok()*40;
        tunjanganTransportasi=gajiMingguan*0.5;
        misc=gajiMingguan+tunjanganTransportasi;
        if(jamKerja>40){
            double lembur =(jamKerja-40)*(getgajiPokok()+5000);
            misc=misc+lembur;
        }else if(jamKerja<40){
            double penalti=(40-jamKerja)*getgajiPokok();
            misc=misc-penalti;
        }
        pajak = misc+0.025;
        double total = misc-pajak;
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
