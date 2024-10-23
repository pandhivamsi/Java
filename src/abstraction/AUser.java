package abstraction;

public class AUser {

    public static void main(String[] args) {

        ALenova al = new ALenova();
        al.keyboard();
        al.paste();
        al.copy();
        al.cut();
        ADell d = new ADell();
        d.keyboard();
        d.copy();
        d.paste();
        d.cut();
    }
}
