import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Iannuairelmp extends UnicastRemoteObject implements Iannuaire {
    private HashMap<String , String> contacts;
    public Iannuairelmp() throws RemoteException{
        contacts=new HashMap<>();
    }
    public void ajouter(String nom, String num) throws RemoteException{
        contacts.put(nom,num);
    }
    public String rechercher(String nom) throws RemoteException{
        return contacts.getOrDefault(nom,"numero non trouvé");
    }
    public List<String> Lister() throws RemoteException{
        return new ArrayList<>(contacts.keySet());
    }
}
