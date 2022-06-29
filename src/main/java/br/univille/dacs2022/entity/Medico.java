package br.univille.dacs2022.entity;

import java.util.List;
import java.util.ArrayList;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import com.fasterxml.classmate.GenericType;

@Entity
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(length = 500)
    private String nome;
    @Column(length = 4)
    private String CRM;
    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
    private List<Procedimento> listaProcedimentosdoMedico = new ArrayList();

    public String getCRM() {
        return CRM;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCRM(String cRM) {
        this.CRM = cRM;
    }

}
