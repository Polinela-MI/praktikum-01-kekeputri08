package modul5;



public class KaryawanParuhWaktu extends Karyawan {
    private int jamKerja;
    KaryawanParuhWaktu( String nama, int gajiPokok) {
        super(nama, gajiPokok);
        this.jamKerja = jamKerja;

    }
    public double hitunggaji(){
        double gajiMingguan;
        gajiMingguan= getgajiPokok()*20;
        tunjanganTransportasi=gajiMingguan*0.5;
        misc=gajiMingguan+tunjanganTransportasi;
        if(jamKerja>20){
            double lembur =(jamKerja-20)*(getgajiPokok()+2000);
            misc=misc+lembur;
        }else if(jamKerja<20){
            double penalti=(20-jamKerja)*getgajiPokok();
            misc=misc-penalti;
        }
        pajak = misc+0.025;
        double total = misc-pajak;
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

