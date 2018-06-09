/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author David
 */
public interface InterfaceCliente {
    
public void Cadastrar (Model.Cliente cl) throws Model.UsuarioJaExisteException; 
public void Alterar (Model.Cliente cl) throws Model.DadosInvalidoException;
public void Excluir (Model.Cliente cl) throws Model.DadosInvalidoException; 
public void Pesquisar (Model.Cliente cl)throws Model.DadosInvalidoException;

}
