package modul2;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

    public class Praktikum2 {
        public static void main(String[] args) {

            for (int i = 1; i < args.length; i += 3) {
                int NIK = Integer.parseInt(args[i]);
                String Nama = args[i + 1];
                int Gajipokok = Integer.parseInt(args[i + 2]);

                int Trans, Kerja, Total, belum_pajak, sudah_pajak;

                Trans = (int)(Gajipokok * 0.05);
                Kerja = (int)(Gajipokok * 0.1);

                belum_pajak = Gajipokok + Kerja + Trans;
                sudah_pajak = (int) (belum_pajak * 0.025);
                Total = belum_pajak - sudah_pajak;

                DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
                DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

                formatRp.setCurrencySymbol("Rp. ");
                formatRp.setMonetaryDecimalSeparator(',');
                formatRp.setGroupingSeparator('.');
                kursIndonesia.setDecimalFormatSymbols(formatRp);

                System.out.println(NIK + " - " + Nama + " - " + "Rp" + Total);

            }
        }
    }


