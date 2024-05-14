package java9;

interface PrivateInterface {
    void publicMethod();

    // Can only be used within the interface
    private void privateMethod() {
        System.out.println("Private method in interface");
    }

    default void defaultMethod() {
        privateMethod();
    }
}
