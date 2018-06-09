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
import Model.ProdutoFinal;
import Model.ProdutoFinalJaExisteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

 
public class DaoProdutosFinal {
    
     private final IGerenciadorConexao g;//GerenciadorConexão é a interface da classe GerenciadorConxeao, 
                            //onde estão declarados os métodos conectar e desconectar com o banco
    ConectaBD conex = new ConectaBD();
     
    ProdutoFinal proF = new ProdutoFinal();
    
     public DaoProdutosFinal(){
        
        g =  ConectaBD.getInstancia();//GerenciadorConexao é a classe que se comunica com o banco; 
                                              //nesta classe estão o endereço, o usuário e a senha, 
                                              //bem como o método para instaciar a comunicação com o banco
    }
    //Método cadastrar usado para inserir dados na tabela funcionario do banco de dados projeto
    public void Cadastrar(ProdutoFinal proF) throws ConexaoException, ProdutoFinalJaExisteException  {
        
        Connection c = g.conectar();
        
        String sql = "INSERT INTO produtofinal ( codigo, produtoFinal, qdt_produtofinal, linha, qtdMinEstoque, status, precoUnitario ) VALUES (?,?,?,?,?,?,?)";//Comando sql para inserir dados no 
        
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            
            pstm.setInt(1, proF.getCodigo());
            pstm.setString(2, proF.getProdutoFinal());
            pstm.setDouble(3, proF.getQdt_ProdutoFinal());
            pstm.setString(4, proF.getLinha());
            pstm.setDouble(5, proF.getQtdMinEstoque());
            pstm.setString(6, proF.getStatus());
            pstm.setDouble(7, proF.getPrecoUnitario());
            pstm.execute();
        //Levantando a exceção quando o funcionario já existe
        } catch (SQLException e) {
            System.out.println("ERRRO"+e);
            throw new ProdutoFinalJaExisteException();
            
        } finally {
            g.desconectar();
        }
    }
    //Método listar usado para mostrar os dados de todos os campos da tabela funcionario inseridos no banco de dados, pelo método cadastrar
   public ArrayList<ProdutoFinal> listar() throws DaoException, ConexaoException,DadosInvalidoException, DataInvalidaException{
       
        ArrayList<ProdutoFinal> lista = new ArrayList<ProdutoFinal>();
        Connection c = g.conectar();
        
        String sql = "SELECT * FROM produtoFinal";//Comando sql para listar dados no banco
        try {
            Statement stm = c.createStatement();
            ResultSet result = stm.executeQuery(sql);
            while (result.next()) {
                
                proF.setCodigo(result.getInt("codigo"));
                proF.setProdutoFinal(result.getString("produtoFinal"));
                proF.setQdt_ProdutoFinal(result.getDouble("qdt_ProdutoFinal"));
                proF.setLinha(result.getString("linha"));
                proF.setQtdMinEstoque(result.getFloat("qtdMinEstoque"));
                proF.setStatus(result.getString("status"));
                proF.setPrecoUnitario(result.getDouble("precoUnitario"));               
                lista.add(proF);
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
     public void Excluir(ProdutoFinal ProF) throws ConexaoException, DaoException, DadosInvalidoException{
        
        Connection c = g.conectar();
        String sql = "DELETE FROM produtofinal WHERE codigo=?";//Comando sql para excluir dados no banco
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setInt(1, proF.getCodigo());
            pstm.execute();
        //Levantando a exceção quando o cliente não existe
        } catch (SQLException e) {
            
            throw new DadosInvalidoException();
        
        } finally {
            g.desconectar();
        }
    }
    //Método alterar usado para alterar algum ou todos os dados de um funcionario, inseridos pelo método cadastrar no banco de dados
    public void Alterar(ProdutoFinal proF) throws ConexaoException, DaoException, DadosInvalidoException {
        Connection c = g.conectar();
        String sql = "UPDATE produtofinal SET  produtoFinal=?, qdt_produtoFinal=?, linha=?, qtdMinEstoque=?, status=?, precoUnitario=? WHERE codigo=?";//Comando sql para alterar dados no banco
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            
            pstm.setString(1, proF.getProdutoFinal());
            pstm.setDouble(2, proF.getQdt_ProdutoFinal());
            pstm.setString(3, proF.getLinha());
            pstm.setFloat(4, proF.getQtdMinEstoque());
            pstm.setString(5, proF.getStatus());
            pstm.setDouble(6, proF.getPrecoUnitario());
            pstm.setInt(7, proF.getCodigo());
           
            pstm.execute();
            
        //Levantando a exceção quando o funcionario não existe
        } catch (SQLException e) {
            
            throw new DadosInvalidoException();
        
        } finally {
            g.desconectar();
        }
    }
    //Método consultar usado para consultar os dados de um funcionario, inseridos pelo método cadastrar no banco de dados
    public ProdutoFinal Pesquisar(ProdutoFinal proF) throws ConexaoException, DaoException, DadosInvalidoException, DataInvalidaException {
        Connection c = g.conectar();
        String sql = "SELECT * FROM produtoFinal WHERE codigo=?";
        try{
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setInt(1, proF.getCodigo());
            ResultSet rs = pstm.executeQuery();
            if( rs.next() ){
                
                proF.setCodigo(rs.getInt("codigo"));
                proF.setProdutoFinal(rs.getString("produto"));
                proF.setQdt_ProdutoFinal(rs.getDouble("qdt_ProdutoFinal"));
                proF.setLinha(rs.getString("linha"));
                proF.setQtdMinEstoque(rs.getFloat("qdtMinEstoque"));
                proF.setStatus(rs.getString("status"));
                proF.setPrecoUnitario(rs.getDouble("precoUnitario"));
                
            }
            return proF;
            //Levantando a exceção quando o funcionarios não existe
        }catch(SQLException e){
            throw new DadosInvalidoException();
        }finally{
            g.desconectar();
        }   
    }   
}
