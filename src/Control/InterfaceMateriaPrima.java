/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.DadosInvalidoException;
import Model.ProdutoJaExisteException;

/**
 *
 * @author David
 */
public interface InterfaceMateriaPrima {
    
public void Cadastrar (Model.Produto pro) throws ProdutoJaExisteException ; 
public void Alterar (Model.Produto pro) throws DadosInvalidoException;
public void Excluir (Model.Produto pro) throws DadosInvalidoException; 
public void Consultar (Model.Produto pro)throws DadosInvalidoException;

}
