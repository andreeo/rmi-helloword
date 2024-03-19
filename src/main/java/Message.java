import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Message extends Remote {
    String msg(String msg) throws RemoteException;
}
