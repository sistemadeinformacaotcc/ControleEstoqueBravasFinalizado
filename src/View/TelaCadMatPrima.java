package View;

import Conexao.ConectaBD;
import Conexao.ConexaoException;
import Conexao.DaoException;
import Control.DaoProdutos;
import Model.DadosInvalidoException;
import Model.DataInvalidaException;
import Model.ModelTable;
import Model.Produto;
import Model.ProdutoJaExisteException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class TelaCadMatPrima extends javax.swing.JFrame {
    
    Produto pro = new Produto();
    DaoProdutos dp = new DaoProdutos();
    Produto pd = new Produto();
    ConectaBD con = new ConectaBD();
    Produto model_Pro = new Produto();
    int codProduto;
    
    String seta_look="javax.swing.plaf.metal.MetalLookAndFeel";
    
    public TelaCadMatPrima() throws ConexaoException, SQLException{
        
        initComponents();
        preecherTabelaProduto("select * from produto order by codProdEntrada"); 
     con.conectar();
            
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6Produto = new javax.swing.JTextField();
        jTextField7Codigo = new javax.swing.JTextField();
        jTextField8Qtd = new javax.swing.JTextField();
        jTextField9QtdMin = new javax.swing.JTextField();
        botao_Novo = new javax.swing.JButton();
        botao_gravar = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        botao_tela_inicial = new javax.swing.JButton();
        jButton1EditarQtd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Produto = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField15PesquisarProduto = new javax.swing.JTextField();
        jRadioButton1Codigo = new javax.swing.JRadioButton();
        jRadioButton2Produto = new javax.swing.JRadioButton();
        jButton2Subtrair = new javax.swing.JButton();
        jButton1Soma = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Controle de Estoque");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Matéria Prima");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 11, -1, -1));

        jLabel2.setText("Codigo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        jLabel3.setText("Descrição:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, 20));

        jLabel7.setText("Quantidade ( Kg ):");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        jLabel9.setText("Quantidade mínima:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, 20));

        jTextField6Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 430, -1));

        jTextField7Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7CodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 89, -1));

        jTextField8Qtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8QtdActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8Qtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 70, 30));

        jTextField9QtdMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9QtdMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9QtdMinActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9QtdMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 70, -1));

        botao_Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/novo_registro.gif"))); // NOI18N
        botao_Novo.setToolTipText("Novo registro");
        botao_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_NovoActionPerformed(evt);
            }
        });
        getContentPane().add(botao_Novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 206, -1, 47));

        botao_gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/gravar_registro.gif"))); // NOI18N
        botao_gravar.setToolTipText("Grava o registro");
        botao_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_gravarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_gravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 206, -1, 47));

        botao_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/alterar_registro.gif"))); // NOI18N
        botao_alterar.setToolTipText("Alterar");
        botao_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 206, -1, 47));

        botao_tela_inicial.setText("Tela Inicial");
        botao_tela_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_tela_inicialActionPerformed(evt);
            }
        });
        getContentPane().add(botao_tela_inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 206, 170, 47));

        jButton1EditarQtd.setForeground(new java.awt.Color(255, 0, 0));
        jButton1EditarQtd.setText("Editar");
        jButton1EditarQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1EditarQtdActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1EditarQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, -1));

        jTable1Produto.setModel(new javax.swing.table.DefaultTableModel(
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
                {}
            },
            new String [] {

            }
        ));
        jTable1Produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1ProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1Produto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 264, 789, 173));

        jLabel8.setText("Pesquisar:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, 70, -1));

        jTextField15PesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15PesquisarProdutoActionPerformed(evt);
            }
        });
        jTextField15PesquisarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField15PesquisarProdutoKeyReleased(evt);
            }
        });
        getContentPane().add(jTextField15PesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 51, 240, -1));

        buttonGroup1.add(jRadioButton1Codigo);
        jRadioButton1Codigo.setSelected(true);
        jRadioButton1Codigo.setText("Codigo");
        getContentPane().add(jRadioButton1Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        buttonGroup1.add(jRadioButton2Produto);
        jRadioButton2Produto.setText("Produto");
        getContentPane().add(jRadioButton2Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jButton2Subtrair.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton2Subtrair.setText("-");
        jButton2Subtrair.setBorder(null);
        jButton2Subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2SubtrairActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Subtrair, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 40, 30));

        jButton1Soma.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton1Soma.setText("+");
        jButton1Soma.setBorder(null);
        jButton1Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SomaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Soma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 40, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/BackgroundCaMatPrima.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 450));

        getAccessibleContext().setAccessibleName("Cadastro de Matéria Prima");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                                                                                            
    private void jTextField6ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ProdutoActionPerformed

    private void jTextField7CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7CodigoActionPerformed

    private void jTextField8QtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8QtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8QtdActionPerformed

    private void jTextField9QtdMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9QtdMinActionPerformed
      
    }//GEN-LAST:event_jTextField9QtdMinActionPerformed

    private void botao_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_NovoActionPerformed

        limpar();
    }//GEN-LAST:event_botao_NovoActionPerformed

    private void botao_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_gravarActionPerformed
        try {
        
        pro.setCodProdEntrada(jTextField7Codigo.getText().trim());
        pro.setProduto(jTextField6Produto.getText().trim());
        pro.setQtd(Double.parseDouble(jTextField8Qtd.getText().replace(",", ".")));
        pro.setQtdMin(Double.parseDouble(jTextField9QtdMin.getText().replace(",", ".")));
                
            dp.Cadastrar(pro);
        JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso");
            preecherTabelaProduto("select * from produto order by codProdEntrada");
        limpar();
        } catch (ConexaoException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Conexão");
        
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar");
        
        } catch (ProdutoJaExisteException ex) {
             JOptionPane.showMessageDialog(null, "Produto já cadastrado");
         } catch (SQLException ex) {
            Logger.getLogger(TelaCadMatPrima.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField9QtdMin.setEnabled(false);
    }//GEN-LAST:event_botao_gravarActionPerformed

    private void botao_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_alterarActionPerformed

        try { 
        pro.setProduto(jTextField6Produto.getText());
        pro.setQtd(Double.parseDouble(jTextField8Qtd.getText().replace(",", ".")));
        pro.setQtdMin(Double.parseDouble(jTextField9QtdMin.getText().replace(",", ".")));
        pro.setCodProdEntrada(jTextField7Codigo.getText());
     
             dp.Alterar(pro);
             limpar();
             JOptionPane.showMessageDialog(null, "Dados Alterado com Sucesso");
             preecherTabelaProduto("select * from produto order by codProdEntrada");
             
         } catch (ConexaoException ex) {
             JOptionPane.showMessageDialog(null, "Erro de Conexão");
         } catch (DaoException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar");
         } catch (SQLException ex) {
            Logger.getLogger(TelaCadMatPrima.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DadosInvalidoException ex) {
            JOptionPane.showMessageDialog(null, "Dados Invalidos");
        }
        jTextField9QtdMin.setEnabled(false);
    }//GEN-LAST:event_botao_alterarActionPerformed

    private void botao_tela_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_tela_inicialActionPerformed
         dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_tela_inicialActionPerformed

    private void jButton1EditarQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1EditarQtdActionPerformed
       jTextField9QtdMin.setEnabled(true);
    }//GEN-LAST:event_jButton1EditarQtdActionPerformed

    private void jTextField15PesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15PesquisarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15PesquisarProdutoActionPerformed

    private void jTextField15PesquisarProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15PesquisarProdutoKeyReleased
             if(jRadioButton1Codigo.isSelected()){
         try {
                preecherTabelaProduto("select * from produto where codProdEntrada like'%"+jTextField15PesquisarProduto.getText()+"%'");
            } catch (ConexaoException ex) {
                JOptionPane.showMessageDialog(null, "Erro na conexão");
            } catch (SQLException ex) {
            Logger.getLogger(TelaCadMatPrima.class.getName()).log(Level.SEVERE, null, ex);
        }
           
      }else{
   
            try {
                preecherTabelaProduto("select * from produto where produto like'%"+jTextField15PesquisarProduto.getText()+"%'");
            } catch (ConexaoException ex) {
                JOptionPane.showMessageDialog(null, "Erro na conexão");
            } catch (SQLException ex) {
            Logger.getLogger(TelaCadMatPrima.class.getName()).log(Level.SEVERE, null, ex);
        }
             }
    }//GEN-LAST:event_jTextField15PesquisarProdutoKeyReleased

    private void jTable1ProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1ProdutoMouseClicked
         //Codigo para preencher Campos
        
        String codProdEntrada = "" + jTable1Produto.getValueAt(jTable1Produto.getSelectedRow(), 0);
        jTextField7Codigo.setText(codProdEntrada);
        String produto = "" + jTable1Produto.getValueAt(jTable1Produto.getSelectedRow(), 1);
        jTextField6Produto.setText(produto);
        String qtd = "" + jTable1Produto.getValueAt(jTable1Produto.getSelectedRow(), 2);
        jTextField8Qtd.setText(qtd);
        String qtdMin = "" + jTable1Produto.getValueAt(jTable1Produto.getSelectedRow(), 3);
        jTextField9QtdMin.setText(qtdMin);
       jTextField9QtdMin.setEnabled(false);
    }//GEN-LAST:event_jTable1ProdutoMouseClicked

    private void jButton1SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SomaActionPerformed
        try {
            Somarqtd();
        preecherTabelaProduto("select * from produto order by codProdEntrada");
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadMatPrima.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaCadMatPrima.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1SomaActionPerformed

    private void jButton2SubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2SubtrairActionPerformed
        try {
            Subtrqtd();
        preecherTabelaProduto("select * from produto order by codProdEntrada"); 
         } catch (SQLException ex) {
            Logger.getLogger(TelaCadMatPrima.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaCadMatPrima.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2SubtrairActionPerformed
    
    public void preecherTabelaProduto(String Sql) throws ConexaoException, SQLException{
    ArrayList dados = new ArrayList();
    String [] colunas = new String[] {"CODIGO","PRODUTO","QTD","QTD_MINIMA"};
    con.conectar();
    con.executaSql(Sql);
       try{
                    
           con.rs.first();
           do{  
               dados.add(new Object[]{con.rs.getString("codProdEntrada"),con.rs.getString("produto"),con.rs.getString("qtd"),con.rs.getString("qtdMin")});
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
       jTable1Produto.setModel(modelo);
       jTable1Produto.getColumnModel().getColumn(0).setMaxWidth(200);
       jTable1Produto.getColumnModel().getColumn(1).setMaxWidth(650);
       jTable1Produto.getColumnModel().getColumn(2).setMaxWidth(200);
       jTable1Produto.getColumnModel().getColumn(3).setMaxWidth(200);
       jTable1Produto.getTableHeader().setReorderingAllowed(false);
       jTable1Produto.setAutoResizeMode(jTable1Produto.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
       jTable1Produto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       con.desconectar();
}
    public void limpar(){
    
        jTextField7Codigo.setText("");
        jTextField6Produto.setText("");
        jTextField8Qtd.setText("");
        jTextField9QtdMin.setText("");
       
    }
    
    public void Somarqtd() throws SQLException, ConexaoException{
        double soma;
                double qtdProd;
                double qtdInserida;
                int codProduto;
                
        con.conectar();// Somando quantidade no Produto
        PreparedStatement pst;             
        codProduto = Integer.parseInt(jTextField7Codigo.getText());        
        con.executaSql("select * from produto where codProdEntrada="+codProduto);
                
                     try{                
                    con.rs.first();
                    do{       
                    if(codProduto == Integer.parseInt(jTextField7Codigo.getText())){                   
                    qtdProd = con.rs.getDouble("qtd");     
                    qtdInserida = Double.parseDouble(jTextField8Qtd.getText());
                    soma = qtdProd + qtdInserida;
                    
                    pst = con.con.prepareStatement("update produto set qtd=? where codProdEntrada=?");
                    pst.setDouble(1, soma);
                    pst.setInt(2, codProduto);
                    pst.execute();
                    }else{
                    }
                    }while(con.rs.next());
                     
                   con.desconectar();
                   
                            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Inserir Produto!");
                    System.out.println("Erro"+ex);
                   }
            con.desconectar();
            }
            
public void Subtrqtd() throws SQLException, ConexaoException{
        double soma;
                double qtdProd;
                double qtdInserida;
                int codProduto;
                
        con.conectar();// Subtraindo quantidade de produto
        PreparedStatement pst;             
        codProduto = Integer.parseInt(jTextField7Codigo.getText());        
        con.executaSql("select * from produto where codProdEntrada="+codProduto);
                
                     try{                
                    con.rs.first();
                    do{       
                    if(codProduto == Integer.parseInt(jTextField7Codigo.getText())){                   
                    qtdProd = con.rs.getDouble("qtd");     
                    qtdInserida = Double.parseDouble(jTextField8Qtd.getText());
                    soma = qtdProd - qtdInserida;
                    
                    pst = con.con.prepareStatement("update produto set qtd=? where codProdEntrada=?");
                    pst.setDouble(1, soma);
                    pst.setInt(2, codProduto);
                    pst.execute();
                    }else{
                    }
                    }while(con.rs.next());
                     
                   con.desconectar();
                   
                            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Inserir Produto!");
                    System.out.println("Erro"+ex);
                   }
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
                    new TelaCadMatPrima().setVisible(true);
                } catch (ConexaoException ex) {
                    Logger.getLogger(TelaCadMatPrima.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCadMatPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_Novo;
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_gravar;
    private javax.swing.JButton botao_tela_inicial;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1EditarQtd;
    private javax.swing.JButton jButton1Soma;
    private javax.swing.JButton jButton2Subtrair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1Codigo;
    private javax.swing.JRadioButton jRadioButton2Produto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1Produto;
    private javax.swing.JTextField jTextField15PesquisarProduto;
    private javax.swing.JTextField jTextField6Produto;
    private javax.swing.JTextField jTextField7Codigo;
    private javax.swing.JTextField jTextField8Qtd;
    private javax.swing.JTextField jTextField9QtdMin;
    // End of variables declaration//GEN-END:variables
    
    }
    
