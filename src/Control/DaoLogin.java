
package Control;

import Conexao.ConectaBD;
import Conexao.ConexaoException;
import Conexao.DaoException;
import Conexao.IGerenciadorConexao;
import Model.ClassLogin;
import Model.DadosInvalidoException;
import Model.SenhaInvalidaException;
import Model.UsuarioInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoLogin {
    
    private final IGerenciadorConexao g;//GerenciadorConexão é a interface da classe GerenciadorConxeao, 
                            //onde estão declarados os métodos conectar e desconectar com o banco
    ConectaBD conex = new ConectaBD();
    ClassLogin login = new ClassLogin();

    public DaoLogin(){
        
        g =  ConectaBD.getInstancia();//GerenciadorConexao é a classe que se comunica com o banco; 
                                              //nesta classe estão o endereço, o usuário e a senha, 
                                              //bem como o método para instaciar a comunicação com o banco
    }
    //Método cadastrar usado para inserir dados na tabela funcionario do banco de dados projeto
    public void Cadastrar(ClassLogin login) throws ConexaoException, DaoException, DadosInvalidoException{
        
        Connection c = g.conectar();
        
        String sql = "INSERT INTO login ( nome, usuario, senha) VALUES (?,?,?)";//Comando sql para inserir dados no 
        
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
           
           pstm.setString(1, login.getNome());
           pstm.setString(2, login.getUsuario());
           pstm.setString(3, login.getSenha());
           pstm.execute();
        //Levantando a exceção quando o funcionario já existe
        } catch (SQLException e) {
            
            throw new DadosInvalidoException();
            
        } finally {
            g.desconectar();
        }
    }
    //Método listar usado para mostrar os dados de todos os campos da tabela funcionario inseridos no banco de dados, pelo método cadastrar
   public ArrayList<ClassLogin> listar() throws DaoException, ConexaoException, DadosInvalidoException, UsuarioInvalidoException, SenhaInvalidaException{
       
        ArrayList<ClassLogin> lista = new ArrayList<ClassLogin>();
        Connection c = g.conectar();
        
        String sql = "SELECT * FROM login";//Comando sql para listar dados no banco
        try {
            Statement stm = c.createStatement();
            ResultSet result = stm.executeQuery(sql);
            while (result.next()) {
                login.setId_Login(result.getInt("id_login"));
                login.setNome(result.getString("nome"));
                login.setUsuario(result.getString("usuario"));
                login.setSenha(result.getString("senha"));
                
                lista.add(login);
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
    public void Excluir(ClassLogin login) throws ConexaoException, DaoException, DadosInvalidoException{
        
        Connection c = g.conectar();
        String sql = "DELETE FROM login WHERE id_login=?";//Comando sql para excluir dados no banco
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setInt(1, login.getId_Login());
            pstm.execute();
        //Levantando a exceção quando o cliente não existe
        } catch (SQLException e) {
            
            throw new DadosInvalidoException();
        
        } finally {
            g.desconectar();
        }
    }
    //Método alterar usado para alterar algum ou todos os dados de um funcionario, inseridos pelo método cadastrar no banco de dados
    public void Alterar(ClassLogin login) throws ConexaoException, DaoException, DadosInvalidoException{
        Connection c = g.conectar();
        String sql = "UPDATE login SET nome=?, usuario=?, senha=? WHERE id_login=?";//Comando sql para alterar dados no banco
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            
             pstm.setString(1, login.getNome());
            pstm.setString(2, login.getUsuario());
            pstm.setString(3, login.getSenha());
            pstm.setInt(4, login.getId_Login());
            pstm.execute();
        //Levantando a exceção quando o funcionario não existe
        } catch (SQLException e) {
            
            throw new DadosInvalidoException();
            
        } finally {
            g.desconectar();
        }
    }
    //Método consultar usado para consultar os dados de um funcionario, inseridos pelo método cadastrar no banco de dados
    public ClassLogin Pesquisar(ClassLogin login) throws ConexaoException, DaoException, DadosInvalidoException, UsuarioInvalidoException, SenhaInvalidaException {
        Connection c = g.conectar();
        String sql = "SELECT * FROM login WHERE nome=?";
        try{
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, login.getNome());
            ResultSet rs = pstm.executeQuery();
            if( rs.next() ){
                login.setId_Login(rs.getInt("id_login"));
                login.setUsuario(rs.getString("usuario"));
                login.setSenha(rs.getString("senha"));
                
               }
            return login;
            //Levantando a exceção quando o funcionarios não existe
        }catch(SQLException e){
            throw new DadosInvalidoException();
        }finally{
            g.desconectar();
        }   
    } 
   
    }