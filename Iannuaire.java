import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
public interface Iannuaire extends Remote {
    void ajouter(String nom,String num) throws RemoteException;
    String rechercher(String nom) throws RemoteException;
    List<String> Lister() throws RemoteException;

}
