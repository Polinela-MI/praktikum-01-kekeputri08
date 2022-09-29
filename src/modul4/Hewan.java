package modul4;

class Hewan{
    int jumlahKaki;

    Hewan() {
        this.jumlahKaki = 0;
        System.out.println("Saya adalah Hewan tak berkaki.");
    }


    Hewan(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
        System.out.print("Saya adalah Hewan");
        System.out.print("jumlah kaki saya:" + this.jumlahKaki);
    }
}
     class Ayam extends Hewan{
        Ayam(){
            System.out.println("Tapi Saya adalah Ayam");
        }

        Ayam(int jumlahKaki){
            System.out.println("Saya Ayam juga lho");
        }
    }


class InheritanceHewanMain{
    public static void main(String[] args){
       Ayam kaefsi = new Ayam();
           System.out.println("=======");
           Ayam kalkun = new Ayam(2);
       }
    }