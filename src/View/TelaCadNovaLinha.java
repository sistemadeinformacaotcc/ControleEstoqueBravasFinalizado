package View;

import Conexao.ConectaBD;
import Conexao.ConexaoException;
import Conexao.DaoException;
import Control.DaoLinha;
import Model.DadosInvalidoException;
import Model.Linha;
import Model.ModelTable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class TelaCadNovaLinha extends javax.swing.JFrame {
    
    String seta_look="javax.swing.plaf.metal.MetalLookAndFeel";
    
    Linha linha = new Linha();
    DaoLinha dl = new DaoLinha();
    ConectaBD con = new ConectaBD();
    
    public TelaCadNovaLinha() throws ConexaoException, SQLException{
        
        initComponents();
    con.conectar();
 preecherTabelaLinha("select * from linha order by id_linha");
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField6Linha = new javax.swing.JTextField();
        botao_Excluir = new javax.swing.JButton();
        botao_Cadastrar = new javax.swing.JButton();
        botao_sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Linha = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Controle de Estoque");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Nova Linha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setText("Linha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jTextField6Linha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6LinhaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6Linha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 150, -1));

        botao_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/delete.gif"))); // NOI18N
        botao_Excluir.setToolTipText("Novo registro");
        botao_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_ExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botao_Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        botao_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/gravar_registro.gif"))); // NOI18N
        botao_Cadastrar.setToolTipText("Grava o registro");
        botao_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_CadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        botao_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/sair.png"))); // NOI18N
        botao_sair.setBorder(null);
        botao_sair.setBorderPainted(false);
        botao_sair.setContentAreaFilled(false);
        botao_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_sairActionPerformed(evt);
            }
        });
        getContentPane().add(botao_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 50, 50));

        jTable1Linha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1Linha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1LinhaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1Linha);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 190, 93));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/BackgroundCadNovaLinhaa.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 220));

        getAccessibleContext().setAccessibleName("Cadastro de Nova Linha");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                                                                                            
    private void jTextField6LinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6LinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6LinhaActionPerformed

    private void botao_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_ExcluirActionPerformed
             //Confirmação de Exclusão
            int confirmar = JOptionPane.showConfirmDialog(null, "Deseja Realmente Excluir a linha "+jTextField6Linha.getText(),"ATENÇÂO", JOptionPane.YES_NO_OPTION );
            
            if(confirmar == JOptionPane.YES_OPTION){
        
                    linha.setLinha(jTextField6Linha.getText());
                try {
                    // Codigo Excluir Usuario
                    dl.Excluir(linha);
                    Limpar();
                } catch (ConexaoException ex) {
                    Logger.getLogger(TelaCadNovaLinha.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DaoException ex) {
                    Logger.getLogger(TelaCadNovaLinha.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DadosInvalidoException ex) {
                    Logger.getLogger(TelaCadNovaLinha.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        try {
            preecherTabelaLinha("select * from linha order by id_linha");
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaCadNovaLinha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadNovaLinha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botao_ExcluirActionPerformed
            
    private void botao_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_CadastrarActionPerformed
        try{
            
        linha.setLinha(jTextField6Linha.getText().trim());
           
        dl.Cadastrar(linha);
            
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaCadNovaLinha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            Logger.getLogger(TelaCadNovaLinha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DadosInvalidoException ex) {
            Logger.getLogger(TelaCadNovaLinha.class.getName()).log(Level.SEVERE, null, ex);
        }
        Limpar();
        try {
            preecherTabelaLinha("select * from linha order by id_linha");
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaCadNovaLinha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadNovaLinha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botao_CadastrarActionPerformed

    public void preecherTabelaLinha(String Sql) throws ConexaoException, SQLException{
    ArrayList dados = new ArrayList();
    String [] colunas = new String[] {"LINHA"};
    con.conectar();
    con.executaSql(Sql);
       try{
                    
           con.rs.first();
           do{  
               dados.add(new Object[]{con.rs.getString("linha")});
              }while(con.rs.next()); 
       }catch (SQLException ex){
           //JOptionPane.showMessageDialog(null, "DADOS NÃO ENCONTRADO");
       } 
       DefaultTableCellRenderer rendererCentro = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.CENTER);
       DefaultTableCellRenderer rendererDireita = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.RIGHT);
       DefaultTableCellRenderer rendererEsquerda = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.LEFT);
       ModelTable modelo = new ModelTable(dados, colunas);
       jTable1Linha.setModel(modelo);
       jTable1Linha.getColumnModel().getColumn(0).setMaxWidth(250);
       jTable1Linha.getTableHeader().setReorderingAllowed(false);
       jTable1Linha.setAutoResizeMode(jTable1Linha.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
       jTable1Linha.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       con.desconectar();
}
    private void botao_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_sairActionPerformed
        dispose();
    }//GEN-LAST:event_botao_sairActionPerformed

    private void jTable1LinhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1LinhaMouseClicked
        String linha = "" + jTable1Linha.getValueAt(jTable1Linha.getSelectedRow(), 0);
        jTextField6Linha.setText(linha);
    }//GEN-LAST:event_jTable1LinhaMouseClicked
    public void Limpar(){
        jTextField6Linha.setText("");
    }
    
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
                try {
                    new TelaCadNovaLinha().setVisible(true);
                } catch (ConexaoException ex) {
                    Logger.getLogger(TelaCadNovaLinha.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCadNovaLinha.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_Cadastrar;
    private javax.swing.JButton botao_Excluir;
    private javax.swing.JButton botao_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1Linha;
    private javax.swing.JTextField jTextField6Linha;
    // End of variables declaration//GEN-END:variables
    
    }
    
