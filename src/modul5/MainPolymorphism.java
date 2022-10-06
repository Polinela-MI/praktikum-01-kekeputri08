package modul4.modul5;

class A {
    int a = 1;
    String b = "squeeze";
    void sayHello(){
        System.out.println("Hai");
    }
}

class B extends A{
    int a = 5;
    void sayHello(){
        a = 2;
        System.out.println("Halloo...");
    }
}

class C extends A{
    int c = 7;
    void sayHello(){
        System.out.println("Holaa");
        a = 8;
    }
}

public class MainPolymorphism {
    public static void main(String[] args){
        A foo = new A();
        A bar = new C();
        A gee = new B();

        B top = (B) gee;
        C bet = (C) bar;
        System.out.println(foo.a);
        System.out.println(gee.a);
        System.out.println(bar.b);
        System.out.println(top.a);
        System.out.println(bet.a);
        foo.sayHello();
        top.sayHello();
        gee.sayHello();
        bar.sayHello();
        System.out.println(bar.a);
        System.out.println(top.a);
        System.out.println(bet.a);
        System.out.println(gee.a);
    }
}
