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
        double subtotal=gajiMingguan+tunjanganTransportasi;
        if(jamKerja>40){
            double lembur =(jamKerja-40)*(getgajiPokok()+5000);
            subtotal=subtotal+lembur;
        }else if(jamKerja<40){
            double misc=(40-jamKerja)*getgajiPokok();
            subtotal=subtotal-misc;
        }
        pajak = subtotal+0.025;
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
