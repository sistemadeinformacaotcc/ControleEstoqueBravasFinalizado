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
public class VendasJaExisteException extends Exception{
    public VendasJaExisteException() { 
		super( "VENDAS JÁ CADASTRADO"); 
    }
}
