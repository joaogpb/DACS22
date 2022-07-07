package br.univille.dacs2022.dto;

public class ProcedimentoDTO {
    private Long Id;
    private String Descricao;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}
