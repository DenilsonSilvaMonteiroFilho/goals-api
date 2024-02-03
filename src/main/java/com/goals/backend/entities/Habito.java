package com.goals.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "habito")
public class Habito extends Atividade{

    /*Saber como sera implementado isso
    *pq tem que repetir com uma frequenci
    * determinada, inclusive ver se da pra
    * trocar o nome de ocorrencia pra frequencia*/
    @Column(name = "ocorrencia")
    private String ocorrencia;

    public Habito(){

    }
    public Habito(String nome, String objetivo, String ocorrencia) {
        super(nome, objetivo);
        this.ocorrencia = ocorrencia;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }
}
