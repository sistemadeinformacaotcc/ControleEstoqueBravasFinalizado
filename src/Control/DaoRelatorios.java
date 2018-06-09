/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Conexao.ConectaBD;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author patricia
 */
public class DaoRelatorios {
    
   
    ConectaBD con = new ConectaBD();

   //Metodo de Historio Historico Compras   OK
 public void DaoRelatoriosHisCompras(String Sql){
  try 
  {
      con.conectar();
      con.executaSql(Sql);
      JRResultSetDataSource relatResul = new JRResultSetDataSource(con.rs);
      JasperPrint jasperPrint = JasperFillManager.fillReport("D:\\Projeto\\ControleEstoqueBravasFinalizado\\Relatorios\\relhistcompras.jasper", new HashMap(), relatResul);
      JasperViewer jv = new JasperViewer(jasperPrint, false); //false para nao fechar o form
      jv.setVisible(true);
  } catch (Exception ex){
      
             JOptionPane.showMessageDialog(null,"deu erro ="+ex);
   }
  
}
 //Metodo de Inventario produto final
 public void DaoRelatoriosInventProdFinal(String Sql){
  try 
  {
      con.conectar();
      con.executaSql(Sql);
      JRResultSetDataSource relatResul = new JRResultSetDataSource(con.rs);
      JasperPrint jasperPrint = JasperFillManager.fillReport("D:\\Projeto\\ControleEstoqueBravasFinalizado\\Relatorios\\relinventprodufinal.jasper", new HashMap(), relatResul);
      JasperViewer jv = new JasperViewer(jasperPrint, false); //false para nao fechar o form
      jv.setVisible(true);
  } catch (Exception ex){
      
             JOptionPane.showMessageDialog(null,"deu erro ="+ex);
   }
 }
 //Metodo Relatorio Inventario Materia Prima
public void DaoRelatoriosInventMatPrima(String Sql){
   try 
  {
      con.conectar();
      con.executaSql(Sql);
      JRResultSetDataSource relatResul = new JRResultSetDataSource(con.rs);
      JasperPrint jasperPrint = JasperFillManager.fillReport("D:\\Projeto\\ControleEstoqueBravasFinalizado\\Relatorios\\relinventmatprima.jasper", new HashMap(), relatResul);
      JasperViewer jv = new JasperViewer(jasperPrint, false); //false para nao fechar o form
      jv.setVisible(true);
  } catch (Exception ex){
      
             JOptionPane.showMessageDialog(null,"deu erro ="+ex);
   }
}
  public static void main (String args[]) 
  {
    new DaoRelatorios(); 
  }
  
  
  
}



