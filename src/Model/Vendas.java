/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author patricia
 */
public class Vendas {
    
    private int id_Venda;
    private String produto;
    private String cliente;
    private String cpf_Cnpj;
    private String linha;
    private String dataVenda;
    private Double valorVenda;
    private String tipoPagamento;
    private String parcelas;
    private Double qtd;
    private Double precoTotal;

    public Vendas(){
        
    }

    /**
     * @return the id_Venda
     */
    public int getId_Venda() {
        return id_Venda;
    }

    /**
     * @param id_Venda the id_Venda to set
     */
    public void setId_Venda(int id_Venda) {
        this.id_Venda = id_Venda;
    }

    /**
     * @return the produto
     */
    public String getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(String produto) {
        this.produto = produto;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the cpf_Cnpj
     */
    public String getCpf_Cnpj() {
        return cpf_Cnpj;
    }

    /**
     * @param cpf_Cnpj the cpf_Cnpj to set
     */
    public void setCpf_Cnpj(String cpf_Cnpj) {
        this.cpf_Cnpj = cpf_Cnpj;
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
     * @return the dataVenda
     */
    public String getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the valorVenda
     */
    public Double getValorVenda() {
        return valorVenda;
    }

    /**
     * @param valorVenda the valorVenda to set
     */
    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    /**
     * @return the tipoPagamento
     */
    public String getTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * @param tipoPagamento the tipoPagamento to set
     */
    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    /**
     * @return the parcelas
     */
    public String getParcelas() {
        return parcelas;
    }

    /**
     * @param parcelas the parcelas to set
     */
    public void setParcelas(String parcelas) {
        this.parcelas = parcelas;
    }

    /**
     * @return the qtd
     */
    public Double getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the precoTotal
     */
    public Double getPrecoTotal() {
        return precoTotal;
    }

    /**
     * @param precoTotal the precoTotal to set
     */
    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    
}
