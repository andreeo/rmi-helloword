import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageImplementation extends UnicastRemoteObject implements Message {

    public MessageImplementation() throws RemoteException {
        super();
    }

    @Override
    public String msg(String msg) throws RemoteException {
        return msg;
    }
}
