import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            HelloWorldImplementation hw = (HelloWorldImplementation) Naming.lookup("HelloWorld");
            MessageImplementation message = (MessageImplementation) Naming.lookup("Message");
            MyObjectImplementation myObject = (MyObjectImplementation) Naming.lookup("MyObject");

            System.out.println("Hello World: " + hw.sayHello());
            System.out.println("Message: " + message.msg("Custom message"));
            System.out.println("MyObject: " + myObject.custom());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
