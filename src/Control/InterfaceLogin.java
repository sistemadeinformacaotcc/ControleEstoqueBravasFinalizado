/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author patricia
 */
public interface InterfaceLogin {
    
public void Cadastrar (Model.ClassLogin log) throws Model.DadosInvalidoException; 
public void Alterar (Model.ClassLogin log) throws Model.DadosInvalidoException;
public void Excluir (Model.ClassLogin log) throws Model.DadosInvalidoException; 
public void Pesquisar (Model.ClassLogin log)throws Model.DadosInvalidoException;
}
