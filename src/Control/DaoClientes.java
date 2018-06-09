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
import Model.UsuarioJaExisteException;
import Model.DadosInvalidoException;
import Model.DataInvalidaException;
import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author patricia
 */
public class DaoClientes {
    
    private final IGerenciadorConexao g;//GerenciadorConexão é a interface da classe GerenciadorConxeao, 
                            //onde estão declarados os métodos conectar e desconectar com o banco
    ConectaBD conex = new ConectaBD();
     
    Cliente cl = new Cliente();
    
     public DaoClientes(){
        
        g =  ConectaBD.getInstancia();//GerenciadorConexao é a classe que se comunica com o banco; 
                                              //nesta classe estão o endereço, o usuário e a senha, 
                                              //bem como o método para instaciar a comunicação com o banco
    }
    //Método cadastrar usado para inserir dados na tabela funcionario do banco de dados projeto
    public void Cadastrar(Cliente cl) throws ConexaoException, DaoException, UsuarioJaExisteException {
        
        Connection c = g.conectar();
        
        String sql = "INSERT INTO cliente (nome, cpf_Cnpj, logradouro, numero, complemento, bairro, cep, municipio, uf, fone1, fone2, email, dataCadastro, observacao) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";//Comando sql para inserir dados no 
        
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            
            pstm.setString(1, cl.getNome());
            pstm.setString(2, cl.getCpf_Cnpj());
            pstm.setString(3, cl.getLogradouro());
            pstm.setString(4, cl.getNumero());
            pstm.setString(5, cl.getComplemento());
            pstm.setString(6, cl.getBairro());
            pstm.setString(7, cl.getCep());
            pstm.setString(8, cl.getMunicipio());
            pstm.setString(9, cl.getUf());
            pstm.setString(10, cl.getFone1());
            pstm.setString(11, cl.getFone2());
            pstm.setString(12, cl.getEmail());
            pstm.setString(13, cl.getDataCadastro());
            pstm.setString(14, cl.getObservacao());
            pstm.execute();
        //Levantando a exceção quando o funcionario já existe
        } catch (SQLException e) {
            
            throw new UsuarioJaExisteException();
            
        } finally {
            g.desconectar();
        }
    }
    //Método listar usado para mostrar os dados de todos os campos da tabela funcionario inseridos no banco de dados, pelo método cadastrar
   public ArrayList<Cliente> listar() throws DaoException, ConexaoException,DadosInvalidoException, DataInvalidaException{
       
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        Connection c = g.conectar();
        
        String sql = "SELECT * FROM cliente";//Comando sql para listar dados no banco
        try {
            Statement stm = c.createStatement();
            ResultSet result = stm.executeQuery(sql);
            while (result.next()) {
                
                cl.setNome(result.getString("nome"));
                cl.setCpf_Cnpj(result.getString("cpf_Cnpj"));
                cl.setLogradouro(result.getString("logradouro"));
                cl.setNumero(result.getString("numero"));
                cl.setComplemento(result.getString("complemento"));
                cl.setBairro(result.getString("bairro"));
                cl.setCep(result.getString("cep"));
                cl.setMunicipio(result.getString("municipio"));
                cl.setUf(result.getString("uf"));
                cl.setFone1(result.getString("fone1"));
                cl.setFone2(result.getString("fone2"));
                cl.setEmail(result.getString("email"));
                cl.setDataCadastro(result.getString("dataCadastro"));
                cl.setObservacao(result.getString("observacao"));
               
                lista.add(cl);
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
     public void Excluir(Cliente cl) throws ConexaoException, DaoException, DadosInvalidoException{
        
        Connection c = g.conectar();
        String sql = "DELETE FROM cliente WHERE cpf_Cnpj=?";//Comando sql para excluir dados no banco
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, cl.getCpf_Cnpj());
            pstm.execute();
        //Levantando a exceção quando o cliente não existe
        } catch (SQLException e) {
            
            throw new DadosInvalidoException();
        
        } finally {
            g.desconectar();
        }
    }
    //Método alterar usado para alterar algum ou todos os dados de um funcionario, inseridos pelo método cadastrar no banco de dados
    public void Alterar(Cliente cl) throws ConexaoException, DaoException, DadosInvalidoException{
        Connection c = g.conectar();
        String sql = "UPDATE cliente SET  nome=?, cpf_Cnpj=?, logradouro=?, numero=?, complemento=?, bairro=?, cep=?, municipio=?, uf=?, fone1=?, fone2=?, email=?, dataCadastro=?, observacao=? WHERE codCliente=?";//Comando sql para alterar dados no banco
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            
            pstm.setString(1, cl.getNome());
            pstm.setString(2, cl.getCpf_Cnpj());
            pstm.setString(3, cl.getLogradouro());
            pstm.setString(4, cl.getNumero());
            pstm.setString(5, cl.getComplemento());
            pstm.setString(6, cl.getBairro());
            pstm.setString(7, cl.getCep());
            pstm.setString(8, cl.getMunicipio());
            pstm.setString(9, cl.getUf());
            pstm.setString(10, cl.getFone1());
            pstm.setString(11, cl.getFone2());
            pstm.setString(12, cl.getEmail());
            pstm.setString(13, cl.getDataCadastro());
            pstm.setString(14, cl.getObservacao());
            pstm.setInt(15, cl.getCodCliente());
            pstm.execute();
            
        //Levantando a exceção quando o funcionario não existe
        } catch (SQLException e) {
            
            throw new DadosInvalidoException();
        
        } finally {
            g.desconectar();
        }
    }
    //Método consultar usado para consultar os dados de um funcionario, inseridos pelo método cadastrar no banco de dados
    public Cliente Pesquisar(Cliente cl) throws ConexaoException, DaoException, DadosInvalidoException, DataInvalidaException {
        Connection c = g.conectar();
        String sql = "SELECT * FROM cliente WHERE cpf_Cnpj=?";
        try{
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, cl.getCpf_Cnpj());
            ResultSet rs = pstm.executeQuery();
            if( rs.next() ){
                
                cl.setCodCliente(rs.getInt("codCliente") );
                cl.setNome(rs.getString("nome") );
                cl.setLogradouro(rs.getString("logradouro") );
                cl.setNumero(rs.getString("numero") );
                cl.setComplemento(rs.getString("complemento") );
                cl.setBairro(rs.getString("bairro"));
                cl.setCep(rs.getString("cep") );
                cl.setMunicipio(rs.getString("municipio") );
                cl.setUf(rs.getString("uf") );
                cl.setFone1(rs.getString("fone1") );
                cl.setFone2(rs.getString("fone2"));
                cl.setEmail(rs.getString("email") );
                cl.setDataCadastro(rs.getString("dataCadastro") );
                cl.setObservacao(rs.getString("observacao") );
                
            }
            return cl;
            //Levantando a exceção quando o funcionarios não existe
        }catch(SQLException e){
            throw new DadosInvalidoException();
        }finally{
            g.desconectar();
        }   
    }   
}
