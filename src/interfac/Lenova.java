package interfac;

public class Lenova implements Laptop{
    @Override
    public void copy() {
        System.out.println("copy code lenova");
    }

    @Override
    public void paste() {
        System.out.println("paste code lenova");
    }

    @Override
    public void keyboard() {
        System.out.println("paste code lenova");
    }

    @Override
    public void capture() {
        System.out.println("Leno capture");
    }
}
