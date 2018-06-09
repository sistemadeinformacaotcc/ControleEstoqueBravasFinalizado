/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModelTable extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public ModelTable (ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);
        
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] nomes) {
        this.colunas = nomes;
    }
    //Contar o numero de colunas
    public int getColumnCount(){
        return colunas.length;
    }
    //Contar quantas linhavai ter nosso Array.
    public int getRowCount(){
        return linhas.size();
    }
    //Pega o nome da coluna
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    //Metodo que vai receber quantidades de linhas
    public Object getValueAt(int numLin, int numCol){
        Object[] linhas = (Object[])getLinhas().get(numLin);
        return linhas[numCol];
    }

}
