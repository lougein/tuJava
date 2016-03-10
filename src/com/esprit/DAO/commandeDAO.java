package DAO;


import connexion.MyConnexion;
import entities.commande;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class commandeDAO {
        private final Connection cnx;
    private String s;

    public commandeDAO() {
        cnx = MyConnexion.getInstance();

    }

    public void insertNote(commande a) {

        String requete = "INSERT INTO `commande`(`numCommande`,`date`,`id`) VALUES "
                + " (?,?,?)";

        try {
            PreparedStatement ps = cnx.prepareStatement(requete);
            ps.setInt(3, a.getId());
            ps.setString(1, a.getNumCommande());
            ps.setDate(2, a.getDate());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(commandeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("validee");
    }

    public void deleteNote(int id_n) {
        String requete = "DELETE FROM `note1` WHERE id_n=?";

        try {
            PreparedStatement ps = cnx.prepareStatement(requete);
            ps.setInt(1, id_n);
            ps.executeUpdate();
            System.out.println("Note Supprimee");
        } catch (SQLException ex) {
            //Logger.getLogger(AnnonceDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

//    public void updateNote(commande a, Propriete nom) {
//        String requete = "UPDATE `note1` SET note=? WHERE id_n=+id_n AND Nom=+nom";
//        try {
//            PreparedStatement ps = connection.prepareStatement(requete);
//
//            ps.setInt(1, a.getNote());
//
//            ps.executeUpdate();
//            System.out.println("Mise à jour effectuée avec succès");
//        } catch (SQLException ex) {
//            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
//        }
//    }

//    public List<commande> DisplayAllCommande() {
//        List<commande> listnotes = new ArrayList<commande>();
//                commandeDAO pDao = new commandeDAO();
//
//        String requete = "SELECT * FROM `commande` ";
//        try {
//            Statement statement = cnx
//                    .createStatement();
//            ResultSet resultat = statement.executeQuery(requete);
//
//            while (resultat.next()) {
//                commande add = new commande();
////                add.setId_v(daop.afficherPersonne(resultat.getInt(2)));
////                add.setNom(pDao.afficherPropriete(resultat.getInt(3)));
//                add.setNumCommande(resultat.getString(1));
//                add.setDate(resultat.getDate(2));
//                add.setId(resultat.getInt(3));
//
//                listnotes.add(add);
//
//            }
//            return listnotes;
//        } catch (SQLException ex) {
//            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("erreur lors du chargement des Notes " + ex.getMessage());
//            return null;
//        }
//    }

    public void ApprouverCommentaire(int id) {
        String requete = "UPDATE `note1` SET `statut`=? WHERE id=" + id;
        int x = 1;
        try {
            PreparedStatement st = cnx.prepareStatement(requete);
            st.setInt(1, x);
            st.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }

    }

    public void updateEquipement(commande e, String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public List<commande> DisplayAllCommande( ) {
//                List<commande> listcommande = new ArrayList<commande>();
//        commandeDAO daop = new commandeDAO();
//
//        String requete = "SELECT * FROM `commande` ";
//        try {
//            Statement statement = cnx
//                    .createStatement();
//            ResultSet resultat = statement.executeQuery(requete);
//
//            while (resultat.next()) {
//                commande add = new commande();
//                commandeDAO pDao = new commandeDAO();
//                add.setId(resultat.getInt(1));
////                add.setId_v(daop.afficherPersonne(resultat.getInt(2)));
////                add.setNom(pDao.afficherPropriete(resultat.getInt(3)));
//                add.setNumCommande(resultat.getString(4));
//
//                listcommande.add(add);
//
//            }
//            return listcommande;
//        } catch (SQLException ex) {
//            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("erreur lors du chargement des Notes " + ex.getMessage());
//            return null;
//        }
//    }

    public List<commande> DisplayAllCommande() {

        List<commande> listedepots = new ArrayList<>();
        String requete = "select * from commande";
        try {
            Statement statement = cnx
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            commandeDAO commandeDAO1 = new commandeDAO();
            while (resultat.next()) {
                commande commande1 = new commande();
                commande1.setNumCommande(resultat.getString(1));
                commande1.setDate(resultat.getDate(2));
                commande1.setId(resultat.getInt(3));
//                stock.setDepot(depotDAO.findDepotById(resultat.getInt(4)));

                listedepots.add(commande1);
            }
            return listedepots;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
    }
 
}
