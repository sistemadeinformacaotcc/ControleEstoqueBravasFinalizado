
package Conexao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import static java.sql.ResultSet.CONCUR_READ_ONLY;
import static java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConectaBD implements IGerenciadorConexao{
    
    private static IGerenciadorConexao instancia = null;
    public Connection con;
    private String url = "jdbc:mysql://localhost:3306/brava";
    private String usu = "root";
    private String pas = "1234";
    public Statement stm;
    public ResultSet rs;
  

    public static IGerenciadorConexao getInstancia(){
        if(instancia==null)
            instancia = new ConectaBD();
        return instancia;
    }

    
    public Connection conectar() throws ConexaoException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usu, pas);
        }catch(ClassNotFoundException e){
            throw new ConexaoException(e);
        }catch(SQLException e){
            throw new ConexaoException(e);
        }
        return con;
    }
public void executaSql(String Sql){
    try {
        stm = con.createStatement(TYPE_SCROLL_INSENSITIVE,CONCUR_READ_ONLY);
    rs = stm.executeQuery(Sql);
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Erro ao ExecutarSql:\n"+ ex.getMessage(), Sql, 0);
    }
}

    public void desconectar() throws ConexaoException {
        try {
            con.close();
        } catch (SQLException e) {
            throw new ConexaoException(e);
        }
    }


}
