package interfac;

public class Dell implements Laptop{
    @Override
    public void copy() {
        System.out.println("copy code Dell");
    }

    @Override
    public void paste() {
        System.out.println("paste code Dell");
    }

    @Override
    public void keyboard() {
        System.out.println("keyboard code Dell");
    }
}
