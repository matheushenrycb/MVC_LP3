/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento_class;

//import javax.persistence.MappedSuperclass;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

/**
 *
 * @author Matheus Henry
 */
@MappedSuperclass
public abstract class Pessoa {

    private String nome;
    private int idade;
    @Transient
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
