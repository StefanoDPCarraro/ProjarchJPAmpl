package br.pucrs.nomeusuario.exemplo.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Editora {
    @Id
    private long codigo;
    private String nome;
    
    public Editora(){
    }

    public Editora(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public long getCodigo() {
        return codigo;
    }
   
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
