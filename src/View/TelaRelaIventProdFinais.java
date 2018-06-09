package View;

import Conexao.ConectaBD;
import Conexao.ConexaoException;
import Control.DaoRelatorios;
import Model.ModelTable;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


public class TelaRelaIventProdFinais extends javax.swing.JFrame {
    
    DaoRelatorios dr = new DaoRelatorios();
    ConectaBD con = new ConectaBD();
    
    public TelaRelaIventProdFinais() throws ConexaoException, SQLException{
    
        initComponents();
    con.conectar();
        preecherRelProdutoFinal("select * from produtofinal where codigo");
                
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        botao_tela_inicial = new javax.swing.JButton();
        jButton2GerarDescricao = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Descricao = new javax.swing.JTextField();
        jButton1NovaPesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1ProdutoFinal = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField2Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Relatório Inventário dos Produtos Acabados");
        setMinimumSize(new java.awt.Dimension(649, 443));
        setPreferredSize(new java.awt.Dimension(649, 443));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("INVENTÁRIO DOS PRODUTOS ACABADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        botao_tela_inicial.setText("Tela Inicial");
        botao_tela_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_tela_inicialActionPerformed(evt);
            }
        });
        getContentPane().add(botao_tela_inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        jButton2GerarDescricao.setText("Gerar");
        jButton2GerarDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2GerarDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2GerarDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, 30));

        jLabel3.setText("Descrição:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

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
        getContentPane().add(jTextField1Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 340, 30));

        jButton1NovaPesquisa.setText("Nova Pesquisa");
        jButton1NovaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1NovaPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1NovaPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 120, -1));

        jTable1ProdutoFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1ProdutoFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1ProdutoFinalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1ProdutoFinal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 460, 240));

        jLabel5.setText("Codigo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextField2Codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2CodigoKeyReleased(evt);
            }
        });
        getContentPane().add(jTextField2Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 80, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/BackgrounRelIventProdFinal.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                                                                                            
    private void botao_tela_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_tela_inicialActionPerformed
       
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_tela_inicialActionPerformed

    private void jTextField1DescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1DescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1DescricaoActionPerformed

    private void jButton2GerarDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2GerarDescricaoActionPerformed
       try {
            // Busca por Cliente Especifico            
            con.conectar();
            
            dr.DaoRelatoriosInventProdFinal("select * from cliente c inner join vendas v on c.codCliente = v.id_Cliente inner join itensvendas_produto i on i.id_Venda = v.id_Venda inner join produtofinal p on p.codigo = i.id_ProdutoFinal where  p.codigo ="+jTextField2Codigo.getText());
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
                                      
    }//GEN-LAST:event_jButton2GerarDescricaoActionPerformed

    private void jButton1NovaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1NovaPesquisaActionPerformed
        jTextField2Codigo.setText("");
        jTextField1Descricao.setText("");       
    }//GEN-LAST:event_jButton1NovaPesquisaActionPerformed

    private void jTable1ProdutoFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1ProdutoFinalMouseClicked
       
            String codigo = "" + jTable1ProdutoFinal.getValueAt(jTable1ProdutoFinal.getSelectedRow(), 0);
            jTextField2Codigo.setText(codigo);
            String produtoFinal = "" + jTable1ProdutoFinal.getValueAt(jTable1ProdutoFinal.getSelectedRow(), 1);
            jTextField1Descricao.setText(produtoFinal);

            jTextField2Codigo.setEnabled(false);
            jTextField1Descricao.setEnabled(false);
       
    }//GEN-LAST:event_jTable1ProdutoFinalMouseClicked

    private void jTextField1DescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1DescricaoKeyReleased
         try {
            preecherRelProdutoFinal("select * from produtofinal where produtoFinal " + "like'%"+jTextField1Descricao.getText()+"%'");
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField1DescricaoKeyReleased

    private void jTextField2CodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2CodigoKeyReleased
        try {
            preecherRelProdutoFinal("select * from produtoFinal where codigo " + "like'%"+jTextField2Codigo.getText()+"%'");
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField2CodigoKeyReleased

    public void preecherRelProdutoFinal(String Sql) throws ConexaoException, SQLException{
    ArrayList dados = new ArrayList();
    String [] colunas = new String[] {"COD","PRODUTO"};
    con.conectar();
    con.executaSql(Sql);
       try{
                    
           con.rs.first();
               do
                    { dados.add(new Object[]{con.rs.getString("codigo"),con.rs.getString("produtoFinal")});
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
       jTable1ProdutoFinal.setModel(modelo);
       jTable1ProdutoFinal.getColumnModel().getColumn(0).setMaxWidth(150);
       jTable1ProdutoFinal.getColumnModel().getColumn(1).setMaxWidth(450);
       jTable1ProdutoFinal.getTableHeader().setReorderingAllowed(false);
       jTable1ProdutoFinal.setAutoResizeMode(jTable1ProdutoFinal.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
       jTable1ProdutoFinal.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
                    new TelaRelaIventProdFinais().setVisible(true);
                } catch (ConexaoException ex) {
                    Logger.getLogger(TelaRelaIventProdFinais.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaRelaIventProdFinais.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_tela_inicial;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1NovaPesquisa;
    private javax.swing.JButton jButton2GerarDescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1ProdutoFinal;
    private javax.swing.JTextField jTextField1Descricao;
    private javax.swing.JTextField jTextField2Codigo;
    // End of variables declaration//GEN-END:variables
    
}
