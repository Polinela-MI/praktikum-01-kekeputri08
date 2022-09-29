package modul4;

public class latihan1 {
    String nama;

    void sapa(){
        System.out.println("Halo, saya" + nama );
    }
}
class Student extends latihan1 {
    String npm;
    String major;

    @Override
    void sapa() {
        super.sapa();
        System.out.println("Saya Mahasiswa" + major);
    }
}
class main{
    public static void main(String[] args){
        latihan1 joko = new latihan1();
        joko.nama = "Joko";
        joko.sapa();

        Student dodo = new Student();
        dodo.nama = "Widodo";
        dodo.npm = "221565";
        dodo.major = "ilmu komputer";
        dodo.sapa();
    }
}
