package modul3;

public class coba {
    public static void main(String[] args){
        String s = "Halo-Halo Bandung";

        String[] hasilSplit = s.split(" ");

        for (String s1 : hasilSplit) {
            System.out.println(s1);
        }
    }
}
