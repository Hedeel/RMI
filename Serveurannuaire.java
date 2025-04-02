import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Serveurannuaire {
    public static void main(String[]args){
        try{
            Iannuairelmp ann= new Iannuairelmp();
            Registry reg= LocateRegistry.createRegistry(1099);
            reg.rebind("annuaireservice",ann);
            System.out.println("serveur rmi demarre");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
