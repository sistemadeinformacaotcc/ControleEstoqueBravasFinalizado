package View;

import Conexao.ConexaoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaRelatorios extends javax.swing.JFrame {
    
    String seta_look="javax.swing.plaf.metal.MetalLookAndFeel";
    public TelaRelatorios(){
        
        initComponents();
         
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Relatorio_Prod_Final = new javax.swing.JButton();
        Relatorio_Mat_Prima = new javax.swing.JButton();
        Relatorio_Compras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Relatórios");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Relatórios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 11, -1, -1));

        Relatorio_Prod_Final.setText("INVENTÁRIO DOS PRODUTOS ACABADOS");
        Relatorio_Prod_Final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Relatorio_Prod_FinalActionPerformed(evt);
            }
        });
        getContentPane().add(Relatorio_Prod_Final, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 101, 348, 32));

        Relatorio_Mat_Prima.setText("INVENTÁRIO DAS MATÉRIAS PRIMAS");
        Relatorio_Mat_Prima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Relatorio_Mat_PrimaActionPerformed(evt);
            }
        });
        getContentPane().add(Relatorio_Mat_Prima, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 151, 348, 32));

        Relatorio_Compras.setText("HISTÓRICO DE COMPRAS");
        Relatorio_Compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Relatorio_ComprasActionPerformed(evt);
            }
        });
        getContentPane().add(Relatorio_Compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 51, 348, 32));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/BackgroundRelatorios.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, 0, -1, 200));

        getAccessibleContext().setAccessibleName("Cadastro de Matéria Prima e Produto Final");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                                                                                            
    private void Relatorio_Prod_FinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Relatorio_Prod_FinalActionPerformed
        try {
            TelaRelaIventProdFinais tpf = new TelaRelaIventProdFinais();//que quer abrir
            tpf.setVisible(true);
            dispose();
            // TODO add your handling code here:
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Relatorio_Prod_FinalActionPerformed

    private void Relatorio_Mat_PrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Relatorio_Mat_PrimaActionPerformed
        try {
            TelaRelIventMatPrimas tmp = new TelaRelIventMatPrimas();
            tmp.setVisible(true);
            dispose();
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Relatorio_Mat_PrimaActionPerformed

    private void Relatorio_ComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Relatorio_ComprasActionPerformed
        try {
            TelaRelaHistCompras th = new TelaRelaHistCompras();
            th.setVisible(true);
            dispose();
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Relatorio_ComprasActionPerformed
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorios().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Relatorio_Compras;
    private javax.swing.JButton Relatorio_Mat_Prima;
    private javax.swing.JButton Relatorio_Prod_Final;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    
    }
    
