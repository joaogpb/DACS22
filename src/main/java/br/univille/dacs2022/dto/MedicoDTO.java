package br.univille.dacs2022.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



public class MedicoDTO {
    private Long Id;
    @NotBlank(message = "O campo nome não pode ser deixado em branco")
    @NotNull
    private String nome;

    private String CRM;

    private List<ProcedimentoDTO> listaProcedimentos = new ArrayList<>();
    private long procedimentoId;

    public long getProcedimentoId() {
        return procedimentoId;
    }
    public void setProcedimentoId(long procedimentoId) {
        this.procedimentoId = procedimentoId;
    }
    public List<ProcedimentoDTO> getListaProcedimentos() {
        return listaProcedimentos;
    }
    public void setListaprocedimentos(List<ProcedimentoDTO> listaProcedimentos) {
        this.listaProcedimentos = listaProcedimentos;
    }
    

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

