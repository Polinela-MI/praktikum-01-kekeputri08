package modul4.modul5;

public class Hewan {
}
class Ayam extends Hewan{
}
class Kucing extends Hewan{
}
class Iguana extends Hewan {
}


class Piaraan{
    static void main(String[] args){
        Hewan makhluk = new Hewan();
        Hewan polo = new Ayam();
        Hewan cimoy = new Kucing();
        Hewan reptil = new Iguana();

//Casting ke tipe yang sebenarnya
        Ayam newPolo = (Ayam) polo;
        Kucing momoy = (Kucing) cimoy;
        Iguana blizz = (Iguana) reptil;

//Contoh salah:
        Iguana snowy = (Iguana) polo;
    }
}

