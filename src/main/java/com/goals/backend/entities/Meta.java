package com.goals.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;
import java.util.List;

@Entity(name = "meta")
public class Meta extends Atividade{
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private List<SubMeta> subMeta;

    @Column(name = "prazo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prazo;

    @Column(name = "relevancia")
    private String relevancia;

    public Meta(){

    }
    public Meta(String nome, String objetivo, List<SubMeta> subMeta, Date prazo, String relevancia) {
        super(nome, objetivo);
        this.subMeta = subMeta;
        this.prazo = prazo;
        this.relevancia = relevancia;
    }

    public List<SubMeta> getSubMeta() {
        return subMeta;
    }

    public void setSubMeta(List<SubMeta> subMeta) {
        this.subMeta = subMeta;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public String getRelevancia() {
        return relevancia;
    }

    public void setRelevancia(String relevancia) {
        this.relevancia = relevancia;
    }
}
