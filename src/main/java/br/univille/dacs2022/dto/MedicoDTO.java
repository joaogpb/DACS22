package br.univille.dacs2022.dto;

public class MedicoDTO {
    private Long Id;
    private String nome;

    private String CRM;

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