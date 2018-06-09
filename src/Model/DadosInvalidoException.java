/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 *
 * @author Borges
 */

//Exceção caso o funcionario deseje realizar manipulações da descrição
public class DadosInvalidoException extends Exception{
    
    public DadosInvalidoException(){
        super("DADOS INVALIDO!!!!");
    }
    
}
