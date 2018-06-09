/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;

/**
 *
 * @author patricia
 */
public class ProdutoFinal {
    
    private int codigo;
    private String produtoFinal;
    private Double qdt_ProdutoFinal;
    private String linha;
    private Double precoUnitario;
    private float qtdMinEstoque;
    private String status;
    private String observacao;
    
    public ProdutoFinal(){
    
}

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the produtoFinal
     */
    public String getProdutoFinal() {
        return produtoFinal;
    }

    /**
     * @param produtoFinal the produtoFinal to set
     */
    public void setProdutoFinal(String produtoFinal) {
        this.produtoFinal = produtoFinal;
    }

    /**
     * @return the qtd_ProdutoFinal
     */
    public Double getQdt_ProdutoFinal() {
        return qdt_ProdutoFinal;
    }

    /**
     * @param qtd_ProdutoFinal the qtd_ProdutoFinal to set
     */
    public void setQdt_ProdutoFinal(Double qdt_ProdutoFinal) {
        this.qdt_ProdutoFinal = qdt_ProdutoFinal;
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

    /**
     * @return the precoUnitario
     */
    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    /**
     * @param precoUnitario the precoUnitario to set
     */
    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    /**
     * @return the qtdMinEstoque
     */
    public float getQtdMinEstoque() {
        return qtdMinEstoque;
    }

    /**
     * @param qtdMinEstoque the qtdMinEstoque to set
     */
    public void setQtdMinEstoque(float qtdMinEstoque) {
        this.qtdMinEstoque = qtdMinEstoque;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
