package interfac;

public interface Laptop {

    public void copy();

    public void paste();

    public void keyboard();

    // introduced in java8
    default void capture() {
        commonCode();
        System.out.println("dafault capture");
    }

    static void security() {
        commonCode();
        System.out.println("dafault security");
    }

    //introduced in java9 for code resuability
    private static void commonCode() {
        System.out.println("common code");
    }
}
