/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author patricia
 */
public class ClassLogin {
    
    private int id_Login;
    private String nome;
    private String usuario;
    private String senha;
   
    public ClassLogin(){
    
}

    /**
     * @return the id_Login
     */
    public int getId_Login() {
        return id_Login;
    }

    /**
     * @param id_Login the id_Login to set
     */
    public void setId_Login(int id_Login) {
        this.id_Login = id_Login;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

   
}
