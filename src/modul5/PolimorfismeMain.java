package modul5;

public class PolimorfismeMain {
    public static void cetakSlipGaji(Karyawan karyawan{
        
        double Total = karyawan.hitungGaji();
        double subtotal = Total - karyawan.getPajak();

        System.out.println(karyawan.getNik() + " - " + karyawan.getNama());
        System.out.println("Total jam kerja : " + );

        System.out.println("---");

        System.out.println("Gaji Pokok : "+ karyawan.getgajiPokok());
        System.out.println("Tunjangan Transportasi : " + karyawan.getTunjanganTranportasi());
        System.out.println("Bonus : " + karyawan.getMisc());
        System.out.println("Pajak :" + karyawan.getPajak());
        System.out.println("Gaji Sebelum Pajak : " + subtotal);

        System.out.println("----");

        System.out.println("Gaji yang Diterima :" + Total);


    }
}
