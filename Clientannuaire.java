import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
public class Clientannuaire {
    public static void main(String[]args) {
        try{
            Registry reg=LocateRegistry.getRegistry("localhost",1099);
            Iannuaire annu=(Iannuaire) reg.lookup("annuaireservice");

            Scanner scan=new Scanner(System.in);
            while (true){
                System.out.println("1: ajouter contact");
                System.out.println("2: rechercher numéro");
                System.out.println("3: lister contacts");
                System.out.println("4: quitter");
                System.out.print("choix : ");
                int choix=scan.nextInt();
                scan.nextLine();
                switch (choix){
                    case 1:
                        System.out.println("nom:");
                        String nom=scan.nextLine();
                        System.out.println("numero:");
                        String num=scan.nextLine();
                        annu.ajouter(nom,num);
                        System.out.println("contact ajoute");
                        break;
                    case 2:
                        System.out.println("nom:");
                        String rechnom=scan.nextLine();
                        System.out.println("numero :" + annu.rechercher(rechnom));
                        break;
                    case 3:
                        System.out.println("concats enregistres:"+annu.Lister());
                        break;
                    case 4:
                        scan.close();
                    default:
                        System.out.println("choix invalide");
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
