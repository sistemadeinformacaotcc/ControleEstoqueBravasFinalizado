/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Conexao.ConectaBD;
import Conexao.ConexaoException;
import Conexao.DaoException;
import Conexao.IGerenciadorConexao;
import Model.DadosInvalidoException;
import Model.DataInvalidaException;
import Model.Vendas;
import Model.VendasJaExisteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author patricia
 */
public class DaoVendas {
    
     private final IGerenciadorConexao g;//GerenciadorConexão é a interface da classe GerenciadorConxeao, 
                            //onde estão declarados os métodos conectar e desconectar com o banco
    ConectaBD conex = new ConectaBD();
    int codProduto, codCliente; 
    Vendas ven = new Vendas();
    
     public DaoVendas(){
        
        g =  ConectaBD.getInstancia();//GerenciadorConexao é a classe que se comunica com o banco; 
                                              //nesta classe estão o endereço, o usuário e a senha, 
                                              //bem como o método para instaciar a comunicação com o banco
    }
     
     
//Método cadastrar usado para inserir dados na tabela funcionario do banco de dados projeto
    
     public void AdicionaItem(Vendas ven) throws ConexaoException, SQLException{
             AcharCodProduto(ven.getProduto());
           conex.conectar();
     try{
         String sql =("insert into itensVendas_Produto (id_Venda, id_produtoFinal, qtd_produto) values (?,?,?)");
         
         PreparedStatement pstm = conex.con.prepareStatement(sql);
         pstm.setInt(1, ven.getId_Venda());
         pstm.setInt(2, codProduto);
         pstm.setDouble(3, ven.getQtd());
         pstm.execute();
            JOptionPane.showMessageDialog(null,"Produto Adicionado!");
            
                //Realizando baixa estoque
            double qtdVenda = 0, resul =0;
        conex.executaSql("select * from produtoFinal where produtoFinal='"+ven.getProduto()+"'");
                conex.rs.first();
                qtdVenda = conex.rs.getDouble("qdt_produtoFinal");
                resul = qtdVenda - ven.getQtd();
                pstm = conex.con.prepareStatement("update produtofinal set qdt_produtoFinal=? where produtoFinal=?");
                pstm.setDouble(1, resul);
                pstm.setString(2, ven.getProduto());
                pstm.execute();
                
     } catch (SQLException ex) {
         
         JOptionPane.showMessageDialog(null,"Erro ao Adicionar Produto!");
}
     conex.desconectar();
     }


     public void AcharCodProduto(String Produto) throws ConexaoException, SQLException{
             conex.conectar();
         conex.executaSql("select  * from produtofinal where produtoFinal='"+ Produto+"'");
         try {
             conex.rs.first();
             codProduto = conex.rs.getInt("codigo");
         conex.desconectar();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Achar Produto!\nERRO:" + ex);
         conex.desconectar();
         }
         
     }
     public void achaClientes(String cliente) throws ConexaoException{
         conex.conectar();
         conex.executaSql("select * from cliente where nome='"+cliente+"'");
         try{
         conex.rs.first();
         codCliente = conex.rs.getInt("codCliente");                              
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Achar Cliente!\nERRO:" + ex);
         conex.desconectar();
         }
     }
     
     public void FechaVenda(Vendas ven) throws ConexaoException, DaoException, VendasJaExisteException {
         achaClientes(ven.getCliente());
       conex.conectar();
       //Comando sql para os dados e fechar a venda  
        String sql = "update vendas set dataVenda=?, valorVenda=?, id_Cliente=?, tipoPagamento=?, parcelas=? where id_venda=?";
        
        try {
            PreparedStatement pstm = conex.con.prepareStatement(sql);
            
            pstm.setString(1, ven.getDataVenda());
            pstm.setDouble(2, ven.getValorVenda());
            pstm.setInt(3, codCliente);
            pstm.setString(4, ven.getTipoPagamento());
            pstm.setString(5, ven.getParcelas());
            pstm.setInt(6, ven.getId_Venda());              
            pstm.execute();
            
            JOptionPane.showMessageDialog(null,"Venda Finalizada!");
        
//Levantando a exceção quando venda não realiza venda
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar venda!\nERRO:" + ex);
         conex.desconectar();
        }
    }
      public void CancelarVenda() throws ConexaoException{
            
                conex.conectar();// Restituindo quantidade de venda cancelada
                PreparedStatement pst;
                conex.executaSql("select * from vendas v inner join itensvendas_produto i on v.id_venda = i.id_venda inner join produtofinal p on p.codigo = i.id_produtoFinal where v.valorVenda=0");
                double soma;
                double qtdProd;
                double qtdVend;
                int codVenda;
                try{
                conex.rs.first();
                do{
                    qtdProd = conex.rs.getDouble("qdt_ProdutoFinal");
                    qtdVend = conex.rs.getDouble("qtd_produto");
                    soma = qtdProd + qtdVend;
                    
                    pst = conex.con.prepareStatement("update produtofinal set qdt_ProdutoFinal=? where codigo=?");
                    pst.setDouble(1, soma);
                    pst.setDouble (2, conex.rs.getDouble("codigo"));
                    pst.execute();
                    // apagando venda cancelada no sistema 
                    pst = conex.con.prepareStatement("delete from itensvendas_produto where id_Venda=?");
                    pst.setInt(1, conex.rs.getInt("id_Venda"));
                    pst.execute();
                   
                }while(conex.rs.next());
                pst = conex.con.prepareStatement ("delete from vendas where valorVenda=?");
                pst.setDouble(1, 0);
                pst.execute();
                  
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao cancelar a venda!");
                    
            }
            conex.desconectar();
            }
      
    //Método consultar usado para consultar os dados de um funcionario, inseridos pelo método cadastrar no banco de dados
    public Vendas Pesquisar(Vendas ven) throws ConexaoException, DaoException, DadosInvalidoException, DataInvalidaException {
        Connection c = g.conectar();
        String sql = "SELECT * FROM vendas WHERE id_venda=?";
        try{
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, ven.getCpf_Cnpj());
            ResultSet rs = pstm.executeQuery();
            if( rs.next() ){
                
                ven.setId_Venda(rs.getInt("id_Venda"));                
                ven.setCliente(rs.getString("cliente"));
                ven.setDataVenda(rs.getString("dataVenda"));
                ven.setValorVenda(rs.getDouble("valorVenda"));
                ven.setTipoPagamento(rs.getString("tipoPagamento"));
                ven.setParcelas(rs.getString("parcelas"));
                
            }
            return ven;
            //Levantando a exceção quando o funcionarios não existe
        }catch(SQLException e){
            throw new DadosInvalidoException();
        }finally{
            g.desconectar();
        }   
    }
    
    
}
