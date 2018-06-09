/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Conexao.ConectaBD;
import Conexao.ConexaoException;
import Conexao.DaoException;
import Control.DaoVendas;
import Model.ModelTable;
import Model.Vendas;
import Model.VendasJaExisteException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


public class TelaVendas extends javax.swing.JFrame {
        ConectaBD con = new ConectaBD();
        Vendas ven = new Vendas();
         DaoVendas dv = new DaoVendas();
         Vendas vendas_Model = new Vendas();
         int flag;
         double precoProduto;
         int codVenda;
         
    String seta_look="javax.swing.plaf.metal.MetalLookAndFeel";
    
    public TelaVendas() throws ConexaoException, SQLException {
        initComponents();
    con.conectar();
            
   // SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");    
       // SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
       // Date hoje = new Date();
       Date data = new Date();
       SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        String Dataformata = formato.format(data);
        jFormattedTextField1DataVendas.setText(Dataformata);
        System.out.println(Dataformata);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtClientes = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtPesquisaClientes = new javax.swing.JTextField();
        jButton6PesquisaClientes = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField1DataVendas = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6PesquisarProduto = new javax.swing.JTextField();
        jButton7PesquisaProduto = new javax.swing.JButton();
        jTextField2Produto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jQtd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1TipoPaamento = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1Parcelas = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1Vendas = new javax.swing.JTable();
        botao_CancelarVenda = new javax.swing.JButton();
        botao_vender = new javax.swing.JButton();
        botao_tela_inic2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1ValorTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField2Preco = new javax.swing.JTextField();
        jButton1AdicionarItens = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Itens = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Codigo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Vendas de Produtos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 219, 27));

        jLabel6.setText("Pesquisar Clientes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));
        getContentPane().add(jtClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 380, -1));

        jLabel14.setText("Nome.:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));
        getContentPane().add(jtPesquisaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 169, -1));

        jButton6PesquisaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/pesquisar.png"))); // NOI18N
        jButton6PesquisaClientes.setBorderPainted(false);
        jButton6PesquisaClientes.setContentAreaFilled(false);
        jButton6PesquisaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6PesquisaClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6PesquisaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 50, 50));

        jLabel7.setText("Data da Venda");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, -1));

        try {
            jFormattedTextField1DataVendas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1DataVendas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField1DataVendas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jFormattedTextField1DataVendas.setEnabled(false);
        getContentPane().add(jFormattedTextField1DataVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 130, -1));

        jLabel8.setText("Pesquisar Produtos");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, 20));

        jTextField6PesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6PesquisarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6PesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 240, -1));

        jButton7PesquisaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/pesquisar.png"))); // NOI18N
        jButton7PesquisaProduto.setContentAreaFilled(false);
        jButton7PesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7PesquisaProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7PesquisaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 40, 50));
        getContentPane().add(jTextField2Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 240, -1));

        jLabel2.setText("Produto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 50, -1));

        jLabel11.setText("Quantidade:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, 20));

        jQtd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jQtdFocusGained(evt);
            }
        });
        getContentPane().add(jQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 60, 30));

        jLabel9.setText("Preço");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 160, 40, 20));

        jLabel10.setText("Forma de pagamento:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, -1, -1));

        jComboBox1TipoPaamento.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jComboBox1TipoPaamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " A Vista", " Boleto", " Cartão de crédito", " Cheque", " Outros", " " }));
        jComboBox1TipoPaamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1TipoPaamentoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1TipoPaamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 150, -1));

        jLabel12.setText("Qdt de parcelas");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, -1, -1));

        jComboBox1Parcelas.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jComboBox1Parcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  0", "1 X", "2 X", "3 X", "4 X", "5 X", "6 X", "7 X", "8 X", "9 X", "10 X", "11 X", "12 X" }));
        getContentPane().add(jComboBox1Parcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 250, -1, -1));

        jTable1Vendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1Vendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1VendasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1Vendas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 1040, 120));

        botao_CancelarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/cancelar-carrinho-de-compras.png"))); // NOI18N
        botao_CancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_CancelarVendaActionPerformed(evt);
            }
        });
        getContentPane().add(botao_CancelarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 110, 40));

        botao_vender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/gravar_registro.gif"))); // NOI18N
        botao_vender.setBorderPainted(false);
        botao_vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_venderActionPerformed(evt);
            }
        });
        getContentPane().add(botao_vender, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, 100, 40));

        botao_tela_inic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/sair.gif"))); // NOI18N
        botao_tela_inic2.setBorderPainted(false);
        botao_tela_inic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_tela_inic2ActionPerformed(evt);
            }
        });
        getContentPane().add(botao_tela_inic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 97, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Valor Total");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 640, 80, 20));

        jTextField1ValorTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField1ValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 630, 170, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("R$");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 640, 30, 20));

        jLabel16.setText("R$");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 160, 20, 20));

        jTextField2Preco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2PrecoFocusGained(evt);
            }
        });
        getContentPane().add(jTextField2Preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, 90, 30));

        jButton1AdicionarItens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/carrinhocompras.png"))); // NOI18N
        jButton1AdicionarItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AdicionarItensActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1AdicionarItens, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, 120, 40));

        jTable1Itens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1Itens);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 650, 150));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Itens Adicionados");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 200, 30));
        getContentPane().add(jTextField1Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 80, 30));

        jLabel15.setText("Codigo:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/BackgroundTelaVendas.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 680));

        setSize(new java.awt.Dimension(1133, 722));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6PesquisaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6PesquisaClientesActionPerformed
        try {
            try {
                con.conectar();
                
                String sql = "INSERT INTO vendas (valorVenda) VALUES (?)";//Comando sql para inserir dados no banco
                
                PreparedStatement pstm = con.con.prepareStatement(sql);
                pstm.setDouble(1, 0);
                pstm.execute();
                con.executaSql("select * from vendas");
                con.rs.last();
                codVenda = con.rs.getInt("id_Venda");
                
            } catch (ConexaoException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Buscar Cliente
            flag = 1;
            
            preecherTabelaCliente("select * from cliente where nome " + "like'%"+jtPesquisaClientes.getText()+"%'");
            
        } catch (ConexaoException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
     
    }//GEN-LAST:event_jButton6PesquisaClientesActionPerformed

    private void jTextField6PesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6PesquisarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6PesquisarProdutoActionPerformed

    private void jButton7PesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7PesquisaProdutoActionPerformed
            try {
                flag = 2;
                //Pesquisar produto
                preecherTabelaProdutoFinal("select * from produtofinal where produtoFinal " + "like'%"+jTextField6PesquisarProduto.getText()+"%'");
            } catch (ConexaoException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
          
    }//GEN-LAST:event_jButton7PesquisaProdutoActionPerformed

    private void jComboBox1TipoPaamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1TipoPaamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1TipoPaamentoActionPerformed

    private void botao_CancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_CancelarVendaActionPerformed
            try {
                dv.CancelarVenda();
                preecherTabelaProdutoFinal("select * from produtofinal order by codigo");
            } catch (ConexaoException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
           
            } catch (SQLException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_botao_CancelarVendaActionPerformed

    private void botao_venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_venderActionPerformed
        
        try{
        ven.setId_Venda(codVenda);
        ven.setValorVenda(Double.valueOf(jTextField1ValorTotal.getText().replaceAll(",", ".")));
        ven.setCliente(jtClientes.getText().trim());
        ven.setDataVenda(jFormattedTextField1DataVendas.getText());
        ven.setTipoPagamento((String)jComboBox1TipoPaamento.getSelectedItem());
        ven.setParcelas((String)jComboBox1Parcelas.getSelectedItem());
        
                dv.FechaVenda(ven);
                
                JOptionPane.showMessageDialog(null, "Venda realizada com sucesso");
                limpar();
                
            } catch (ConexaoException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DaoException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (VendasJaExisteException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
                
    }//GEN-LAST:event_botao_venderActionPerformed

    private void botao_tela_inic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_tela_inic2ActionPerformed
       TelaPrincipal tp = new TelaPrincipal();
       tp.setVisible(true);
       dispose();
    }//GEN-LAST:event_botao_tela_inic2ActionPerformed

    private void jTable1VendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1VendasMouseClicked
       if(flag == 1){
        String nome = "" + jTable1Vendas.getValueAt(jTable1Vendas.getSelectedRow(), 1);
        jtClientes.setText(nome);
        
       }if(flag == 2){
           try {
               con.conectar();
         String codigo = "" + jTable1Vendas.getValueAt(jTable1Vendas.getSelectedRow(), 0);
        jTextField1Codigo.setText(codigo);  
        String produtoFinal = "" + jTable1Vendas.getValueAt(jTable1Vendas.getSelectedRow(), 1);
        jTextField2Produto.setText(produtoFinal);
        
        
        con.executaSql("select * from produtofinal where produtoFinal='"+produtoFinal+"'");
           
        try {
               con.rs.first();
               precoProduto = con.rs.getDouble("precoUnitario");
           } catch (SQLException ex) {
              JOptionPane.showMessageDialog(rootPane, "Não existe preço cadastrado");   
           }
        jTextField2Produto.setText(produtoFinal);
        jTextField2Preco.setText(String.valueOf(precoProduto));
        jQtd.setText("1");
       con.desconectar();
        } catch (ConexaoException ex) {
               Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
           }
           }
    }//GEN-LAST:event_jTable1VendasMouseClicked

    private void jQtdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jQtdFocusGained

    }//GEN-LAST:event_jQtdFocusGained

    private void jTextField2PrecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2PrecoFocusGained
     
    }//GEN-LAST:event_jTextField2PrecoFocusGained

    private void jButton1AdicionarItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AdicionarItensActionPerformed
        double qtdVenda = 0;
        int codigoFinal = 0;  
      
        try{
              
                con.conectar();
                /*Excessão de duplicidade produto
                con.executaSql("select max(i.id_venda) as id_venda, i.id_produtoFinal from itensvendas_produto i");
                con.rs.first();
                codigoFinal = con.rs.getInt("id_produtoFinal");
                if(Integer.parseInt(jTextField1Codigo.getText()) == codigoFinal){
                    JOptionPane.showMessageDialog(null, "PRODUTO JÁ ADICIONADO NA LISTA");
                
                }else*/
              
        con.executaSql("select * from produtofinal where produtoFinal='"+ jTextField2Produto.getText()+"'");
                con.rs.first();
                qtdVenda = con.rs.getDouble("qdt_ProdutoFinal");
        if(qtdVenda >= Double.parseDouble(jQtd.getText())){
            
           
       ven.setProduto(jTextField2Produto.getText().trim());
       ven.setQtd(Double.parseDouble(jQtd.getText().replace(",", ".")));
       ven.setId_Venda(codVenda);
       
                dv.AdicionaItem(ven);
            
            }else{
                    JOptionPane.showMessageDialog(null, "A quantidade em estoque é insuficiente");
                    }  
                
                } catch (ConexaoException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
            try {
                preecherTabelaItens ("select * from itensvendas_produto i inner join vendas v on i.id_Venda = v.id_Venda inner join produtofinal p on i.id_produtoFinal = p.codigo where v.id_Venda="+codVenda);
                         // Atualizando tabela de ProdutoFinal
                         preecherTabelaProdutoFinal("select * from produtofinal order by codigo");
          con.desconectar();
            } catch (ConexaoException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }//GEN-LAST:event_jButton1AdicionarItensActionPerformed

    public void preecherTabelaVendas(String Sql) throws ConexaoException, SQLException{
    ArrayList dados = new ArrayList();
    String [] colunas = new String[] {"CLIENTE","CPF/CNPJ","LINHA","PRODUTO","QTD","PAGAMENTO","VALOR UNIT.","TOTAL"};
    con.conectar();
    con.executaSql(Sql);
       try{
                    
           con.rs.first();
               do
                    { dados.add(new Object[]{con.rs.getString("nome"),con.rs.getString("cpf_Cnpj")
                                                 ,con.rs.getString("linha"),con.rs.getString("produtoFinal")
                                                    ,con.rs.getString("qdt_produtoFinal"),con.rs.getString("tipoPagamento")
                                                        ,con.rs.getString("precoUnitario") ,con.rs.getString("valorVenda")});
                }while(con.rs.next());
       }catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "DADOS NÃO ENCONTRADO");
       } 
       
       DefaultTableCellRenderer rendererCentro = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.CENTER);
       DefaultTableCellRenderer rendererDireita = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.RIGHT);
       DefaultTableCellRenderer rendererEsquerda = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.LEFT);
       ModelTable modelo = new ModelTable(dados, colunas);
       jTable1Vendas.setModel(modelo);
       jTable1Vendas.getColumnModel().getColumn(0).setMaxWidth(200);
       jTable1Vendas.getColumnModel().getColumn(1).setMaxWidth(120);
       jTable1Vendas.getColumnModel().getColumn(2).setMaxWidth(100);
       jTable1Vendas.getColumnModel().getColumn(3).setMaxWidth(370);
       jTable1Vendas.getColumnModel().getColumn(4).setMaxWidth(50);
       jTable1Vendas.getColumnModel().getColumn(5).setMaxWidth(90);
       jTable1Vendas.getColumnModel().getColumn(6).setMaxWidth(90);
       jTable1Vendas.getColumnModel().getColumn(7).setMaxWidth(70);
       jTable1Vendas.getTableHeader().setReorderingAllowed(false);
       jTable1Vendas.setAutoResizeMode(jTable1Vendas.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
       jTable1Vendas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       con.desconectar();
}
    public void preecherTabelaCliente(String Sql) throws ConexaoException, SQLException{
    ArrayList dados = new ArrayList();
    String [] colunas = new String[] {"CODIGO","CLIENTE","CPF/CNPJ","CONTATO 1","CONTATO 2","DATA CADASTRO"};
    con.conectar();
    con.executaSql(Sql);
       try{
                    
           con.rs.first();
               do
                    { dados.add(new Object[]{con.rs.getString("codCliente"),con.rs.getString("nome"),con.rs.getString("cpf_Cnpj") ,con.rs.getString("fone1"),con.rs.getString("fone2"),con.rs.getString("dataCadastro")});
                }while(con.rs.next());
       }catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "DADOS NÃO ENCONTRADO");
       } 
       
       DefaultTableCellRenderer rendererCentro = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.CENTER);
       DefaultTableCellRenderer rendererDireita = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.RIGHT);
       DefaultTableCellRenderer rendererEsquerda = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.LEFT);
       ModelTable modelo = new ModelTable(dados, colunas);
       jTable1Vendas.setModel(modelo);
       jTable1Vendas.getColumnModel().getColumn(0).setMaxWidth(80);
       jTable1Vendas.getColumnModel().getColumn(1).setMaxWidth(400);
       jTable1Vendas.getColumnModel().getColumn(2).setMaxWidth(180);
       jTable1Vendas.getColumnModel().getColumn(3).setMaxWidth(130);
       jTable1Vendas.getColumnModel().getColumn(4).setMaxWidth(130);
       jTable1Vendas.getColumnModel().getColumn(5).setMaxWidth(115);
       jTable1Vendas.getTableHeader().setReorderingAllowed(false);
       jTable1Vendas.setAutoResizeMode(jTable1Vendas.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
       jTable1Vendas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       con.desconectar();
}
    public void preecherTabelaProdutoFinal(String Sql) throws ConexaoException, SQLException{
    ArrayList dados = new ArrayList();
    String [] colunas = new String[] {"CODIGO","PRODUTO","LINHA","QTD","STATUS"};
    con.conectar();
    con.executaSql(Sql);
       try{
                    
           con.rs.first();
           do{  
               dados.add(new Object[]{con.rs.getString("codigo"),con.rs.getString("produtoFinal") ,con.rs.getString("linha"),con.rs.getString("qdt_ProdutoFinal"),con.rs.getString("status")});
              }while(con.rs.next()); 
       }catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "DADOS NÃO ENCONTRADO");
       } 
       
       DefaultTableCellRenderer rendererCentro = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.CENTER);
       DefaultTableCellRenderer rendererDireita = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.RIGHT);
       DefaultTableCellRenderer rendererEsquerda = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.LEFT);
       ModelTable modelo = new ModelTable(dados, colunas);
       jTable1Vendas.setModel(modelo);
       jTable1Vendas.getColumnModel().getColumn(0).setMaxWidth(100);
       jTable1Vendas.getColumnModel().getColumn(1).setMaxWidth(600);
       jTable1Vendas.getColumnModel().getColumn(2).setMaxWidth(250);
       jTable1Vendas.getColumnModel().getColumn(3).setMaxWidth(100);
       jTable1Vendas.getColumnModel().getColumn(4).setMaxWidth(150);
       jTable1Vendas.getTableHeader().setReorderingAllowed(false);
       jTable1Vendas.setAutoResizeMode(jTable1Vendas.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
       jTable1Vendas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       con.desconectar();
}
    public void preecherTabelaItens(String Sql) throws ConexaoException, SQLException{
    ArrayList dados = new ArrayList();
    String [] colunas = new String[] {"DESCRIÇÃO","QTD","VALOR"};
    con.conectar();
    con.executaSql(Sql);
       try{
                    
           con.rs.first();
           do{  
               double valorProduto = con.rs.getDouble("precoUnitario");
               int qtdVendida = con.rs.getInt("qtd_produto");
               
               dados.add(new Object[]{con.rs.getString("produtoFinal"),con.rs.getString("qtd_Produto"),valorProduto* qtdVendida});
              }while(con.rs.next()); 
       }catch (SQLException ex){

           JOptionPane.showMessageDialog(null, "DADOS NÃO ENCONTRADO");
       } 
       
       DefaultTableCellRenderer rendererCentro = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.CENTER);
       DefaultTableCellRenderer rendererDireita = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.RIGHT);
       DefaultTableCellRenderer rendererEsquerda = new DefaultTableCellRenderer();
       rendererCentro.setHorizontalAlignment(SwingConstants.LEFT);
       ModelTable modelo = new ModelTable(dados, colunas);
       jTable1Itens.setModel(modelo);
       jTable1Itens.getColumnModel().getColumn(0).setMaxWidth(450);
       jTable1Itens.getColumnModel().getColumn(1).setMaxWidth(100);
       jTable1Itens.getColumnModel().getColumn(2).setMaxWidth(100);  
       jTable1Itens.getTableHeader().setReorderingAllowed(false);
       jTable1Itens.setAutoResizeMode(jTable1Itens.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
       jTable1Itens.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        SomaProduto();//Soma do total dos produtos
        con.desconectar();
    }
    // realizar soma do total da venda
    public void SomaProduto() throws SQLException{
       double total =0;
        double qtd_produto=0, valor=0;
         con.executaSql("select * from itensvendas_produto i join produtofinal p on i.id_produtoFinal = p.codigo where id_venda ="+ codVenda);
     try{
         
     while(con.rs.next()){
         
         qtd_produto = con.rs.getDouble("qtd_produto");
                valor = con.rs.getDouble("precoUnitario");
                
         total = total + valor*qtd_produto;
     }
      jTextField1ValorTotal.setText(String.valueOf(total));
     }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, "ERRO NA SOMA TOTAL DOS PRODUTOS");
     }
    }
    
    //limpar dados da tabela
    
    public void limpar(){
        jButton6PesquisaClientes.setText("");
        jButton7PesquisaProduto.setText("");
        jComboBox1Parcelas.setSelectedItem("1X");
        jComboBox1TipoPaamento.setSelectedItem("A Vista");
        jtClientes.setText("");
        jTextField2Produto.setText("");
        jTextField2Preco.setText("");
        jQtd.setText("");
        jTextField1ValorTotal.setText("");
    }
    
    
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
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaVendas().setVisible(true);
                } catch (ConexaoException ex) {
                    Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_CancelarVenda;
    private javax.swing.JButton botao_tela_inic2;
    private javax.swing.JButton botao_vender;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1AdicionarItens;
    private javax.swing.JButton jButton6PesquisaClientes;
    private javax.swing.JButton jButton7PesquisaProduto;
    private javax.swing.JComboBox<String> jComboBox1Parcelas;
    private javax.swing.JComboBox<String> jComboBox1TipoPaamento;
    private javax.swing.JFormattedTextField jFormattedTextField1DataVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jQtd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1Itens;
    private javax.swing.JTable jTable1Vendas;
    private javax.swing.JTextField jTextField1Codigo;
    private javax.swing.JTextField jTextField1ValorTotal;
    private javax.swing.JTextField jTextField2Preco;
    private javax.swing.JTextField jTextField2Produto;
    private javax.swing.JTextField jTextField6PesquisarProduto;
    private javax.swing.JTextField jtClientes;
    private javax.swing.JTextField jtPesquisaClientes;
    // End of variables declaration//GEN-END:variables
}
