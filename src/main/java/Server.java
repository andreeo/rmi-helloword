import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(9099);

            HelloWorldImplementation hw = new HelloWorldImplementation();
            MessageImplementation message = new MessageImplementation();
            MyObjectImplementation myObject = new MyObjectImplementation();

            registry.rebind("HelloWorld", hw);
            registry.rebind("Message", message);
            registry.rebind("MyObject", myObject);

            System.out.println("Registered objects in the RMI registry");

        } catch (Exception e) {
            System.err.printf("Error: " +e.getMessage());
        }
    }
}
