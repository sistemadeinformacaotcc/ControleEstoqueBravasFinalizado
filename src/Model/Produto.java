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
public class Produto {
    
    private String codProdEntrada;
    private String produto;
    private Double qtd;
    private Double qtdMin;
    private String observacao;
    
    public Produto(){

}

    public Produto(String codProdEntrada, String produto, Double qtd, Double qtdMin, String observacao) {
        this.codProdEntrada = codProdEntrada;
        this.produto = produto;
        this.qtd = qtd;
        this.qtdMin = qtdMin;
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Produto{" + "codProdEntrada=" + codProdEntrada + ", produto=" + produto + ", qtd=" + qtd + ", qtdMin=" + qtdMin + ", observacao=" + observacao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.codProdEntrada);
        hash = 23 * hash + Objects.hashCode(this.produto);
        hash = 23 * hash + Objects.hashCode(this.qtd);
        hash = 23 * hash + Objects.hashCode(this.qtdMin);
        hash = 23 * hash + Objects.hashCode(this.observacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.codProdEntrada, other.codProdEntrada)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.observacao, other.observacao)) {
            return false;
        }
        if (!Objects.equals(this.qtd, other.qtd)) {
            return false;
        }
        if (!Objects.equals(this.qtdMin, other.qtdMin)) {
            return false;
        }
        return true;
    }

    public String getCodProdEntrada() {
        return codProdEntrada;
    }

    public void setCodProdEntrada(String codProdEntrada) {
        this.codProdEntrada = codProdEntrada;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getQtd() {
        return qtd;
    }

    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }

    public Double getQtdMin() {
        return qtdMin;
    }

    public void setQtdMin(Double qtdMin) {
        this.qtdMin = qtdMin;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
}
