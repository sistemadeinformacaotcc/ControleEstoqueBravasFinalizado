
package Control;

import Conexao.ConectaBD;
import Conexao.ConexaoException;
import Conexao.DaoException;
import Conexao.IGerenciadorConexao;
import Model.DadosInvalidoException;
import Model.Linha;
import Model.SenhaInvalidaException;
import Model.UsuarioInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoLinha {
    
    private final IGerenciadorConexao g;//GerenciadorConexão é a interface da classe GerenciadorConxeao, 
                            //onde estão declarados os métodos conectar e desconectar com o banco
    ConectaBD conex = new ConectaBD();
    Linha linha = new Linha();

    public DaoLinha(){
        
        g =  ConectaBD.getInstancia();//GerenciadorConexao é a classe que se comunica com o banco; 
                                              //nesta classe estão o endereço, o usuário e a senha, 
                                              //bem como o método para instaciar a comunicação com o banco
    }
    //Método cadastrar usado para inserir dados na tabela funcionario do banco de dados projeto
    public void Cadastrar(Linha linha) throws ConexaoException, DaoException, DadosInvalidoException{
        
        Connection c = g.conectar();
        
        String sql = "INSERT INTO linha (linha) VALUES (?)";//Comando sql para inserir dados no 
        
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
           pstm.setString(1, linha.getLinha());
           pstm.execute();
        //Levantando a exceção quando o funcionario já existe
        } catch (SQLException e) {
            
            throw new DadosInvalidoException();
            
        } finally {
            g.desconectar();
        }
    }
    //Método listar usado para mostrar os dados de todos os campos da tabela funcionario inseridos no banco de dados, pelo método cadastrar
   public ArrayList<Linha> listar() throws DaoException, ConexaoException, DadosInvalidoException, UsuarioInvalidoException, SenhaInvalidaException{
       
        ArrayList<Linha> lista = new ArrayList<Linha>();
        Connection c = g.conectar();
        
        String sql = "SELECT * FROM linha";//Comando sql para listar dados no banco
        try {
            Statement stm = c.createStatement();
            ResultSet result = stm.executeQuery(sql);
            while (result.next()) {
                
                linha.setLinha(result.getString("linha"));
                
                lista.add(linha);
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
    public void Excluir(Linha linha) throws ConexaoException, DaoException, DadosInvalidoException{
        
        Connection c = g.conectar();
        String sql = "DELETE FROM linha WHERE linha=?";//Comando sql para excluir dados no banco
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, linha.getLinha());
            pstm.execute();
        //Levantando a exceção quando o cliente não existe
        } catch (SQLException e) {
            
            throw new DadosInvalidoException();
        
        } finally {
            g.desconectar();
        }
    }
    //Método alterar usado para alterar algum ou todos os dados de um funcionario, inseridos pelo método cadastrar no banco de dados
    public void Alterar(Linha linha) throws ConexaoException, DaoException, DadosInvalidoException{
        Connection c = g.conectar();
        String sql = "UPDATE linha SET linha=? WHERE linha=?";//Comando sql para alterar dados no banco
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            
            pstm.setString(1, linha.getLinha());
            pstm.execute();
        //Levantando a exceção quando o funcionario não existe
        } catch (SQLException e) {
            
            throw new DadosInvalidoException();
        
        } finally {
            g.desconectar();
        }
    }
    //Método consultar usado para consultar os dados de um funcionario, inseridos pelo método cadastrar no banco de dados
    public Linha Pesquisar(Linha linha) throws ConexaoException, DaoException, DadosInvalidoException, UsuarioInvalidoException, SenhaInvalidaException {
        Connection c = g.conectar();
        String sql = "SELECT * FROM linha WHERE linha=?";
        try{
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, linha.getLinha());
            ResultSet rs = pstm.executeQuery();
            if( rs.next() ){
                linha.setLinha(rs.getString("linha"));
                                
               }
            return linha;
            //Levantando a exceção quando o funcionarios não existe
        }catch(SQLException e){
            throw new DadosInvalidoException();
        }finally{
            g.desconectar();
        }   
    } 
   
    }