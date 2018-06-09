/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.VendasJaExisteException;
import Model.DadosInvalidoException;
/**
 *
 * @author David
 */
public interface InterfaceVendas {
    
public void Cadastrar (Model.Vendas ven) throws VendasJaExisteException; 
public void Alterar (Model.Vendas ven) throws DadosInvalidoException;
public void Excluir (Model.Vendas ven) throws DadosInvalidoException; 
public void Pesquisar (Model.Vendas ven)throws DadosInvalidoException;

}
