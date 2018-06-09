/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author patricia
 */
public class Linha {
    
    private int id_linha;
    private String linha;

    public Linha() {
       
    }

    /**
     * @return the id_linha
     */
    public int getId_linha() {
        return id_linha;
    }

    /**
     * @param id_linha the id_linha to set
     */
    public void setId_linha(int id_linha) {
        this.id_linha = id_linha;
    }

    /**
     * @return the linha
     */
    public String getLinha() {
        return linha;
    }

    /**
     * @param linha the linha to set
     */
    public void setLinha(String linha) {
        this.linha = linha;
    }


}
