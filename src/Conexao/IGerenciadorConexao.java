
package Conexao;

import java.sql.Connection;

public interface IGerenciadorConexao {//Interface da classe GerenciadorConexão, onde estão declarados os métodos conectar e desconectar da classe GereciadorConexão
    
    public Connection conectar() throws ConexaoException;//Método conectar:quando começa uma operação, como cadastrar na tabela cliente,
                                                         //esse método conecta automaticamente com o banco de dados
    
    public void desconectar() throws ConexaoException;//Método desconectar:quando termina uma operação, como cadastrar na tabela cliente
                                                         //esse método desconecta automaticamente com o banco de dados
        
}
