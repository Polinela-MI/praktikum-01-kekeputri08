package modul2;

public class Person {
    //fied , instane variable
    String nama;
    //default constructor     //tidak memiliki parameter/argumen
    	public Person(){
    	nama = "jojon";
    }

    //overloading constructor  //memiliki parameter / argumen
   	public Person(String n){
            this.nama = nama;
   	}

       //mutator/setter method
    public void setnama(String nama){
            this.nama = nama;
    }

    //accessor/getter method
    public String getnama(){
            return nama;
    }

    	//method
    	public void sayHello(){
    	System.out.println("Holaa, nama saya" + nama);
  	}
    	}

// driver class
class Main{
    public static void main(String[] args){
        Person person = new Person();
        Person joko = new Person("Joko");

        System.out.println(person.nama);
        person.sayHello();

    }
}

