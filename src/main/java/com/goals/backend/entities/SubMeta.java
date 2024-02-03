package com.goals.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity(name = "subMeta")
public class SubMeta extends Atividade{
    @Column(name = "prazo")
    private Date prazo;

    @Column(name = "concluido")
    private boolean isConcluido;

    public SubMeta() {
    }
    public SubMeta(String nome, String objetivo, Date prazo) {
        super(nome, objetivo);
        this.prazo = prazo;
        this.isConcluido = false;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public boolean isConcluido() {
        return isConcluido;
    }

    public void setConcluido(boolean concluido) {
        isConcluido = concluido;
    }
}
