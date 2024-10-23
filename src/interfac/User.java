package interfac;

public class User {

    public static void main(String[] args) {
        Lenova l = new Lenova();
        l.copy();
        Dell d = new Dell();
        d.paste();
        d.keyboard();
        l.capture();
        Laptop.security();
    }
}
