/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 *
 * @author David
 */

// Exceção caso o cliente já se encontre cadastrado e tente realizar novamente o cadastro
public class ProdutoJaExisteException extends Exception{
    public ProdutoJaExisteException() { 
		super( "PRODUTO JÁ CADASTRADO"); 
    }
}
