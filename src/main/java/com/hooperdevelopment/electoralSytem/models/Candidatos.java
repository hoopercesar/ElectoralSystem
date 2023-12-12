package com.hooperdevelopment.electoralSytem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="candidatos")
public class Candidatos {

    public Long id;
    public String candidato;
    public String region;
}
