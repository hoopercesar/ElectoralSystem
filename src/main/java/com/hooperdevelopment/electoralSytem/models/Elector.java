package com.hooperdevelopment.electoralSytem.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="electores")
public class Elector {

    private Long id;
    private String nombre;
    private String correo;
    private String rut;
    private String region;
    private String comuna;
    private String candidato;
    private String informacion;

    @Column(name="id")
    @Id
    public Long getId() {
        return id;
    }
    @Column(name="id")
    @Id
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="nombre")
    public String getNombre() {
        return nombre;
    }

    @Column(name="nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name="correo")
    public String getCorreo() {
        return correo;
    }

    @Column(name="correo")
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Column(name="rut")
    public String getRut() {
        return rut;
    }

    @Column(name="rut")
    public void setRut(String rut) {
        this.rut = rut;
    }
    @Column(name="region")
    public String getRegion() {
        return region;
    }
    @Column(name="region")
    public void setRegion(String region) {
        this.region = region;
    }
    @Column(name="comuna")
    public String getComuna() {
        return comuna;
    }
    @Column(name="comuna")
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    @Column(name="candidato")
    public String getCandidato() {
        return candidato;
    }
    @Column(name="candidato")
    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }
    @Column(name="informacion")
    public String getInformacion() {
        return informacion;
    }
    @Column(name="informacion")
    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
}
