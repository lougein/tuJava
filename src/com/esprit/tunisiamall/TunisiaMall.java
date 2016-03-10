/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiamall;

import DAO.commandeDAO;
import DAO.livraisonfDAO;
import entities.commande;
import entities.liraisonf;
import java.sql.Date;
import java.util.List;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author lenovo
 */
public class TunisiaMall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        liraisonf lf = new liraisonf("lougein12", "ferchichi20", "esprit", "22012433");
        livraisonfDAO lfDAO = new livraisonfDAO();
        int id = 0;
     lfDAO.deleteLivraison( id);

//       List<liraisonf> m1=lfDAO.DisplayAlllivraison();
     
//       System.out.println(m1);
        //lfDAO.updatelivraison(lf,"lougein1" );
        Date d = new Date(2016);
        commande cf = new commande("3", 3,  d);
         commandeDAO cfDAO = new commandeDAO();
         //cfDAO.insertNote(cf);
        //List<commande>c1=cfDAO.DisplayAllCommande();
    }
    
}
