/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.commandeDAO;
import java.util.List;
import entities.commande;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lenovo
 */
public class modelcommande extends AbstractTableModel{
 List<commande> p;
   // EquipementDAO eq= new EquipementDAO();
    String[] entete = {"numCommande","date","id"} ;
  public  modelcommande()
    {
            commandeDAO eq = new commandeDAO ();
        p=eq.DisplayAllCommande();
    }
    @Override
    public int getRowCount() {
        return p.size(); //To change body of generated methods, choose Tools | Templates.
    }
       public String getColumnName(int Column)
   {
       return entete[Column];
   }
@Override
    public int getColumnCount() {
        return entete.length; 
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex){
           case 0:
                return p.get(rowIndex).getId();
            case 1 :
                return p.get(rowIndex).getNumCommande();
            case 2:
                return p.get(rowIndex).getDate();
      default:
                return null;
        } //To change body of generated methods, choose Tools | Templates.
    }
    
}
