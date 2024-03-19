import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloWorldImplementation extends UnicastRemoteObject implements HelloWorld {

    public HelloWorldImplementation() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello world my friend";
    }
}
