package abstraction;

public abstract class SampleAc implements ALaptop{

    @Override
    public void copy() {
        System.out.println("copy code");
    }

    @Override
    public void cut() {
        System.out.println("cut code");
    }

    public abstract void paste();

    public abstract void keyboard();
}
