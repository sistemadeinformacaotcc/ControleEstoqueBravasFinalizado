package View;

import Conexao.ConectaBD;
import Conexao.ConexaoException;
import Control.DaoRelatorios;
import Model.ModelTable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


public class TelaRelIventMatPrimas extends javax.swing.JFrame {
    
    DaoRelatorios dr = new DaoRelatorios();
    ConectaBD con = new ConectaBD();
    
    public TelaRelIventMatPrimas() throws ConexaoException, SQLException{
        initComponents();
        con.conectar();
        preecherRelMateriaPrima("select * from produto order by codProdEntrada");
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton3Descricao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botao_tela_inicial = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Descricao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1MateriaPrima = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField1Codigo = new javax.swing.JTextField();
        jButton1NovaPesquisa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inventário das Matérias Primas");
        setMinimumSize(new java.awt.Dimension(619, 401));
        setPreferredSize(new java.awt.Dimension(619, 401));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3Descricao.setText("Gerar");
        jButton3Descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3DescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("INVENTÁRIO DAS MATÉRIAS PRIMAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        botao_tela_inicial.setText("Tela Inicial");
        botao_tela_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_tela_inicialActionPerformed(evt);
            }
        });
        getContentPane().add(botao_tela_inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        jLabel3.setText("Descrição:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        jTextField1Descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1DescricaoActionPerformed(evt);
            }
        });
        jTextField1Descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1DescricaoKeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 340, -1));

        jTable1MateriaPrima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1MateriaPrima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MateriaPrimaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1MateriaPrima);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 180));

        jLabel5.setText("Codigo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, -1));

        jTextField1Codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1CodigoKeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 70, -1));

        jButton1NovaPesquisa.setText("Nova Pesquisa");
        jButton1NovaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1NovaPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1NovaPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/BackgroundRelMatPrima.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                                                                                            
    private void botao_tela_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_tela_inicialActionPerformed
        new TelaPrincipal().setVisible(true);//que quer abrir
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_tela_inicialActionPerformed

    private void jTextField1DescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1DescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1DescricaoActionPerformed

    private void jButton3DescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3DescricaoActionPerformed
         try {
            // Busca por Cliente Especifico            
            con.conectar();
            
            dr.DaoRelatoriosInventMatPrima("select * from produto where codProdEntrada ="+jTextField1Codigo.getText());
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3DescricaoActionPerformed

    private void jButton1NovaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1NovaPesquisaActionPerformed

        jTextField1Codigo.setEnabled(true);
        jTextField1Descricao.setEnabled(true);
    }//GEN-LAST:event_jButton1NovaPesquisaActionPerformed

    private void jTable1MateriaPrimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MateriaPrimaMouseClicked
         String codProdEntrada = "" + jTable1MateriaPrima.getValueAt(jTable1MateriaPrima.getSelectedRow(), 0);
            jTextField1Codigo.setText(codProdEntrada);
            String produto = "" + jTable1MateriaPrima.getValueAt(jTable1MateriaPrima.getSelectedRow(), 1);
            jTextField1Descricao.setText(produto);

            jTextField1Codigo.setEnabled(false);
            jTextField1Descricao.setEnabled(false);
    }//GEN-LAST:event_jTable1MateriaPrimaMouseClicked

    private void jTextField1DescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1DescricaoKeyReleased
        try {
            preecherRelMateriaPrima("select * from produto where produto " + "like'%"+jTextField1Descricao.getText()+"%'");
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField1DescricaoKeyReleased

    private void jTextField1CodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1CodigoKeyReleased
        try {
            preecherRelMateriaPrima("select * from produto where codProdEntrada " + "like'%"+jTextField1Codigo.getText()+"%'");
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField1CodigoKeyReleased
public void preecherRelMateriaPrima(String Sql) throws ConexaoException, SQLException{
    ArrayList dados = new ArrayList();
    String [] colunas = new String[] {"COD","PRODUTO"};
    con.conectar();
    con.executaSql(Sql);
       try{
                    
           con.rs.first();
               do
                    { dados.add(new Object[]{con.rs.getString("codProdEntrada"),con.rs.getString("produto")});
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
       jTable1MateriaPrima.setModel(modelo);
       jTable1MateriaPrima.getColumnModel().getColumn(0).setMaxWidth(200);
       jTable1MateriaPrima.getColumnModel().getColumn(1).setMaxWidth(400);
       jTable1MateriaPrima.getTableHeader().setReorderingAllowed(false);
       jTable1MateriaPrima.setAutoResizeMode(jTable1MateriaPrima.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
       jTable1MateriaPrima.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       con.desconectar();
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
                    new TelaRelIventMatPrimas().setVisible(true);
                } catch (ConexaoException ex) {
                    Logger.getLogger(TelaRelIventMatPrimas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaRelIventMatPrimas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_tela_inicial;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1NovaPesquisa;
    private javax.swing.JButton jButton3Descricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1MateriaPrima;
    private javax.swing.JTextField jTextField1Codigo;
    private javax.swing.JTextField jTextField1Descricao;
    // End of variables declaration//GEN-END:variables
    
}
