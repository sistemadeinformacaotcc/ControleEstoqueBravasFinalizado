package View;

import Conexao.ConectaBD;
import Conexao.ConexaoException;
import Conexao.DaoException;
import Control.DaoClientes;
import Model.ModelTable;
import Model.Cliente;
import Model.DadosInvalidoException;
import Model.DataInvalidaException;
import Model.UsuarioJaExisteException;
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

public class TelaCadCliente extends javax.swing.JFrame {
    
    Cliente cl = new Cliente();
    DaoClientes dc = new DaoClientes();
    ConectaBD con = new ConectaBD();
    Cliente model_cl = new Cliente();
    int flag;
    
    public TelaCadCliente() throws ConexaoException, SQLException{
        initComponents();
        
        con.conectar();
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hoje = new Date();
        jFormattedTextField1DataCadastro.setText(df.format(hoje));
        jTextField2CodCliente.setEnabled(false);
       preecherTabelaCliente("select * from cliente order by codCliente");
       
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botao_gravar = new javax.swing.JButton();
        botao_Novo = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Cliente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jObservacao = new javax.swing.JTextField();
        jTextField2CodCliente = new javax.swing.JTextField();
        jTextField3Nome = new javax.swing.JTextField();
        jTextField4Logradouro = new javax.swing.JTextField();
        jTextField5Numero = new javax.swing.JTextField();
        jTextField6Cpf = new javax.swing.JTextField();
        jTextField7Complemento = new javax.swing.JTextField();
        jTextField8Email = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        botao_tela_inicial = new javax.swing.JButton();
        jTextField13Bairro = new javax.swing.JTextField();
        jTextField14Cidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField15Pesquisar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField1Uf = new javax.swing.JTextField();
        jFormattedTextField1Fone1 = new javax.swing.JFormattedTextField();
        jFormattedTextField1DataCadastro = new javax.swing.JFormattedTextField();
        botao_vendas = new javax.swing.JButton();
        jFormattedTextField2Fone2 = new javax.swing.JFormattedTextField();
        jFormattedTextField1Cep = new javax.swing.JFormattedTextField();
        jRadioButton1Cpf = new javax.swing.JRadioButton();
        jRadioButton2Nome = new javax.swing.JRadioButton();
        jButton1DadosCompleto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de clientes");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 8, -1, -1));

        jLabel2.setText("Codigo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 70, -1, -1));

        jLabel4.setText("Nº:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 101, -1, -1));

        botao_gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/gravar_registro.gif"))); // NOI18N
        botao_gravar.setToolTipText("Grava o registro");
        botao_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_gravarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_gravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 310, -1, -1));

        botao_Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/novo_registro.gif"))); // NOI18N
        botao_Novo.setToolTipText("Novo registro");
        botao_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_NovoActionPerformed(evt);
            }
        });
        getContentPane().add(botao_Novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 310, -1, -1));

        botao_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/alterar_registro.gif"))); // NOI18N
        botao_alterar.setToolTipText("Alterar");
        botao_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 310, -1, -1));

        jTable1Cliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1ClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1Cliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 369, 986, 222));

        jLabel7.setText("Endereço:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 101, -1, -1));

        jLabel9.setText("Bairro:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 132, -1, -1));

        jLabel10.setText("Complemento:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        jLabel11.setText("Cidade:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 132, -1, -1));

        jLabel12.setText("Cep:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 132, -1, -1));

        jLabel14.setText("CPF / CNPJ:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, -1, -1));

        jLabel15.setText("Telefone para contato:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        jLabel19.setText("E-mail:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 163, -1, -1));

        jLabel20.setText("Observação:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 251, -1, -1));

        jObservacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jObservacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 251, 772, 48));

        jTextField2CodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2CodClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2CodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 67, 110, -1));

        jTextField3Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3NomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 67, 540, -1));

        jTextField4Logradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4LogradouroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4Logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 98, 369, -1));

        jTextField5Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5NumeroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 98, 50, -1));

        jTextField6Cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6CpfActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6Cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 160, 220, -1));

        jTextField7Complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ComplementoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 98, 360, -1));

        jTextField8Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8EmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 160, 296, -1));

        jLabel16.setText("Telefone para contato:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 194, -1, 20));

        jLabel17.setText("Data cadastro:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        botao_tela_inicial.setText("Tela Inicial");
        botao_tela_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_tela_inicialActionPerformed(evt);
            }
        });
        getContentPane().add(botao_tela_inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 140, 33));

        jTextField13Bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13BairroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField13Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 129, 185, -1));

        jTextField14Cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14CidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField14Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 129, 200, -1));

        jLabel8.setText("Pesquisar:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, -1));

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
        getContentPane().add(jTextField15Pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 36, 240, -1));

        jLabel13.setText("UF:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 129, 20, 20));
        getContentPane().add(jTextField1Uf, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 129, 90, -1));

        try {
            jFormattedTextField1Fone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextField1Fone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 140, -1));

        jFormattedTextField1DataCadastro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jFormattedTextField1DataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 110, -1));

        botao_vendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/cifrao.png"))); // NOI18N
        botao_vendas.setText("Vendas");
        botao_vendas.setMaximumSize(new java.awt.Dimension(125, 41));
        botao_vendas.setMinimumSize(new java.awt.Dimension(125, 41));
        botao_vendas.setPreferredSize(new java.awt.Dimension(125, 41));
        botao_vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_vendasActionPerformed(evt);
            }
        });
        getContentPane().add(botao_vendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, 30));

        try {
            jFormattedTextField2Fone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextField2Fone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 140, -1));

        try {
            jFormattedTextField1Cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextField1Cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 120, -1));

        buttonGroup3.add(jRadioButton1Cpf);
        jRadioButton1Cpf.setSelected(true);
        jRadioButton1Cpf.setText("Cpf/Cnpj");
        getContentPane().add(jRadioButton1Cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 33, 80, 20));

        buttonGroup3.add(jRadioButton2Nome);
        jRadioButton2Nome.setText("Nome");
        getContentPane().add(jRadioButton2Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 33, 60, 20));

        jButton1DadosCompleto.setText("Dados Completo");
        jButton1DadosCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1DadosCompletoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1DadosCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 140, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/BackgroundCadCliente.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                                                                
    private void botao_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_alterarActionPerformed

        try{
        
        cl.setNome(jTextField3Nome.getText());  
        cl.setCpf_Cnpj(jTextField6Cpf.getText());
        cl.setLogradouro(jTextField4Logradouro.getText());
        cl.setNumero(jTextField5Numero.getText());
        cl.setComplemento(jTextField7Complemento.getText());
        cl.setBairro(jTextField13Bairro.getText());
        cl.setCep(jFormattedTextField1Cep.getText());
        cl.setMunicipio(jTextField14Cidade.getText());
        cl.setUf(jTextField1Uf.getText());
        cl.setFone1(jFormattedTextField1Fone1.getText());
        cl.setFone2(jFormattedTextField2Fone2.getText());
        cl.setEmail(jTextField8Email.getText());
        cl.setDataCadastro(jFormattedTextField1DataCadastro.getText());
        cl.setObservacao(jObservacao.getText());
        cl.setCodCliente(Integer.parseInt(jTextField2CodCliente.getText()));
            dc.Alterar(cl);
            
            JOptionPane.showMessageDialog(null, "Dados Alterado com Sucesso");
       
            preecherTabelaCliente("select * from cliente order by codCliente");
             limpar();
             
        } catch (ConexaoException ex) {
           JOptionPane.showMessageDialog(null, "Erro de Conexão");
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Modificar Dados");
        } catch (DadosInvalidoException ex) {
            JOptionPane.showMessageDialog(null, "Dados Invalidos");
        
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botao_alterarActionPerformed
        
    private void botao_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_gravarActionPerformed

        try{
       
        cl.setNome(jTextField3Nome.getText().trim());
        cl.setCpf_Cnpj(jTextField6Cpf.getText().trim());
        cl.setLogradouro(jTextField4Logradouro.getText().trim());
        cl.setNumero(jTextField5Numero.getText().trim());
        cl.setComplemento(jTextField7Complemento.getText().trim());
        cl.setBairro(jTextField13Bairro.getText().trim());
        cl.setCep(jFormattedTextField1Cep.getText().trim());
        cl.setMunicipio(jTextField14Cidade.getText().trim());
        cl.setUf(jTextField1Uf.getText().trim());
        cl.setFone1(jFormattedTextField1Fone1.getText().trim());
        cl.setFone2(jFormattedTextField2Fone2.getText().trim());
        cl.setEmail(jTextField8Email.getText().trim());
        cl.setDataCadastro(jFormattedTextField1DataCadastro.getText().trim());
        cl.setObservacao(jObservacao.getText().trim());
           
            dc.Cadastrar(cl);
        limpar();    
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso");
             preecherTabelaCliente("select * from cliente order by codCliente");
        } catch (ConexaoException ex) {
           JOptionPane.showMessageDialog(null, "Erro de Conexão");
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar");
        } catch (UsuarioJaExisteException ex) {
            JOptionPane.showMessageDialog(null, "Cliente Já Cadastrado");
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botao_gravarActionPerformed
    
    private void botao_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_NovoActionPerformed
    limpar();
    }//GEN-LAST:event_botao_NovoActionPerformed
                
    private void jObservacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jObservacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jObservacaoActionPerformed

    private void jTextField3NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3NomeActionPerformed

    private void jTextField4LogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4LogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4LogradouroActionPerformed

    private void jTextField5NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5NumeroActionPerformed

    private void jTextField6CpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6CpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6CpfActionPerformed

    private void jTextField7ComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ComplementoActionPerformed

    private void jTextField8EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8EmailActionPerformed

    private void botao_tela_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_tela_inicialActionPerformed
         dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_tela_inicialActionPerformed

    private void jTextField13BairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13BairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13BairroActionPerformed

    private void jTextField14CidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14CidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14CidadeActionPerformed

    private void jTextField15PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15PesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15PesquisarActionPerformed

    private void jTable1ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1ClienteMouseClicked
       
    }//GEN-LAST:event_jTable1ClienteMouseClicked

    private void jTextField15PesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15PesquisarKeyReleased
        // Fazer uma pesquisar no banco dados 
        
       if(jRadioButton2Nome.isSelected()){
         flag = 1;        
        try {
        cl.setNome(jTextField15Pesquisar.getText());
        
            dc.Pesquisar(cl);
            
        } catch (ConexaoException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Conexão");
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Pesquisa");
        } catch (DadosInvalidoException ex) {
            JOptionPane.showMessageDialog(null, "Dados Invalidos");
        } catch (DataInvalidaException ex) {
            JOptionPane.showMessageDialog(null, "Data Invalida");
        }
                
                jTextField3Nome.setText(model_cl.getNome());
                jTextField4Logradouro.setText(model_cl.getLogradouro());
                jTextField5Numero.setText(model_cl.getNumero());
                jTextField7Complemento.setText(model_cl.getComplemento());
                jTextField13Bairro.setText(model_cl.getBairro());
                jFormattedTextField1Cep.setText(model_cl.getCep());
                jTextField14Cidade.setText(model_cl.getMunicipio());
                jTextField1Uf.setText(model_cl.getUf());
                jFormattedTextField1Fone1.setText(model_cl.getFone1());
                jFormattedTextField2Fone2.setText(model_cl.getFone2());
                jTextField8Email.setText(model_cl.getEmail());
                jFormattedTextField1DataCadastro.setText(model_cl.getDataCadastro());
                jObservacao.setText(model_cl.getObservacao()); 
             
                try {
                 preecherTabelaCliente("select * from cliente where nome " + "like'%"+jTextField15Pesquisar.getText()+"%'");
             } catch (ConexaoException ex) {
                 Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
             }
           
      }else{
                 flag = 2;
             try {
                 preecherTabelaCliente("select * from cliente where cpf_Cnpj " + "like'%"+jTextField15Pesquisar.getText()+"%'");
             } catch (ConexaoException ex) {
                 Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
             }
       }
    }//GEN-LAST:event_jTextField15PesquisarKeyReleased

    private void botao_vendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_vendasActionPerformed

         try {
             TelaVendas tv = new TelaVendas();
             tv.setVisible(true);
         } catch (ConexaoException ex) {
             Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
         }
         dispose();
    }//GEN-LAST:event_botao_vendasActionPerformed

    private void jButton1DadosCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1DadosCompletoActionPerformed
        try{
            DadosCliente dd = new DadosCliente();
            dd.setVisible(true);
        } catch (ConexaoException ex) {
            Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jButton1DadosCompletoActionPerformed

    private void jTextField2CodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2CodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2CodClienteActionPerformed
public void preecherTabelaCliente(String Sql) throws ConexaoException, SQLException{
    ArrayList dados = new ArrayList();
    String [] colunas = new String[] {"CLIENTE","CPF/CNPJ","TELEFONE 1","TELEFONE 2"};
    con.conectar();
    con.executaSql(Sql);
       try{
                    
           con.rs.first();
               do
                    { dados.add(new Object[]{con.rs.getString("nome"),con.rs.getString("cpf_Cnpj"),con.rs.getString("fone1"),con.rs.getString("fone2")});
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
       jTable1Cliente.setModel(modelo);
       jTable1Cliente.getColumnModel().getColumn(0).setMaxWidth(500);
       jTable1Cliente.getColumnModel().getColumn(1).setMaxWidth(200);
       jTable1Cliente.getColumnModel().getColumn(2).setMaxWidth(200);
       jTable1Cliente.getColumnModel().getColumn(3).setMaxWidth(200);
       jTable1Cliente.getTableHeader().setReorderingAllowed(false);
       jTable1Cliente.setAutoResizeMode(jTable1Cliente.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
       jTable1Cliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       con.desconectar();
}

public void limpar(){
    
        
        jTextField3Nome.setText("");
        jTextField5Numero.setText("");
        jTextField13Bairro.setText("");
        jTextField14Cidade.setText("");
        jFormattedTextField1Cep.setText("");
        jTextField1Uf.setText("");
        jTextField6Cpf.setText("");
        jFormattedTextField1Fone1.setText("");
        jFormattedTextField2Fone2.setText("");
        jTextField7Complemento.setText("");
        jObservacao.setText("");
        jTextField8Email.setText("");
        jTextField4Logradouro.setText("");
        
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
                    new TelaCadCliente().setVisible(true);
                } catch (ConexaoException ex) {
                    Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_Novo;
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_gravar;
    private javax.swing.JButton botao_tela_inicial;
    private javax.swing.JButton botao_vendas;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1DadosCompleto;
    public javax.swing.JFormattedTextField jFormattedTextField1Cep;
    public javax.swing.JFormattedTextField jFormattedTextField1DataCadastro;
    public javax.swing.JFormattedTextField jFormattedTextField1Fone1;
    public javax.swing.JFormattedTextField jFormattedTextField2Fone2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField jObservacao;
    private javax.swing.JRadioButton jRadioButton1Cpf;
    private javax.swing.JRadioButton jRadioButton2Nome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1Cliente;
    public javax.swing.JTextField jTextField13Bairro;
    public javax.swing.JTextField jTextField14Cidade;
    private javax.swing.JTextField jTextField15Pesquisar;
    public javax.swing.JTextField jTextField1Uf;
    public javax.swing.JTextField jTextField2CodCliente;
    public javax.swing.JTextField jTextField3Nome;
    public javax.swing.JTextField jTextField4Logradouro;
    public javax.swing.JTextField jTextField5Numero;
    public javax.swing.JTextField jTextField6Cpf;
    public javax.swing.JTextField jTextField7Complemento;
    public javax.swing.JTextField jTextField8Email;
    // End of variables declaration//GEN-END:variables
    
}
