
package Conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class TestarConexao {
    
    public static void main(String[] args){
    
        IGerenciadorConexao conectar = ConectaBD.getInstancia();//Testa a conexão com o banco de dados
        System.out.println("Conexão aberta!!!");//Se a conexão com o banco foi realizada com sucesso, 
                                                //é informado que a conexão está aberta
        
    
    }       
}
