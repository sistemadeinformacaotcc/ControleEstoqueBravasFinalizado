
package Conexao;

import java.sql.SQLException;

public class DaoException extends Exception{
    
    public DaoException (SQLException e){
        super("DADOS JÁ EXISTE!!!");
    }
    
}
