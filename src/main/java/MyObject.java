import java.rmi.Remote;
import java.rmi.RemoteException;
public interface MyObject extends Remote {
    String custom() throws RemoteException;
}
