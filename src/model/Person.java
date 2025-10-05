package model;

public abstract class Person {
    protected String name;
    protected String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Abstract method
    public abstract void displayInfo();

    // Final method (cannot be overridden)
    public final void finalMethodExample() {
        System.out.println("This is a final method in Person class.");
    }

    // finalize example
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called before object is garbage collected.");
        super.finalize();
    }
}
