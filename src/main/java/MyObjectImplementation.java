import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyObjectImplementation extends UnicastRemoteObject implements MyObject {

    public MyObjectImplementation() throws RemoteException {
        super();
    }

    @Override
    public String custom() throws RemoteException {
        return "This is a object";
    }
}
