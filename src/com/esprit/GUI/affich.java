/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import DAO.livraisonfDAO;
import entities.liraisonf;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import GUI.Modelliraisonf;
/**
 *
 * @author lenovo
 */
public class affich extends javax.swing.JFrame {

    /**
     * Creates new form affich
     */
    public affich() {
         initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Supprimer = new javax.swing.JButton();
        Retour = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTable2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTable2.setModel(new Modelliraisonf());
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/panier-supprimer-icone-4936-32.png"))); // NOI18N
        Supprimer.setText("SUPPRIMER");
        Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(Supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 160, 80));

        Retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home-80x80.png"))); // NOI18N
        Retour.setText("RETOUR");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });
        getContentPane().add(Retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 190, 80));

        jTable3.setModel(new Modelliraisonf());
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 400, 170));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Liste des livraisons");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 320, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/15803400-illustration-of-different-shopping-bag-on-sale-background-Stock-Vector.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerActionPerformed
        // TODO add your handling code here:
        livraisonfDAO lfDAO = new livraisonfDAO();
        if(jTable3.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Veuillez séléctionner une livraison !!"
                ,"Message",JOptionPane.INFORMATION_MESSAGE);

        }
         else{
            lfDAO.deleteLivraison((int) jTable3.getValueAt(jTable3.getSelectedRow(),0));
            affich e = new affich();
            setVisible(false);
            e.setVisible(true);  
        }
    }//GEN-LAST:event_SupprimerActionPerformed

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        // TODO add your handling code here:
        livraisonf a = new livraisonf();
this.setVisible(false);
a.setVisible(true);
    }//GEN-LAST:event_RetourActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(affich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(affich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(affich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(affich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new affich().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify 
 private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retour;
    private javax.swing.JButton Supprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables




    
}
