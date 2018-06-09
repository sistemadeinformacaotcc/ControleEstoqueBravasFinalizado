package View;

import Conexao.ConectaBD;
import Conexao.ConexaoException;
import Control.DaoClientes;
import Model.ModelTable;
import Model.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class TelaPesqRapCliente extends javax.swing.JFrame {
    
    Cliente cl = new Cliente();
    DaoClientes dc = new DaoClientes();
    ConectaBD con = new ConectaBD();
    Cliente model_cl = new Cliente();
    
    String seta_look="javax.swing.plaf.metal.MetalLookAndFeel";
    
    public TelaPesqRapCliente() throws ConexaoException, SQLException{
        initComponents();
        preecherTabelaCliente("select * from cliente c inner join vendas v on c.codCliente = v.id_Cliente inner join itensvendas_produto i on i.id_Venda = v.id_Venda inner join produtofinal p on p.codigo = i.id_ProdutoFinal order by dataVenda desc");
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1PesquisaCliente = new javax.swing.JTable();
        botao_venda_cli = new javax.swing.JButton();
        botao_tela_inicial = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField15Pesquisar = new javax.swing.JTextField();
        botao_telacadcli = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Busca Rápida de clientes");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Busca Rápida de Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 15, -1, -1));

        jTable1PesquisaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1PesquisaCliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, 1035, 222));

        botao_venda_cli.setText("Efetuar venda");
        botao_venda_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_venda_cliActionPerformed(evt);
            }
        });
        getContentPane().add(botao_venda_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 333, 150, 45));

        botao_tela_inicial.setText("Tela Inicial");
        botao_tela_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_tela_inicialActionPerformed(evt);
            }
        });
        getContentPane().add(botao_tela_inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 333, 170, 45));

        jLabel8.setText("Pesquisar:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 58, 74, -1));

        jTextField15Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15PesquisarActionPerformed(evt);
            }
        });
        jTextField15Pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField15PesquisarKeyReleased(evt);
            }
        });
        getContentPane().add(jTextField15Pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 55, 250, -1));

        botao_telacadcli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/usuarios.gif"))); // NOI18N
        botao_telacadcli.setText("Cadastrar Clientes");
        botao_telacadcli.setMaximumSize(new java.awt.Dimension(125, 41));
        botao_telacadcli.setMinimumSize(new java.awt.Dimension(125, 41));
        botao_telacadcli.setPreferredSize(new java.awt.Dimension(125, 41));
        botao_telacadcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_telacadcliActionPerformed(evt);
            }
        });
        getContentPane().add(botao_telacadcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 335, 175, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Cpf/Cnpj");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 50, 90, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Cliente");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 90, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/BackgroundPesqRapClientes.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                                                                                            
    private void botao_venda_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_venda_cliActionPerformed
        try {
            TelaVendas tv = new TelaVendas();
            tv.setVisible(true);
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaPesqRapCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaPesqRapCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_botao_venda_cliActionPerformed

    private void botao_tela_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_tela_inicialActionPerformed
         dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_tela_inicialActionPerformed

    private void jTextField15PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15PesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15PesquisarActionPerformed

    private void botao_telacadcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_telacadcliActionPerformed
        try {
            TelaCadCliente tc = new TelaCadCliente();
            tc.setVisible(true);
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaPesqRapCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaPesqRapCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       dispose();
    }//GEN-LAST:event_botao_telacadcliActionPerformed

    private void jTextField15PesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15PesquisarKeyReleased
                   if(jRadioButton1.isSelected()){          
                try {
                 preecherTabelaCliente("select * from cliente c inner join vendas v on c.codCliente = v.id_Cliente inner join itensvendas_produto i on i.id_Venda = v.id_Venda inner join produtofinal p on p.codigo = i.id_ProdutoFinal where cpf_Cnpj" + "like'%"+jTextField15Pesquisar.getText()+"%'");
             } catch (ConexaoException ex) {
                 Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
             }
           
      }else{
   
             try {
                 preecherTabelaCliente("select * from cliente c inner join vendas v on c.codCliente = v.id_Cliente inner join itensvendas_produto i on i.id_Venda = v.id_Venda inner join produtofinal p on p.codigo = i.id_ProdutoFinal where nome" + "like'%"+jTextField15Pesquisar.getText()+"%'");
             } catch (ConexaoException ex) {
                 Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
             }
                   }
    }//GEN-LAST:event_jTextField15PesquisarKeyReleased
public void preecherTabelaCliente(String Sql) throws ConexaoException, SQLException{
    ArrayList dados = new ArrayList();
    String [] colunas = new String[] {"COD VENDA","CLIENTE","PRODUTOS","DATA VENDA","QTD","VALOR PROD"};
    con.conectar();
    con.executaSql(Sql);
       try{
                    
           con.rs.first();
               do
                    { dados.add(new Object[]{con.rs.getString("id_venda"),con.rs.getString("nome"),con.rs.getString("produtoFinal"),con.rs.getString("dataVenda"),con.rs.getString("qtd_produto"),con.rs.getString("precoUnitario")});
                }while(con.rs.next());
       }catch (SQLException ex){
           
       } 
       
       DefaultTableCellRenderer rendererCentro = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.CENTER);
       DefaultTableCellRenderer rendererDireita = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.RIGHT);
       DefaultTableCellRenderer rendererEsquerda = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.LEFT);
       ModelTable modelo = new ModelTable(dados, colunas);
       jTable1PesquisaCliente.setModel(modelo);
       jTable1PesquisaCliente.getColumnModel().getColumn(0).setMaxWidth(100);
       jTable1PesquisaCliente.getColumnModel().getColumn(1).setMaxWidth(250);
       jTable1PesquisaCliente.getColumnModel().getColumn(2).setMaxWidth(350);
       jTable1PesquisaCliente.getColumnModel().getColumn(3).setMaxWidth(130);
       jTable1PesquisaCliente.getColumnModel().getColumn(4).setMaxWidth(100);
        jTable1PesquisaCliente.getColumnModel().getColumn(5).setMaxWidth(100);
       jTable1PesquisaCliente.getTableHeader().setReorderingAllowed(false);
       jTable1PesquisaCliente.setAutoResizeMode(jTable1PesquisaCliente.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
       jTable1PesquisaCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
                    new TelaPesqRapCliente().setVisible(true);
                } catch (ConexaoException ex) {
                    Logger.getLogger(TelaPesqRapCliente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaPesqRapCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_tela_inicial;
    private javax.swing.JButton botao_telacadcli;
    private javax.swing.JButton botao_venda_cli;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1PesquisaCliente;
    private javax.swing.JTextField jTextField15Pesquisar;
    // End of variables declaration//GEN-END:variables
    
}
