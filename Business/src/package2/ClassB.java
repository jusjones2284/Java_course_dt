package package2;

public class ClassB {

    public void publicMethod(){
        System.out.println("This is a public method of ClassB.");
        privateMethod();
    }

    private void privateMethod(){
        System.out.println("This is the private method of Classb");
    }

    protected void protectedMethod(){
        System.out.println("This is the protected method of class b");
    }
}
