package modul3;

public class Praktikum3 {
    int nik;
    String nama;
    int gapok;
    int hadir;

    //overloading constructor
    public Praktikum3(int nik, String nama, int gapok, int hadir){
        this.nik=nik;
        this.nama=nama;
        this.gapok=gapok;
    }

    public int hitungGaji(){

        int Trans = (int)(gapok * 0.05);
        int Kerja = (int)(gapok * 0.1);

        int Sebelum_Pajak = gapok + Kerja + Trans;
        int Sesudah_Pajak = (int) (Sebelum_Pajak * 0.025);
        int Total = Sebelum_Pajak - Sesudah_Pajak;
        return Total;
    }
}

public class main{
    public static void main(String[] args){
        ArrayList<Integer> nikList = new ArrayList<Integer>();

        for(int i=1; i<args.length; i+=3){
            int nik =args[i];
            String nama = args[i+1];
            int gaji =args[i+2];

            if(nikList.contains(nik)){
                Praktikum3 p = new Praktikum3(nik, nama, gaji, hadir);
                nikList.add(nik);
                System.out.println()

            }

        }
    }
}