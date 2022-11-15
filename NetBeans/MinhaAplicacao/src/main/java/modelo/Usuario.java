/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


/**
 *
 * @author mathe
 */
public class Usuario {
    
    
    package modelo;
public class Usuario {
    Long id;
    String nome;
    String cpf;
    String email;
    String sexo;
    String senha;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    } 
    public String getNome() { 
        return nome;
    } 
    public void setNome(String nome) { 
        this.nome = nome;
    } 
    public String getSexo() { 
        return sexo;
    } 
    public void setSexo(String sexo) { 
        this.sexo = sexo;
        
        public String getSenha() { 
        return senha;
    } 
    public void setSenha(String senha) { 
        this.senha = senha;
    } 

}
}
