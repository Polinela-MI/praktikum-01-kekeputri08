package modul5;

public class PolimorfismeMain {
    public static void cetakSlipGaji(Karyawan karyawan) {

        double Total = karyawan.hitungGaji();
        double subtotal = Total - karyawan.getPajak();


        if (karyawan instanceof KaryawanParuhWaktu paruh) {

            paruh.getJamKerja();

            System.out.println(karyawan.getNik() + " - " + karyawan.getNama());
            System.out.println("Total jam kerja : " + KaryawanParuhWaktu.getJamKerja());

            System.out.println("_________________________________________");

            System.out.println("Gaji Pokok : " + karyawan.getgajiPokok());
            System.out.println("Tunjangan Transportasi : " + karyawan.getTunjanganTranportasi());
            System.out.println("Bonus : " + karyawan.getMisc());
            System.out.println("Pajak : " + karyawan.getPajak());
            System.out.println("Gaji Sebelum Pajak : " + subtotal);

            System.out.println("_________________________________________");

            System.out.println("Gaji yang diterima : " + Total);


        } else if (karyawan instanceof KaryawanPenuhWaktu penuh) {

            penuh.getJamKerja();

            System.out.println(karyawan.getNik() + " - " + karyawan.getNama());
            System.out.println("Total jam kerja : " + KaryawanPenuhWaktu.getJamKerja());

            System.out.println("__________________________________________");

            System.out.println("Gaji Pokok : " + karyawan.getgajiPokok());
            System.out.println("Tunjangan Transportasi : " + karyawan.getTunjanganTranportasi());
            System.out.println("Bonus : " + karyawan.getMisc());
            System.out.println("Pajak : " + karyawan.getPajak());
            System.out.println("Gaji Sebelum Pajak : " + subtotal);

            System.out.println("_________________________");

            System.out.println("Gaji yang diterima : " + Total);

        } else if (karyawan instanceof Manajer manajer) {

            manajer.getKinerja();

            System.out.println(karyawan.getNik() + " - " + karyawan.getNama());
            System.out.println("Total kinerja : "+ manajer.getKinerja());

            System.out.println("________________________________________");

            System.out.println("Gaji Pokok : " + karyawan.getgajiPokok());
            System.out.println("Tunjangan Transportasi : " + karyawan.getTunjanganTranportasi());
            System.out.println("Bonus : " + karyawan.getMisc());
            System.out.println("Pajak : " + karyawan.getPajak());
            System.out.println("Gaji Sebelum Pajak : " + subtotal);

            System.out.println("________________________________________");

            System.out.println("Gaji yang diterima : " + Total);


        }
    }
}
