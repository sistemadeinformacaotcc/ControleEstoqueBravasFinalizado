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


public class TelaRelaHistCompras extends javax.swing.JFrame {
    
    DaoRelatorios dr = new DaoRelatorios();
    ConectaBD con = new ConectaBD();
    
    public TelaRelaHistCompras() throws ConexaoException, SQLException{
        initComponents();
    con.conectar();
        //preecherHistCompras("select * from cliente c inner join vendas v on c.codCliente = v.id_Cliente inner join itensvendas_produto i on i.id_Venda = v.id_Venda inner join produtofinal p on p.codigo = i.id_ProdutoFinal where c.codCliente");
        preecherHistCompras("select * from cliente order by codCliente");
        jButton2GerarDescricao.setEnabled(false);
        jTextField1Nome.setEnabled(false);
       jTextField1Cpf.setEnabled(false);
       jButton1NovaPesquisa.setEnabled(false);
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        GerarRelPorData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botao_tela_inicial = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2GerarDescricao = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Nome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Compras = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField1Cpf = new javax.swing.JTextField();
        jButton1NovaPesquisa = new javax.swing.JButton();
        jRadioButton1Data = new javax.swing.JRadioButton();
        jRadioButton2Descrição = new javax.swing.JRadioButton();
        DATA_INICIO = new com.toedter.calendar.JDateChooser();
        DATA_FIM = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Relatório Histórico de Compras");
        setMinimumSize(new java.awt.Dimension(649, 377));
        setPreferredSize(new java.awt.Dimension(649, 377));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("a");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 10, 20));

        GerarRelPorData.setText("Gerar");
        GerarRelPorData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarRelPorDataActionPerformed(evt);
            }
        });
        getContentPane().add(GerarRelPorData, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("HISTÓRICO DE COMPRAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 11, -1, -1));

        botao_tela_inicial.setText("Tela Inicial");
        botao_tela_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_tela_inicialActionPerformed(evt);
            }
        });
        getContentPane().add(botao_tela_inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        jLabel2.setText("Período:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, -1, -1));

        jButton2GerarDescricao.setText("Gerar");
        jButton2GerarDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2GerarDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2GerarDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        jTextField1Nome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField1Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NomeActionPerformed(evt);
            }
        });
        jTextField1Nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1NomeKeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 290, -1));

        jTable1Compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1Compras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1ComprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1Compras);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 460, 170));

        jLabel5.setText("Cpf\\Cnpj:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jTextField1Cpf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField1Cpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1CpfKeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1Cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 190, -1));

        jButton1NovaPesquisa.setText("Nova Pesquisa");
        jButton1NovaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1NovaPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1NovaPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 120, -1));

        buttonGroup1.add(jRadioButton1Data);
        jRadioButton1Data.setSelected(true);
        jRadioButton1Data.setText("Data");
        jRadioButton1Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1DataActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        buttonGroup1.add(jRadioButton2Descrição);
        jRadioButton2Descrição.setText("Descrição");
        jRadioButton2Descrição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2DescriçãoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2Descrição, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));
        getContentPane().add(DATA_INICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 140, -1));
        getContentPane().add(DATA_FIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 140, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/BackgrounRelHistorCompras.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 650, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                                                                                            
    private void botao_tela_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_tela_inicialActionPerformed
          dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_tela_inicialActionPerformed

    private void jTextField1NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1NomeActionPerformed
        
    }//GEN-LAST:event_jTextField1NomeActionPerformed

    private void jButton2GerarDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2GerarDescricaoActionPerformed
        try {
            // Busca por Cliente Especifico
            
            con.conectar();
            
            dr.DaoRelatoriosHisCompras("select * from cliente c inner join vendas v on c.codCliente = v.id_Cliente inner join itensvendas_produto i on i.id_Venda = v.id_Venda inner join produtofinal p on p.codigo = i.id_ProdutoFinal where  c.cpf_Cnpj ="+jTextField1Cpf.getText());
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
                   
    }//GEN-LAST:event_jButton2GerarDescricaoActionPerformed

    private void GerarRelPorDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarRelPorDataActionPerformed

     //Select de Produto por data
      String dataInicio = new SimpleDateFormat("yyyy/MM/dd").format(DATA_INICIO.getDate());
     String dataFim = new SimpleDateFormat("yyyy/MM/dd").format(DATA_FIM.getDate());
         
     dr.DaoRelatoriosHisCompras("SELECT DATE_FORMAT(STR_TO_DATE(v.dataVenda,'%Y-%m-%d' ),'%d/%m/%Y')as dataVenda,i.*,v.id_venda,v.valorVenda,v.id_Cliente,v.tipoPagamento,v.parcelas,p.*,c.* from cliente c inner join vendas v on c.codCliente = v.id_Cliente inner join itensvendas_produto i on i.id_Venda = v.id_Venda inner join produtofinal p on p.codigo = i.id_ProdutoFinal where v.dataVenda between " +"('"+ dataInicio +"')" + " and " + "('"+ dataFim +"')"); 
       
    }//GEN-LAST:event_GerarRelPorDataActionPerformed

    private void jTable1ComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1ComprasMouseClicked
      if(jRadioButton2Descrição.isSelected()){
           String nome = "" + jTable1Compras.getValueAt(jTable1Compras.getSelectedRow(), 0);
        jTextField1Nome.setText(nome);
       
       String cpf_Cnpj = "" + jTable1Compras.getValueAt(jTable1Compras.getSelectedRow(), 1);
        jTextField1Cpf.setText(cpf_Cnpj);
        
       jTextField1Nome.setEnabled(false);
       jTextField1Cpf.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "O Botão Descrição não está selecionado");

      }
    }//GEN-LAST:event_jTable1ComprasMouseClicked

    private void jButton1NovaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1NovaPesquisaActionPerformed
       jTextField1Nome.setText("");
       jTextField1Cpf.setText("");
        jTextField1Nome.setEnabled(true);
       jTextField1Cpf.setEnabled(true);
       DATA_INICIO.setEnabled(false);
            DATA_FIM.setEnabled(false);
    }//GEN-LAST:event_jButton1NovaPesquisaActionPerformed

    private void jTextField1NomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1NomeKeyReleased
       
        try {
            preecherHistCompras("select * from cliente where nome " + "like'%"+jTextField1Nome.getText()+"%'");
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField1NomeKeyReleased

    private void jTextField1CpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1CpfKeyReleased
       try {
            preecherHistCompras("select * from cliente where cpf_Cnpj " + "like'%"+jTextField1Cpf.getText()+"%'");
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField1CpfKeyReleased

    private void jRadioButton1DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1DataActionPerformed
        if(jRadioButton1Data.isSelected()){
             DATA_INICIO.setEnabled(true);
            DATA_FIM.setEnabled(true); 
            jTextField1Nome.setEnabled(false);
            jTextField1Cpf.setEnabled(false);
            jButton2GerarDescricao.setEnabled(false);
             GerarRelPorData.setEnabled(true);
             jButton1NovaPesquisa.setEnabled(false);
             jTextField1Nome.setText("");
             jTextField1Cpf.setText("");
        }else{
            DATA_INICIO.setEnabled(false);
            DATA_FIM.setEnabled(false);
             jTextField1Nome.setEnabled(true);
            jTextField1Cpf.setEnabled(true);
           jButton2GerarDescricao.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton1DataActionPerformed

    private void jRadioButton2DescriçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2DescriçãoActionPerformed
       if(jRadioButton2Descrição.isSelected()){
           DATA_INICIO.setEnabled(false);
            DATA_FIM.setEnabled(false); 
           jTextField1Nome.setEnabled(true);
            jTextField1Cpf.setEnabled(true);
            GerarRelPorData.setEnabled(false);
            jButton2GerarDescricao.setEnabled(true);
            jButton1NovaPesquisa.setEnabled(true);
             DATA_INICIO.setDate(null);
             DATA_FIM.setDate(null);
        }else{
           DATA_INICIO.setEnabled(true);
            DATA_FIM.setEnabled(true); 
           jTextField1Nome.setEnabled(false);
            jTextField1Cpf.setEnabled(false);
            
        }
    }//GEN-LAST:event_jRadioButton2DescriçãoActionPerformed
 public void preecherHistCompras(String Sql) throws ConexaoException, SQLException{
    ArrayList dados = new ArrayList();
    String [] colunas = new String[] {"CLIENTE","CPF/CNPJ"};
    con.conectar();
    con.executaSql(Sql);
       try{
                    
           con.rs.first();
               do
                    { dados.add(new Object[]{con.rs.getString("nome"),con.rs.getString("cpf_Cnpj")});
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
       jTable1Compras.setModel(modelo);
       jTable1Compras.getColumnModel().getColumn(0).setMaxWidth(400);
       jTable1Compras.getColumnModel().getColumn(1).setMaxWidth(200);
       jTable1Compras.getTableHeader().setReorderingAllowed(false);
       jTable1Compras.setAutoResizeMode(jTable1Compras.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
       jTable1Compras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
                    new TelaRelaHistCompras().setVisible(true);
                } catch (ConexaoException ex) {
                    Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaRelaHistCompras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DATA_FIM;
    private com.toedter.calendar.JDateChooser DATA_INICIO;
    private javax.swing.JButton GerarRelPorData;
    private javax.swing.JButton botao_tela_inicial;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1NovaPesquisa;
    private javax.swing.JButton jButton2GerarDescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1Data;
    private javax.swing.JRadioButton jRadioButton2Descrição;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1Compras;
    private javax.swing.JTextField jTextField1Cpf;
    private javax.swing.JTextField jTextField1Nome;
    // End of variables declaration//GEN-END:variables
    
}
