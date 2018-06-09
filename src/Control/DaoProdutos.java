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
import Model.Produto;
import Model.ProdutoJaExisteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

 
public class DaoProdutos {
    
     private final IGerenciadorConexao g;//GerenciadorConexão é a interface da classe GerenciadorConxeao, 
                            //onde estão declarados os métodos conectar e desconectar com o banco
    ConectaBD conex = new ConectaBD();
     
    Produto pro = new Produto();
    
     public DaoProdutos(){
        
        g =  ConectaBD.getInstancia();//GerenciadorConexao é a classe que se comunica com o banco; 
                                              //nesta classe estão o endereço, o usuário e a senha, 
                                              //bem como o método para instaciar a comunicação com o banco
    }
    //Método cadastrar usado para inserir dados na tabela funcionario do banco de dados projeto
    public void Cadastrar(Produto pro) throws ConexaoException, DaoException, ProdutoJaExisteException {
        
        Connection c = g.conectar();
        
        String sql = "INSERT INTO produto ( codProdEntrada, produto, qtd, qtdMin) VALUES (?,?,?,?)";//Comando sql para inserir dados no 
        
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            
            pstm.setString(1, pro.getCodProdEntrada());
            pstm.setString(2, pro.getProduto());
            pstm.setDouble(3, pro.getQtd());
            pstm.setDouble(4, pro.getQtdMin());
           
            pstm.execute();
        //Levantando a exceção quando o funcionario já existe
        } catch (SQLException e) {
            
            throw new ProdutoJaExisteException();
            
        } finally {
            g.desconectar();
        }
    }
    //Método listar usado para mostrar os dados de todos os campos da tabela funcionario inseridos no banco de dados, pelo método cadastrar
   public ArrayList<Produto> listar() throws DaoException, ConexaoException, DadosInvalidoException{
       
        ArrayList<Produto> lista = new ArrayList<Produto>();
        Connection c = g.conectar();
        
        String sql = "SELECT * FROM produto";//Comando sql para listar dados no banco
        try {
            Statement stm = c.createStatement();
            ResultSet result = stm.executeQuery(sql);
            while (result.next()) {
                
                pro.setCodProdEntrada(result.getString("codProdEntrada"));
                pro.setProduto(result.getString("produto"));
                pro.setQtd(result.getDouble("qtd"));
                pro.setQtdMin(result.getDouble("qtdMin"));
                           
                lista.add(pro);
            }
            return lista;
            //Levantando a exceção quando o funcionario não existe
        } catch (SQLException e) {
            throw new DadosInvalidoException();
        } finally {
            g.desconectar();
        }
    }
   //Método excluir usado para excluir os dados de um funcionario, inseridos pelo método cadastrar no banco de dados
     public void Excluir(Produto Pro) throws ConexaoException, DaoException, DadosInvalidoException{
        
        Connection c = g.conectar();
        String sql = "DELETE FROM produto WHERE codProdEntrada=?";//Comando sql para excluir dados no banco
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, pro.getCodProdEntrada());
            pstm.execute();
        //Levantando a exceção quando o cliente não existe
        } catch (SQLException e) {
            
            throw new DadosInvalidoException();
        
        } finally {
            g.desconectar();
        }
    }
    //Método alterar usado para alterar algum ou todos os dados de um funcionario, inseridos pelo método cadastrar no banco de dados
    public void Alterar(Produto pro) throws ConexaoException, DaoException, DadosInvalidoException {
        Connection c = g.conectar();
        String sql = "UPDATE produto SET  produto=?, qtd=?, qtdMin=? WHERE codProdEntrada=?";//Comando sql para alterar dados no banco
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            
            pstm.setString(1, pro.getProduto());
            pstm.setDouble(2, pro.getQtd());
            pstm.setDouble(3, pro.getQtdMin());
            pstm.setString(4, pro.getCodProdEntrada());
            pstm.execute();
        //Levantando a exceção quando o funcionario não existe
        } catch (SQLException e) {
            
            throw new DadosInvalidoException();
        
        } finally {
            g.desconectar();
        }
    }
    //Método consultar usado para consultar os dados de um funcionario, inseridos pelo método cadastrar no banco de dados
    public Produto Pesquisar(Produto pro) throws ConexaoException, DaoException, DadosInvalidoException {
        Connection c = g.conectar();
        String sql = "SELECT * FROM produto WHERE produto=?";
        try{
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, pro.getCodProdEntrada());
            ResultSet rs = pstm.executeQuery();
            if( rs.next() ){
                
                pro.setCodProdEntrada(rs.getString("codProdEntrada"));
                pro.setQtd(rs.getDouble("qtd"));
                pro.setQtdMin(rs.getDouble("qtdMin"));
                
            }
            return pro;
            //Levantando a exceção quando o funcionarios não existe
        }catch(SQLException e){
            throw new DadosInvalidoException();
        }finally{
            g.desconectar();
        }   
    }   
}
