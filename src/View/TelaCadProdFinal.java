package View;

import Conexao.ConectaBD;
import Conexao.ConexaoException;
import Conexao.DaoException;
import Control.DaoProdutosFinal;
import Model.ModelTable;
import Model.DadosInvalidoException;
import Model.ProdutoFinal;
import Model.ProdutoFinalJaExisteException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class TelaCadProdFinal extends javax.swing.JFrame {
   
     ProdutoFinal proF = new ProdutoFinal();
    ConectaBD con = new ConectaBD();
    DaoProdutosFinal dpF = new DaoProdutosFinal();
    ProdutoFinal model_ProF = new ProdutoFinal();
    
    String seta_look="javax.swing.plaf.metal.MetalLookAndFeel";
    
    public TelaCadProdFinal() throws ConexaoException, SQLException{
        
        initComponents();
          con.conectar();
          
          preecherTabelaProdutoFinal("select * from produtofinal order by codigo");
          
          jTextField9QtdMin.setEnabled(false);
          
          preencherLinha();
        
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
        jComboBox1Linha = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        botao_Novo = new javax.swing.JButton();
        botao_gravar = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        botao_tela_inicial = new javax.swing.JButton();
        botao_nova_linha = new javax.swing.JButton();
        jButton1Editar = new javax.swing.JButton();
        jComboBox2Status = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1ProdutoFinal = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField15Pesquisar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1Codigo = new javax.swing.JRadioButton();
        jRadioButton2Produto = new javax.swing.JRadioButton();
        jButton1Soma = new javax.swing.JButton();
        jButton2Subtrair = new javax.swing.JButton();
        jFormattedTextField1Preco = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Controle de Estoque");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Produto Final");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 11, -1, -1));

        jLabel2.setText("Codigo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jLabel3.setText("Descrição:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 20));

        jLabel7.setText("Quantidade em latas:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 134, -1, 20));

        jLabel9.setText("Quantidade mínima:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, 20));

        jTextField6Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 530, -1));

        jTextField7Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7CodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 89, -1));

        jTextField8Qtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8QtdActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8Qtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 70, 30));

        jTextField9QtdMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9QtdMinActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9QtdMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 89, -1));

        jComboBox1Linha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Massa Corrida", " Massa Acrílica", " Textura Acrílica", " Textura Rústica", " Tintas" }));
        jComboBox1Linha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1LinhaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1Linha, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 176, -1));

        jLabel11.setText("Linha :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 44, 20));

        botao_Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/novo_registro.gif"))); // NOI18N
        botao_Novo.setToolTipText("Novo registro");
        botao_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_NovoActionPerformed(evt);
            }
        });
        getContentPane().add(botao_Novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 47));

        botao_gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/gravar_registro.gif"))); // NOI18N
        botao_gravar.setToolTipText("Grava o registro");
        botao_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_gravarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_gravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 47));

        botao_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/alterar_registro.gif"))); // NOI18N
        botao_alterar.setToolTipText("Alterar");
        botao_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, 47));

        botao_tela_inicial.setText("Tela Inicial");
        botao_tela_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_tela_inicialActionPerformed(evt);
            }
        });
        getContentPane().add(botao_tela_inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 150, 50));

        botao_nova_linha.setText("Nova Linha");
        botao_nova_linha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_nova_linhaActionPerformed(evt);
            }
        });
        getContentPane().add(botao_nova_linha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 133, 47));

        jButton1Editar.setForeground(new java.awt.Color(255, 0, 0));
        jButton1Editar.setText("Editar");
        jButton1Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1EditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, -1, -1));

        jComboBox2Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo", "Faltando" }));
        getContentPane().add(jComboBox2Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 120, -1));

        jLabel5.setText("Situação do produto:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, 20));

        jTable1ProdutoFinal.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1ProdutoFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1ProdutoFinalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1ProdutoFinal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 850, 173));

        jLabel8.setText("Pesquisar:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 82, -1));

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
        getContentPane().add(jTextField15Pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 170, -1));

        jLabel4.setText("Preço:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 40, 20));

        buttonGroup1.add(jRadioButton1Codigo);
        jRadioButton1Codigo.setSelected(true);
        jRadioButton1Codigo.setText("Codigo");
        getContentPane().add(jRadioButton1Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        buttonGroup1.add(jRadioButton2Produto);
        jRadioButton2Produto.setText("Produto");
        getContentPane().add(jRadioButton2Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jButton1Soma.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton1Soma.setText("+");
        jButton1Soma.setBorder(null);
        jButton1Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SomaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Soma, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 40, 30));

        jButton2Subtrair.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton2Subtrair.setText("-");
        jButton2Subtrair.setBorder(null);
        jButton2Subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2SubtrairActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Subtrair, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 40, 30));
        getContentPane().add(jFormattedTextField1Preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 90, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/BackgroundCadProdFinal.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 480));

        getAccessibleContext().setAccessibleName("Cadastro de Produto Final");

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
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9QtdMinActionPerformed

    private void jComboBox1LinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1LinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1LinhaActionPerformed

    private void botao_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_NovoActionPerformed
    limpar();
    }//GEN-LAST:event_botao_NovoActionPerformed

    private void botao_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_gravarActionPerformed
         try {
             
        proF.setCodigo(Integer.parseInt(jTextField7Codigo.getText()));
        proF.setProdutoFinal(jTextField6Produto.getText().trim());
        proF.setQdt_ProdutoFinal(Double.parseDouble((String)jTextField8Qtd.getText().replace(",", ".")));
        proF.setLinha(jComboBox1Linha.getSelectedItem().toString());
        proF.setQtdMinEstoque(Float.parseFloat((String)jTextField9QtdMin.getText().replace(",", ".")));
        proF.setStatus(jComboBox2Status.getSelectedItem().toString());
        proF.setPrecoUnitario(Double.parseDouble(jFormattedTextField1Preco.getText().replace(".", "").replace(",", ".")));
            
        dpF.Cadastrar(proF);
            
        preecherTabelaProdutoFinal("select * from produtoFinal order by codigo");
        limpar();
        
        } catch (ConexaoException ex) {
           JOptionPane.showMessageDialog(null, "Erro na Conexão");
        } catch (ProdutoFinalJaExisteException ex) {
            JOptionPane.showMessageDialog(null, "Produto já Existe");
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadProdFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
         jTextField9QtdMin.setEnabled(false);
    }//GEN-LAST:event_botao_gravarActionPerformed

    private void botao_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_alterarActionPerformed
      
        proF.setProdutoFinal(jTextField6Produto.getText());
       proF.setQdt_ProdutoFinal(Double.parseDouble(jTextField8Qtd.getText().replace(".", "").replace(",", ".")));
       proF.setLinha(jComboBox1Linha.getSelectedItem().toString());
       proF.setQtdMinEstoque(Float.parseFloat(jTextField9QtdMin.getText().replace(".", "").replace(",", ".")));
       proF.setStatus(jComboBox2Status.getSelectedItem().toString());
       proF.setPrecoUnitario(Double.parseDouble(jFormattedTextField1Preco.getText().replaceAll(",", ".")));
       proF.setCodigo(Integer.parseInt(jTextField7Codigo.getText())); 
       
       try {
            dpF.Alterar(proF);
            JOptionPane.showMessageDialog(null, "Produto Alterado com Sucesso");
        preecherTabelaProdutoFinal("select * from produtoFinal order by codigo");
        limpar();
        
        } catch (ConexaoException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Conexão");
        } catch (DaoException ex) {           
            JOptionPane.showMessageDialog(null, "Dados Invalidos");
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadProdFinal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DadosInvalidoException ex) {
           JOptionPane.showMessageDialog(null, "Dados Invalidos");
        }
       jTextField9QtdMin.setEnabled(false);
    }//GEN-LAST:event_botao_alterarActionPerformed

    private void botao_tela_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_tela_inicialActionPerformed

        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_tela_inicialActionPerformed

    private void botao_nova_linhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_nova_linhaActionPerformed
         try {
             TelaCadNovaLinha novaLinha = new TelaCadNovaLinha();
             novaLinha.setVisible(true);
         
         } catch (ConexaoException ex) {
             Logger.getLogger(TelaCadProdFinal.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(TelaCadProdFinal.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_botao_nova_linhaActionPerformed

    private void jButton1EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1EditarActionPerformed
       jTextField9QtdMin.setEnabled(true);
    }//GEN-LAST:event_jButton1EditarActionPerformed

    private void jTextField15PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15PesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15PesquisarActionPerformed

    private void jTable1ProdutoFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1ProdutoFinalMouseClicked
        String codigo = "" + jTable1ProdutoFinal.getValueAt(jTable1ProdutoFinal.getSelectedRow(), 0);
        jTextField7Codigo.setText(codigo);
        String produtoFinal = "" + jTable1ProdutoFinal.getValueAt(jTable1ProdutoFinal.getSelectedRow(), 1);
        jTextField6Produto.setText(produtoFinal);
         String qdt_ProdutoFinal = "" + jTable1ProdutoFinal.getValueAt(jTable1ProdutoFinal.getSelectedRow(), 2);
        jTextField8Qtd.setText(qdt_ProdutoFinal);
        String qtdMinEstoque = "" + jTable1ProdutoFinal.getValueAt(jTable1ProdutoFinal.getSelectedRow(), 3);
        jTextField9QtdMin.setText(qtdMinEstoque);
        String linha = "" + jTable1ProdutoFinal.getValueAt(jTable1ProdutoFinal.getSelectedRow(), 4);
        jComboBox1Linha.setSelectedItem(linha);
         String precoUnitario = "" + jTable1ProdutoFinal.getValueAt(jTable1ProdutoFinal.getSelectedRow(), 5);
        jFormattedTextField1Preco.setText(precoUnitario);
        String status = "" + jTable1ProdutoFinal.getValueAt(jTable1ProdutoFinal.getSelectedRow(), 6);
        jComboBox2Status.setSelectedItem(status);
                                            
    }//GEN-LAST:event_jTable1ProdutoFinalMouseClicked

    private void jTextField15PesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15PesquisarKeyReleased
        if(jRadioButton1Codigo.isSelected()){
         try {
             preecherTabelaProdutoFinal("select * from produtoFinal where codigo like'%"+jTextField15Pesquisar.getText()+"%'");
         } catch (ConexaoException ex) {
             Logger.getLogger(TelaCadProdFinal.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(TelaCadProdFinal.class.getName()).log(Level.SEVERE, null, ex);
         }
        }else{
            try {
             preecherTabelaProdutoFinal("select * from produtoFinal where ProdutoFinal like'%"+jTextField15Pesquisar.getText()+"%'");
         } catch (ConexaoException ex) {
             Logger.getLogger(TelaCadProdFinal.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(TelaCadProdFinal.class.getName()).log(Level.SEVERE, null, ex);
         }
        }   
    }//GEN-LAST:event_jTextField15PesquisarKeyReleased

    private void jButton1SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SomaActionPerformed
        try {
            Somarqtd();
            preecherTabelaProdutoFinal("select * from produtofinal order by codigo");
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadMatPrima.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaCadMatPrima.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1SomaActionPerformed

    private void jButton2SubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2SubtrairActionPerformed
        try {
            Subtrqtd();
            preecherTabelaProdutoFinal("select * from produtofinal order by codigo");
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadMatPrima.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaCadMatPrima.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2SubtrairActionPerformed
    
     public void preecherTabelaProdutoFinal(String Sql) throws ConexaoException, SQLException{
    ArrayList dados = new ArrayList();
    String [] colunas = new String[] {"CODIGO","PRODUTO","QTD","QTD MIN","LINHA","PREÇO","STATUS"};
    con.conectar();
    con.executaSql(Sql);
       try{
                    
           con.rs.first();
           do{  
               dados.add(new Object[]{con.rs.getString("codigo"),con.rs.getString("produtoFinal") ,con.rs.getString("qdt_ProdutoFinal"),con.rs.getString("qtdMinEstoque"),con.rs.getString("linha"),con.rs.getString("precoUnitario"),con.rs.getString("status")});
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
       jTable1ProdutoFinal.getColumnModel().getColumn(0).setMaxWidth(130);
       jTable1ProdutoFinal.getColumnModel().getColumn(1).setMaxWidth(500);
       jTable1ProdutoFinal.getColumnModel().getColumn(2).setMaxWidth(70);
       jTable1ProdutoFinal.getColumnModel().getColumn(3).setMaxWidth(70);
       jTable1ProdutoFinal.getColumnModel().getColumn(4).setMaxWidth(120);
       jTable1ProdutoFinal.getColumnModel().getColumn(5).setMaxWidth(70);
       jTable1ProdutoFinal.getColumnModel().getColumn(6).setMaxWidth(100);
       jTable1ProdutoFinal.getTableHeader().setReorderingAllowed(false);
       jTable1ProdutoFinal.setAutoResizeMode(jTable1ProdutoFinal.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
       jTable1ProdutoFinal.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       con.desconectar();
}
     public void preencherLinha() throws ConexaoException, SQLException{
         con.conectar();
         con.executaSql("select * from linha order by linha");
             con.rs.first();
             jComboBox1Linha.removeAllItems();
             do{
                 jComboBox1Linha.addItem(con.rs.getString("linha"));
         }while(con.rs.next());
             con.desconectar();
     }
     
    public void Subtrqtd() throws SQLException, ConexaoException{
        double soma;
                double qtdProd;
                double qtdInserida;
                int codProduto;
                
        con.conectar();// Restituindo quantidade de venda cancelada
        PreparedStatement pst;             
        codProduto = Integer.parseInt(jTextField7Codigo.getText());        
        con.executaSql("select * from produtofinal where codigo="+codProduto);
                
                     try{                
                    con.rs.first();
                    do{       
                    if(codProduto == Integer.parseInt(jTextField7Codigo.getText())){                   
                    qtdProd = con.rs.getDouble("qdt_produtoFinal");     
                    qtdInserida = Double.parseDouble(jTextField8Qtd.getText());
                    soma = qtdProd - qtdInserida;
                    
                    pst = con.con.prepareStatement("update produtofinal set qdt_produtoFinal=? where codigo=?");
                    pst.setDouble(1, soma);
                    pst.setInt(2, codProduto);
                    pst.execute();
                    }else{
                    }
                    }while(con.rs.next());
                     
                   con.desconectar();
                   
                            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Inserir Produto!");
                    
                   }
            con.desconectar();
            }
    
    public void Somarqtd() throws SQLException, ConexaoException{
        double soma;
                double qtdProd;
                double qtdInserida;
                int codProduto;
                
        con.conectar();// Restituindo quantidade de venda cancelada
        PreparedStatement pst;             
        codProduto = Integer.parseInt(jTextField7Codigo.getText());        
        con.executaSql("select * from produtofinal where codigo="+codProduto);
                
                     try{                
                    con.rs.first();
                    do{       
                    if(codProduto == Integer.parseInt(jTextField7Codigo.getText())){                   
                    qtdProd = con.rs.getDouble("qdt_produtoFinal");     
                    qtdInserida = Double.parseDouble(jTextField8Qtd.getText());
                    soma = qtdProd + qtdInserida;
                    
                    pst = con.con.prepareStatement("update produtofinal set qdt_produtoFinal=? where codigo=?");
                    pst.setDouble(1, soma);
                    pst.setInt(2, codProduto);
                    pst.execute();
                    }else{
                    }
                    }while(con.rs.next());
                     
                   con.desconectar();
                   
                            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Inserir Produto!");
                    
                   }
            con.desconectar();
            }
     public void limpar(){
    
        jTextField7Codigo.setText("");
        jTextField6Produto.setText("");
        jTextField8Qtd.setText("");
        jTextField9QtdMin.setText("");
        jComboBox2Status.setSelectedItem("Ativo");
        jFormattedTextField1Preco.setText("");
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
                    new TelaCadProdFinal().setVisible(true);
                } catch (ConexaoException ex) {
                    Logger.getLogger(TelaCadProdFinal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCadProdFinal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_Novo;
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_gravar;
    private javax.swing.JButton botao_nova_linha;
    private javax.swing.JButton botao_tela_inicial;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1Editar;
    private javax.swing.JButton jButton1Soma;
    private javax.swing.JButton jButton2Subtrair;
    private javax.swing.JComboBox<String> jComboBox1Linha;
    private javax.swing.JComboBox<String> jComboBox2Status;
    private javax.swing.JFormattedTextField jFormattedTextField1Preco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1Codigo;
    private javax.swing.JRadioButton jRadioButton2Produto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1ProdutoFinal;
    private javax.swing.JTextField jTextField15Pesquisar;
    private javax.swing.JTextField jTextField6Produto;
    private javax.swing.JTextField jTextField7Codigo;
    private javax.swing.JTextField jTextField8Qtd;
    private javax.swing.JTextField jTextField9QtdMin;
    // End of variables declaration//GEN-END:variables
    
    }
    
